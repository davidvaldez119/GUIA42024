package guia4;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Rent {

    private LocalDateTime fecha;

    public Rent(LocalDateTime fecha) {
        this.fecha = LocalDateTime.now();
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public void agregarDosDias(){
        fecha.plusDays(2L);
    }
}
