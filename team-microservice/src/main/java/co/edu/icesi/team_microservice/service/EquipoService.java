package co.edu.icesi.team_microservice.service;

import co.edu.icesi.team_microservice.model.Equipo;
import co.edu.icesi.team_microservice.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public Equipo agregarEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    public List<Equipo> obtenerTodosEquipos() {
        return equipoRepository.findAll();
    }

    public Equipo actualizarEquipo(Long id, Equipo equipoActualizado) {
        Equipo equipoExistente = equipoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipo no encontrado"));

        equipoExistente.setNombre(equipoActualizado.getNombre());
        equipoExistente.setDescripcion(equipoActualizado.getDescripcion());
        equipoExistente.setCantidad(equipoActualizado.getCantidad());
        equipoExistente.setEstadoMantenimiento(equipoActualizado.getEstadoMantenimiento());
        equipoExistente.setUbicacion(equipoActualizado.getUbicacion());
        return equipoRepository.save(equipoExistente);
    }

    public void eliminarEquipo(Long id) {
        equipoRepository.deleteById(id);
    }
}
