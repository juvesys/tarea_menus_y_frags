package android.app.docrom.com.petagram;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alanm on 19/06/2016.
 */
public class PerfilAdaptador extends RecyclerView.Adapter<PerfilAdaptador.PerfilViewHolder> {

    ArrayList<Perfil> perfiles;

    public PerfilAdaptador(ArrayList<Perfil> perfiles){
        this.perfiles = perfiles;
    }

    @Override
    public PerfilAdaptador.PerfilViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_perfil, parent, false);
        return new PerfilViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PerfilAdaptador.PerfilViewHolder holder, int position) {
        final Perfil perfil = perfiles.get(position);
        holder.ivPerroPerfil.setImageResource(perfil.getFotoPerro());
        holder.tvConteoLikesPerfil.setText(String.valueOf(perfil.getConteoLikes()));
    }

    @Override
    public int getItemCount() {return perfiles.size();}

        public class PerfilViewHolder extends RecyclerView.ViewHolder {
            private ImageView ivPerroPerfil;

            private TextView tvConteoLikesPerfil;


            public PerfilViewHolder(View itemView){
                super(itemView);

                ivPerroPerfil    = (ImageView) itemView.findViewById(R.id.ivPerroPerfil);
                tvConteoLikesPerfil   = (TextView) itemView.findViewById(R.id.tvConteoLikesPerfil);

            }
        }

}
