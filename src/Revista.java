public class Revista extends Material {
    private int edicion;
    private String tematica;

    public Revista(String titulo, String codigo, int anioPublicacion, boolean estaDisponible, int edicion, String tematica) {
        super(titulo, codigo, anioPublicacion, estaDisponible);
        this.edicion = edicion;
        this.tematica = tematica;
    }

    @Override
    public String getTipo() {
        return "Revista";
    }
}
