package edu.adrian.Service;

import java.util.List;

import edu.adrian.DTO.CircuitoDTO;
import edu.adrian.Entities.Circuito;

public interface ICircuitoService {

public List<CircuitoDTO> getCircuitos();
public CircuitoDTO getCircuitoId(Integer id);
public Circuito guardarCircuito(Circuito ci);
public Circuito actualizarCircuitoId(Circuito ci);
public void eliminarCircuitoId(Long id);

}
