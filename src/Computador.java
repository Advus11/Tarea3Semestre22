public class Computador extends DispositivoTecnologico {
    private String tarjetaVideo;
    private String fuentePoder;
    private String chasis;
    private Pantalla pantallaAsociada;

    public Computador(String marca, int memoriaRAM, int memoriaAlmacenamiento, String procesador, String modelo, int anoFabricacion,
                      double precio, int cantidadStock, String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantallaAsociada) {
        super(marca, memoriaRAM, memoriaAlmacenamiento, procesador, modelo, anoFabricacion, precio, cantidadStock);
        this.tarjetaVideo = tarjetaVideo;
        this.fuentePoder = fuentePoder;
        this.chasis = chasis;
        this.pantallaAsociada = pantallaAsociada;
    }

    @Override
    public String obtenerEspecificaciones() {
        String especificaciones = "Marca: " + getMarca() +
                "\nMemoria RAM: " + getMemoriaRAM() + "GB" +
                "\nMemoria de Almacenamiento: " + getMemoriaAlmacenamiento() + "GB" +
                "\nProcesador: " + getProcesador() +
                "\nModelo: " + getModelo() +
                "\nAno de Fabricacion: " + getAnoFabricacion() +
                "\nPrecio: $" + getPrecio() +
                "\nCantidad en Stock: " + getCantidadStock() +
                "\nTarjeta de Video: " + tarjetaVideo +
                "\nFuente de Poder: " + fuentePoder +
                "\nChasis: " + chasis +
                "\nPantalla Asociada: " + pantallaAsociada.obtenerEspecificaciones();

        return especificaciones;
    }

    public String getTarjetaVideo() {
        return tarjetaVideo;
    }

    public String getFuentePoder() {
        return fuentePoder;
    }

    public String getChasis() {
        return chasis;
    }

    public Pantalla getPantallaAsociada() {
        return pantallaAsociada;
    }
}