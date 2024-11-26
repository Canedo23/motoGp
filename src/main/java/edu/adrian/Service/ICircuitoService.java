package edu.adrian.Service;

import java.util.List;

import edu.adrian.Entities.Circuito;

public interface ICircuitoService {

public List<Circuito> getCircuitos();
public Circuito getCircuitoId(Integer id);
public Circuito guardarCircuito(Circuito ci);
public Circuito actualizarCircuitoId(Circuito ci);
public void eliminarCircuitoId(Long id);

}
