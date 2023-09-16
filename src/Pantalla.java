public class Pantalla {
    private String marca;
    private String modelo;
    private int ano;

    public Pantalla(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String obtenerEspecificaciones() {
        String especificaciones = "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + ano;

        return especificaciones;
    }
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}
