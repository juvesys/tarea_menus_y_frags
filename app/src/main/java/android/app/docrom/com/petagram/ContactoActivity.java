package android.app.docrom.com.petagram;

import android.app.docrom.com.petagram.correo.Mail;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;


public class ContactoActivity extends AppCompatActivity {
    private ImageView cincoEstrellas;

    private Button botonEnviar;
    private EditText nombre;
    private EditText correo;
    private EditText mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        Toolbar miActionbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cincoEstrellas = (ImageView) findViewById(R.id.ivCincoEstrellas);
        cincoEstrellas.setVisibility(View.INVISIBLE);

        botonEnviar = (Button)findViewById(R.id.bnEnviarCorreo);
        nombre      = (EditText)findViewById(R.id.etNombreContacto);
        correo      = (EditText)findViewById(R.id.etCorreoContacto);
        mensaje     = (EditText)findViewById(R.id.etMensajeContacto);


        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarCorreo();
            }
        });
    }

    public void enviarCorreo(){
        //Getting content for email
        String email = correo.getText().toString().trim();
        String subject = nombre.getText().toString().trim();
        String message = mensaje.getText().toString().trim();

        //Creating SendMail object
        SendMail sm = new SendMail(this, email, subject, message);

        //Executing sendmail to send email
        sm.execute();
    }

}
