package edu.adrian.Service;

import java.util.List;

import edu.adrian.DTO.EstadisticasPilotoDTO;
import edu.adrian.DTO.PilotoDTO;
import edu.adrian.Entities.Piloto;


public interface IPilotoService {

public EstadisticasPilotoDTO getEstadisticasPiloto(Integer idEp);
public List<PilotoDTO> getListaPilotos();
public PilotoDTO getPilotoId(Integer id);
public PilotoDTO guardarPiloto(Piloto pi);
public PilotoDTO actualizarPiloto(Piloto pi);
public void eliminarPilotoId(Integer id);

}
