public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Cliente cliente1 = new Cliente("adonis", "subiabre", "correo1@gmail.com", "11111111", "Soltero", "Ciudad1");
        tienda.agregarCliente(cliente1);

        Cliente cliente2 = new Cliente("juan", "perez", "correo2@gmail.com", "22222222", "Casada", "Ciudad2");
        tienda.agregarCliente(cliente2);

        DispositivoTecnologico dispositivo1 = new Computador("ACER", 16, 512, "Intel Core i7", "Nitro 5", 2021, 700000, 10,
                "NVIDIA GeForce GTX 1650", "500W", "Mid Tower", new Pantalla("acer", "144f", 2021));
        tienda.agregarDispositivo(dispositivo1);

        DispositivoTecnologico dispositivo2 = new Notebook("Dell", 16, 1, "Intel Core i7", "Dell XPS", 2022, 750000, 5,
                "1920x1080", "Teclado RGB", 8000);
        tienda.agregarDispositivo(dispositivo2);

        GestorArchivo.guardarCatalogoEnArchivo(tienda.getCatalogo());

        System.out.println("Dispositivos cargados desde el archivo:");
        for (DispositivoTecnologico dispositivo : tienda.getCatalogo()) {
            System.out.println(dispositivo.obtenerEspecificaciones());
            System.out.println("-----------------------------");
        }
    }
}