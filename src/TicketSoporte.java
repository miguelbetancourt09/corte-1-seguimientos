import java.time.LocalDateTime;

public record TicketSoporte(int id, String usuario, String descripcion, LocalDateTime fechaCreacion, String estado) {
    // Método para verificar si el ticket está pendiente
    public boolean estaPendiente() {
        return estado.equalsIgnoreCase("Pendiente");
    }
}

class Main {
    public static void main(String[] args) {
        TicketSoporte t = new TicketSoporte(101, "m.torres", "Error al iniciar sesión", LocalDateTime.now(), "Pendiente");
        System.out.println(t);
        System.out.println("¿Está pendiente?: " + t.estaPendiente());
    }
}
