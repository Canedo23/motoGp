package edu.adrian.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.adrian.DTO.CarreraDTO;
import edu.adrian.Entities.Carrera;
import edu.adrian.Service.ICarreraService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/carreras")
public class CarreraController {
@Autowired
ICarreraService carreraService;

@GetMapping("/all")
public List<CarreraDTO> getCarreras() {
    return carreraService.getCarreras();
}

@GetMapping("/{id}")
public CarreraDTO getCarreraId(@PathVariable("id") Integer id) {
    return carreraService.getCarreraId(id);
}

@PostMapping("/guardar")
public Carrera guardarCarrera(@RequestBody Carrera ca) {
    return carreraService.guardarCarrera(ca);
}

@PutMapping("/actualizar")
public CarreraDTO actualizarCarrera(@RequestBody Carrera ca) {
    return carreraService.actualizarCarrera(ca);
}

@DeleteMapping("/{id}")
public void eliminarCarreraId(@PathVariable("id") Integer id) {
    carreraService.eliminarCarreraId(id);
}




}
