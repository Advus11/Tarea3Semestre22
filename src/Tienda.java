import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String direccion;
    private List<DispositivoTecnologico> catalogo;
    private List<Cliente> clientes;

    public Tienda() {
        this.direccion = direccion;
        this.catalogo = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) { // Método agregar cliente
        if (!clienteExiste(cliente.getCorreoElectronico())) {
            clientes.add(cliente);
            System.out.println("Cliente agregado correctamente.");
        } else {
            System.out.println("El cliente ya existe.");
        }
    }

    // Validación de cliente
    private boolean clienteExiste(String correoElectronico) {
        for (Cliente cliente : clientes) {
            if (cliente.getCorreoElectronico().equalsIgnoreCase(correoElectronico)) {
                return true;
            }
        }
        return false;
    }

    // Método que permite obtener la información de un dispositivo tecnológico
    public void obtenerInformacionDispositivo(String marca, String modelo, String tipo) {
        for (DispositivoTecnologico dispositivo : catalogo) {
            if ((marca == null || dispositivo.getMarca().equalsIgnoreCase(marca)) &&
                    (modelo == null || dispositivo.getModelo().equalsIgnoreCase(modelo)) &&
                    (tipo == null || dispositivo.getClass().getSimpleName().equalsIgnoreCase(tipo))) {
                System.out.println(dispositivo.obtenerEspecificaciones());
                System.out.println("-----------------------------");
            }
        }
    }

    // Método que permite mostrar todos los dispositivos por marca
    public List<DispositivoTecnologico> buscarDispositivosPorMarca(String marca) {
        List<DispositivoTecnologico> dispositivosEncontrados = new ArrayList<>();
        for (DispositivoTecnologico dispositivo : catalogo) {
            if (dispositivo.getMarca().equalsIgnoreCase(marca)) {
                dispositivosEncontrados.add(dispositivo);
            }
        }
        return dispositivosEncontrados;
    }

    // Método que permite buscar dispositivos del catálogo por modelo y tipo
    public List<DispositivoTecnologico> buscarDispositivosPorModeloYTipo(String modelo, String tipo) {
        List<DispositivoTecnologico> dispositivosEncontrados = new ArrayList<>();
        for (DispositivoTecnologico dispositivo : catalogo) {
            if (dispositivo.getModelo().equalsIgnoreCase(modelo) &&
                    dispositivo.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                dispositivosEncontrados.add(dispositivo);
            }
        }
        return dispositivosEncontrados;
    }

    // Getter
    public String getDireccion() {
        return direccion;
    }

    public List<DispositivoTecnologico> getCatalogo() { // Método que muestra el catálogo actual
        return catalogo;
    }

    public void agregarDispositivo(DispositivoTecnologico dispositivo) { // Método que permite agregar un dispositivo
        catalogo.add(dispositivo);
    }

    public void eliminarDispositivo(DispositivoTecnologico dispositivo) { // Método que permite eliminar un dispositivo
        catalogo.remove(dispositivo);
    }
}