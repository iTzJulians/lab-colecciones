public class Libro extends Material {
    private String autor;
    private String iSBN;

    public Libro(String titulo, String codigo, int anioPublicacion, boolean estaDisponible, String autor, String iSBN) {
        super(titulo, codigo, anioPublicacion, estaDisponible);
        this.autor = autor;
        this.iSBN = iSBN;
    }

    @Override
    public String getTipo() {
        return "Libro";
    }
}
