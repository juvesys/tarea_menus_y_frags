package android.app.docrom.com.petagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private ImageView cincoEstrellas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Toolbar miActionbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cincoEstrellas = (ImageView) findViewById(R.id.ivCincoEstrellas);
        cincoEstrellas.setVisibility(View.INVISIBLE);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas2);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();


        mascotas.add(new Mascota(R.drawable.cinco,"Dharma",4));
        mascotas.add(new Mascota(R.drawable.cuatro,"Toby",5));
        mascotas.add(new Mascota(R.drawable.tres,"Rocky",2));
        mascotas.add(new Mascota(R.drawable.dos,"Cooper",3));
        mascotas.add(new Mascota(R.drawable.uno,"Lucky",6));




    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void btnCincoEstrellas(View v){
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(intent);
    }
}
