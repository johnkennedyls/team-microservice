package co.edu.icesi.team_microservice.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Ubicacion {
    private String sala;
    private String posicion;
}
