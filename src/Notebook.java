public class Notebook extends DispositivoTecnologico {
    private String resolucionPantalla;
    private String tipoTeclado;
    private int bateria;

    public Notebook(String marca, int memoriaRAM, int memoriaAlmacenamiento, String procesador, String modelo, int anoFabricacion,
                    double precio, int cantidadStock, String resolucionPantalla, String tipoTeclado, int bateria) {
        super(marca, memoriaRAM, memoriaAlmacenamiento, procesador, modelo, anoFabricacion, precio, cantidadStock);
        this.resolucionPantalla = resolucionPantalla;
        this.tipoTeclado = tipoTeclado;
        this.bateria = bateria;
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
                "\nResolucion de Pantalla: " + resolucionPantalla +
                "\nTipo de Teclado: " + tipoTeclado +
                "\nBateria: " + bateria + "mAh";

        return especificaciones;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public String getTipoTeclado() {
        return tipoTeclado;
    }

    public int getBateria() {
        return bateria;
    }
}
