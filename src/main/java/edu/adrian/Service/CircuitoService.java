package edu.adrian.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.adrian.Entities.Circuito;
import edu.adrian.Repository.ICircuitoRespository;

@Service
public class CircuitoService implements ICircuitoService{
@Autowired
ICircuitoRespository circuitoRespository;

@Override
public List<Circuito> getCircuitos() {
    return circuitoRespository.findAll();
}

@Override
public Circuito getCircuitoId(Integer id) {
    Optional<Circuito> op = circuitoRespository.findById((long)id);
    if (op.isPresent()) {
        return op.get();
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