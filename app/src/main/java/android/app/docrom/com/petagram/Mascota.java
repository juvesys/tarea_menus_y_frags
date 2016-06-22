package android.app.docrom.com.petagram;

/**
 * Created by alanm on 29/05/2016.
 */
public class Mascota {

    private int Perro;
    private String NombrePerro;
    private int ConteoLikes;

    public Mascota(int perro, String nombrePerro, int conteoLikes) {
        Perro = perro;
        NombrePerro = nombrePerro;
        ConteoLikes = conteoLikes;
    }

    public int getConteoLikes() {
        return ConteoLikes;
    }

    public void setConteoLikes(int conteoLikes) {
        ConteoLikes = conteoLikes;
    }

    public String getNombrePerro() {
        return NombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        NombrePerro = nombrePerro;
    }

    public int getPerro() {
        return Perro;
    }

    public void setPerro(int perro) {
        Perro = perro;
    }




}
