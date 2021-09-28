//Carrito.java

public class Automovil {
    int velocidad, pasajeros;
    boolean encendido;

    Automovil() {
        velocidad = 0;
        pasajeros = 4;
        encendido = false;
    }

    Automovil (int v, int p, boolean e) {
        velocidad = v;
        pasajeros = p;
        encendido = e;
    }

    void acelerar() {
        velocidad += 5;
    }

    void acelerar(int incremento) {
        velocidad = velocidad + incremento;
    }

    public String toString() {
        return ("Velocidad = " + velocidad + "\nPasajeros = " + pasajeros + "\nEncendido = " + encendido);
    }
}

