class Motor {
    public void encender() {
        System.out.println("El motor está encendido.");
    }
}

class Coche {
    private Motor motor;

    public Coche() {
        motor = new Motor(); // El coche contiene el motor
    }

    public void arrancar() {
        motor.encender();
        System.out.println("El coche ha arrancado.");
    }
}

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.arrancar();
    }
}
