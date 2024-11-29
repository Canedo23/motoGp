package edu.adrian.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.adrian.DTO.CircuitoDTO;
import edu.adrian.Entities.Circuito;
import edu.adrian.Service.ICircuitoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/circuitos")
public class CircuitoController {
@Autowired
ICircuitoService circuitoService;

@GetMapping("/all")
public List<CircuitoDTO> getCircuitos() {
    return circuitoService.getCircuitos();
}

@GetMapping("/{id}")
public CircuitoDTO getCircuitoId(@PathVariable("id") Integer id) {
    return circuitoService.getCircuitoId(id);
}

@PostMapping("/guardar")
public Circuito guardarCircuito(@RequestBody Circuito ci) {
    return circuitoService.guardarCircuito(ci);
}

@PutMapping("/actualizar")
public Circuito actualizarCircuitoId(@RequestBody Circuito ci) {
    return circuitoService.actualizarCircuitoId(ci);
}

@DeleteMapping("/{id}")
public void eliminarCircuitoId(@PathVariable("id") Long id) {
    circuitoService.eliminarCircuitoId(id);
}


}
