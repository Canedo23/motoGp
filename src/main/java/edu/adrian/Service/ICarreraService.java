package edu.adrian.Service;

import java.util.List;

import edu.adrian.Entities.Carrera;

public interface ICarreraService {

public List<Carrera> getCarreras();
public Carrera getCarreraId(Integer id);
public Carrera guardarCarrera(Carrera ca);
public Carrera actualizarCarrera(Carrera ca);
public void eliminarCarreraId(Integer id);
}
