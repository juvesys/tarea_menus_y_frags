package android.app.docrom.com.petagram;

/**
 * Created by alanm on 19/06/2016.
 */
public class Perfil {
    private int FotoPerro;
    private int ConteoLikes;

    public Perfil(int fotoPerro, int conteoLikes) {
        FotoPerro = fotoPerro;
        ConteoLikes = conteoLikes;
    }

    public int getConteoLikes() {
        return ConteoLikes;
    }

    public void setConteoLikes(int conteoLikes) {
        ConteoLikes = conteoLikes;
    }

    public int getFotoPerro() {
        return FotoPerro;
    }

    public void setFotoPerro(int fotoPerro) {
        FotoPerro = fotoPerro;
    }


}
