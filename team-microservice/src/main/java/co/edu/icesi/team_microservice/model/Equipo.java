package co.edu.icesi.team_microservice.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private int cantidad;

    @Embedded
    private EstadoMantenimiento estadoMantenimiento;

    @Embedded
    private Ubicacion ubicacion;
}
