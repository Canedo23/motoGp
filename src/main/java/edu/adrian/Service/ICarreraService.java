package edu.adrian.Service;

import java.util.List;

import edu.adrian.DTO.CarreraDTO;
import edu.adrian.Entities.Carrera;

public interface ICarreraService {

public List<CarreraDTO> getCarreras();
public CarreraDTO getCarreraId(Integer id);
public Carrera guardarCarrera(Carrera ca);
public CarreraDTO actualizarCarrera(Carrera ca);
public void eliminarCarreraId(Integer id);
}
