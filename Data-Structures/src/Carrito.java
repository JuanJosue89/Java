public class Carrito {
    public static void main(String[] args) {
        Automovil miCarro = new Automovil();
        System.out.println(miCarro);
        Automovil tuCarro = new Automovil(0, 6, true);
        System.out.println(tuCarro);
        tuCarro.acelerar();
        System.out.println(tuCarro);
        miCarro.acelerar(30);
        System.out.println(miCarro);
    }
}
