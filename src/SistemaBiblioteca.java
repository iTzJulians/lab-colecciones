import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaBiblioteca {
    private Map<String, Material> catalogo = new HashMap<String, Material>();
    private Map<String, List<String>> listaDeEspera = new HashMap<>();

    public void registrarMaterial(Material material) {
        catalogo.put(material.getCodigo(), material);
    }

    public Material buscarMaterial(String codigo) {
        return catalogo.get(codigo);
    }

    public void agregarEspera(String codigoMaterial, String usuario) {

        List<String> lista = listaDeEspera.get(codigoMaterial);
        if (lista == null) {
            lista = new ArrayList<>();
            listaDeEspera.put(codigoMaterial, lista);
        }
        lista.add(usuario);

    }

public String siguienteEnEspera(String codigoMaterial){
    return listaDeEspera.get(codigoMaterial).removeFirst();
}
    public void mostrarCatalogo() {
        for (Map.Entry<String, Material> c : catalogo.entrySet()) {
            c.getValue().mostrarInfo();
        }
    }
}
