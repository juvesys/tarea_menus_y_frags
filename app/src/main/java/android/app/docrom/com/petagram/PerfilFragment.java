package android.app.docrom.com.petagram;


import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.docrom.com.petagram.R;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {
    ArrayList<Perfil> perfiles;
    private RecyclerView listaPerfiles;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);
        // Inflate the layout for this fragment

        //extraemos el drawable en un bitmap
        Drawable originalDrawable = getResources().getDrawable(R.drawable.dos);
        Bitmap originalBitmap = ((BitmapDrawable) originalDrawable).getBitmap();

        //creamos el drawable redondeado
        RoundedBitmapDrawable roundedDrawable =
                RoundedBitmapDrawableFactory.create(getResources(), originalBitmap);

        //asignamos el CornerRadius
        roundedDrawable.setCornerRadius(originalBitmap.getHeight());

        ImageView imageView = (ImageView) v.findViewById(R.id.ivPerfil);

        imageView.setImageDrawable(roundedDrawable);


        listaPerfiles = (RecyclerView)v.findViewById(R.id.rvPerfiles);

        /*LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);*/



        listaPerfiles.setLayoutManager(new GridLayoutManager(getActivity(),3));

        inicializarListaPerfiles();
        inicializarAdaptador();

        return v;
    }

    public void inicializarListaPerfiles(){
        perfiles = new ArrayList<Perfil>();

        perfiles.add(new Perfil(R.drawable.uno,6));
        perfiles.add(new Perfil(R.drawable.dos,3));
        perfiles.add(new Perfil(R.drawable.tres,2));
        perfiles.add(new Perfil(R.drawable.cuatro,5));
        perfiles.add(new Perfil(R.drawable.cinco,4));
        perfiles.add(new Perfil(R.drawable.uno,6));
        perfiles.add(new Perfil(R.drawable.dos,3));
        perfiles.add(new Perfil(R.drawable.tres,2));
        perfiles.add(new Perfil(R.drawable.cuatro,5));
        perfiles.add(new Perfil(R.drawable.cinco,4));
        perfiles.add(new Perfil(R.drawable.dos,3));
        perfiles.add(new Perfil(R.drawable.uno,6));
    }

    public void inicializarAdaptador(){
        PerfilAdaptador adaptador = new PerfilAdaptador(perfiles);
        listaPerfiles.setAdapter(adaptador);
    }

}
