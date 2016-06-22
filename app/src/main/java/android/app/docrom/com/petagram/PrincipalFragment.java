package android.app.docrom.com.petagram;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.app.docrom.com.petagram.R;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrincipalFragment extends Fragment {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;


    public PrincipalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_principal, container, false);
        // Inflate the layout for this fragment


        listaMascotas = (RecyclerView)v.findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.uno,"Lucky",6));
        mascotas.add(new Mascota(R.drawable.dos,"Cooper",3));
        mascotas.add(new Mascota(R.drawable.tres,"Rocky",2));
        mascotas.add(new Mascota(R.drawable.cuatro,"Toby",5));
        mascotas.add(new Mascota(R.drawable.cinco,"Dharma",4));
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }





}
