public abstract class DispositivoTecnologico {
    private String marca;
    private int memoriaRAM;
    private int memoriaAlmacenamiento;
    private String procesador;
    private String modelo;
    private int anoFabricacion;
    private double precio;
    private int cantidadStock;

    public DispositivoTecnologico(String marca, int memoriaRAM, int memoriaAlmacenamiento, String procesador, String modelo, int anoFabricacion, double precio, int cantidadStock) {
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
        this.procesador = procesador;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public abstract String obtenerEspecificaciones();

    public String getMarca() {
        return marca;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getMemoriaAlmacenamiento() {
        return memoriaAlmacenamiento;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }
}

