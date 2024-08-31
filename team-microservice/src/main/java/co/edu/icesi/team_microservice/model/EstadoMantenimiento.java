package co.edu.icesi.team_microservice.model;
import co.edu.icesi.team_microservice.model.Estado;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class EstadoMantenimiento {
    private Estado estado;
    private String notas;
}
