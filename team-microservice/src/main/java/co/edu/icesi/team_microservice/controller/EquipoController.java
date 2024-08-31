package co.edu.icesi.team_microservice.controller;

import co.edu.icesi.team_microservice.model.Equipo;
import co.edu.icesi.team_microservice.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipos")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @PostMapping("/agregar")
    public Equipo agregarEquipo(@RequestBody Equipo equipo) {
        return equipoService.agregarEquipo(equipo);
    }

    @GetMapping("/todos")
    public List<Equipo> obtenerTodosEquipos() {
        return equipoService.obtenerTodosEquipos();
    }

    @PutMapping("/actualizar/{id}")
    public Equipo actualizarEquipo(@PathVariable Long id, @RequestBody Equipo equipo) {
        return equipoService.actualizarEquipo(id, equipo);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarEquipo(@PathVariable Long id) {
        equipoService.eliminarEquipo(id);
    }
}
