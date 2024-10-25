import java.util.ArrayList;
import java.util.List;

class Profesor {
    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Profesor: " + nombre;
    }
}

class Universidad {
    private List<Profesor> profesores;

    public Universidad() {
        profesores = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }
}

public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        Profesor prof1 = new Profesor("Juan Pérez");
        Profesor prof2 = new Profesor("Ana Gómez");

        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);

        System.out.println("Lista de profesores:");
        for (Profesor profesor : universidad.getProfesores()) {
            System.out.println(profesor);
        }
    }
}
