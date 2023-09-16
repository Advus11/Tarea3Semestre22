import java.io.*;
import java.util.List;

public class GestorArchivo {
    private static final String ARCHIVO_CATALOGO = "catalogo.txt";

    public static void guardarCatalogoEnArchivo(List<DispositivoTecnologico> catalogo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_CATALOGO))) {
            for (DispositivoTecnologico dispositivo : catalogo) {
                writer.println(dispositivo.getClass().getSimpleName());
                
                writer.println(dispositivo.getMarca() + "/" + dispositivo.getMemoriaRAM() + "/" + dispositivo.getMemoriaAlmacenamiento() +
                        "/" + dispositivo.getProcesador() + "/" + dispositivo.getModelo() + "/" + dispositivo.getAnoFabricacion() +
                        "/" + dispositivo.getPrecio() + "/" + dispositivo.getCantidadStock());
                if (dispositivo instanceof Computador) {
                    Computador computador = (Computador) dispositivo;
                    writer.println(computador.getTarjetaVideo() + "/" + computador.getFuentePoder() + "/" + computador.getChasis());
                } else if (dispositivo instanceof Notebook) {
                    Notebook notebook = (Notebook) dispositivo;
                    writer.println(notebook.getResolucionPantalla() + "/" + notebook.getTipoTeclado() + "/" + notebook.getBateria());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

