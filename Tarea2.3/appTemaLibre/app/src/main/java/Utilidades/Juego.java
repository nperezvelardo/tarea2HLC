package Utilidades;

public class Juego {

    private String descripcion;
    private int imgId;
    private String nombre;

    public Juego(String descripcion, int imgId, String nombre) {
        this.descripcion = descripcion;
        this.imgId = imgId;
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescription(String description) {
        this.descripcion = description;
    }
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
