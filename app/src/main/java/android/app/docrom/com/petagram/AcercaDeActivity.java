package android.app.docrom.com.petagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class AcercaDeActivity extends AppCompatActivity {
    private ImageView cincoEstrellas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        Toolbar miActionbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cincoEstrellas = (ImageView) findViewById(R.id.ivCincoEstrellas);
        cincoEstrellas.setVisibility(View.INVISIBLE);


    }

}
