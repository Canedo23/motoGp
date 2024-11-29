package edu.adrian.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.adrian.DTO.PilotoDTO;
import edu.adrian.Entities.Piloto;
import edu.adrian.Service.IPilotoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/pilotos")
public class PilotoController {
@Autowired 
IPilotoService pilotoService;

@GetMapping("/all")
public List<PilotoDTO> getListaPilotos() {
    return pilotoService.getListaPilotos();
}

@GetMapping("/{id}")
public PilotoDTO getPilotoId(@PathVariable("id") Integer idUrl) {
    return pilotoService.getPilotoId(idUrl);
}

@PostMapping("/guardar")
public Piloto guardarPiloto(@RequestBody Piloto pi) {
    return pilotoService.guardarPiloto(pi);
}

@PutMapping("/actualizar")
public PilotoDTO actualizarPiloto(@RequestBody Piloto pi) {
    return pilotoService.actualizarPiloto(pi);
}

@DeleteMapping("/{id}")
public String eliminarPilotoId(@PathVariable("id") Integer id ) {
    pilotoService.eliminarPilotoId(id);
    return "Piloto borrado";
}


}
