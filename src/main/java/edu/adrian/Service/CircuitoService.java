package edu.adrian.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.adrian.DTO.CircuitoDTO;
import edu.adrian.Entities.Circuito;
import edu.adrian.Repository.ICircuitoRespository;

@Service
public class CircuitoService implements ICircuitoService{
@Autowired
ICircuitoRespository circuitoRespository;

@Override
public List<CircuitoDTO> getCircuitos() {
    List<Circuito> circuitos = circuitoRespository.findAll();
    List<CircuitoDTO> circuitosDto = new ArrayList();
    for (Circuito ci : circuitos) {
        CircuitoDTO ciDTO = new CircuitoDTO();
        ciDTO.setNombre(ciDTO.getNombre());
        ciDTO.setLocalidad(ciDTO.getLocalidad());
        ciDTO.setListaCarreras(ciDTO.getListaCarreras());
        circuitosDto.add(ciDTO);
    }
    return circuitosDto;
}

@Override
public CircuitoDTO getCircuitoId(Integer id) {
    Optional<Circuito> op = circuitoRespository.findById((long)id);
    if (op.isPresent()) {
        Circuito ci = op.get();
        CircuitoDTO ciDto = new CircuitoDTO();
        ciDto.setNombre(ci.getNombre());
        ciDto.setLocalidad(ci.getLocalidad());
        ciDto.setListaCarreras(ci.getListaCarreras());
        return ciDto;
    }
    System.out.println("El circuito con el id " + id + "no existe.");
    return null;
}

@Override
public Circuito guardarCircuito(Circuito ci) {
    return circuitoRespository.save(ci);
}

@Override
public Circuito actualizarCircuitoId(Circuito ci) {
    return circuitoRespository.save(ci);
}

@Override
public void eliminarCircuitoId(Long id) {
    if (circuitoRespository.existsById(id)) {
        circuitoRespository.deleteById(id);
        System.out.println("El circuito con el id " + id + " ha sido borrado");
    }
    System.out.println("El circuito con el id " + id + "no existe.");
}



}