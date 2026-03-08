import java.time.LocalDate;

public record Estudiante(String id, String nombre, LocalDate fechaNacimiento, String carrera) {
    // Método para calcular edad
    public int edad() {
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }
}

class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("2026-001", "Miguel Torres", LocalDate.of(2000, 5, 12), "Ingeniería de Sistemas");
        System.out.println(e);
        System.out.println("Edad: " + e.edad());
    }
}


