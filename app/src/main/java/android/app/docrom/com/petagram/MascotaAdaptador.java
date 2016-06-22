package android.app.docrom.com.petagram;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import java.util.ArrayList;

/**
 * Created by alanm on 29/05/2016.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;

    public MascotaAdaptador(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
    }


    @Override
    public MascotaAdaptador.MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_mascotas, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaAdaptador.MascotaViewHolder holder, int position) {
        final Mascota mascota = mascotas.get(position);
        holder.ivPerro.setImageResource(mascota.getPerro());
        holder.tvNombrePerro.setText(mascota.getNombrePerro());
        holder.tvConteoLikes.setText(String.valueOf(mascota.getConteoLikes()));


        holder.ivHuesoLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Diste Like a " + mascota.getNombrePerro(),Toast.LENGTH_SHORT).show();
                mascota.setConteoLikes(mascota.getConteoLikes() + 1);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

        public class MascotaViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivPerro;
        private TextView tvNombrePerro;
        private TextView tvConteoLikes;
        private ImageView ivHuesoLike;

        public MascotaViewHolder(View itemView){
            super(itemView);

            ivPerro         = (ImageView) itemView.findViewById(R.id.ivPerro);
            tvNombrePerro   = (TextView) itemView.findViewById(R.id.tvNombrePerro);
            tvConteoLikes   = (TextView) itemView.findViewById(R.id.tvConteoLikes);
            ivHuesoLike     = (ImageView) itemView.findViewById(R.id.ivHuesoLike);
        }
    }
}
