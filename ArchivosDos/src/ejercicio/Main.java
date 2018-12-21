package ejercicio;

/**
 * @author Renato
 */
public class Main {
    public static void main(String[] args) {
        
        CrearArchivoTexto archivo = new CrearArchivoTexto();
        
        archivo.abrirArchivo();
        archivo.agregarRegistros();
        archivo.cerrarArchivo();
        
        
    }
}
