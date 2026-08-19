import java.util.ArrayList;
import java.util.List;

public abstract class Material implements ICatalogable {
    public String getTitulo() {
        return titulo;
    }
    @Override
    public String getCodigo() {
        return codigo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public Material( String titulo, String codigo, int anioPublicacion, boolean estaDisponible) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.anioPublicacion = anioPublicacion;
        this.estaDisponible = estaDisponible;
    }
    public void mostrarInfo(){
        System.out.printf("Tipo: %s \n Titulo: %s \n año: %d \n", getTipo(), getTitulo(), getAnioPublicacion());;
        if(estaDisponible){
            System.out.println("Disponible");
        }
        else {
            System.out.println("Prestado");
        }
    }

    private String titulo;
    private String codigo;
    private int anioPublicacion;
    private boolean estaDisponible;

    public abstract String getTipo();


}
