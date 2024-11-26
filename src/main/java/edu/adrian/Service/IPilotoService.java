package edu.adrian.Service;

import java.util.List;
import edu.adrian.Entities.Piloto;


public interface IPilotoService {

public List<Piloto> getListaPilotos();
public Piloto getPilotoId(Integer id);
public Piloto guardarPiloto(Piloto pi);
public Piloto actualizarPiloto(Piloto pi);
public void eliminarPilotoId(Integer id);

}
