package edu.adrian.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.adrian.DTO.CarreraDTO;
import edu.adrian.Entities.Carrera;
import edu.adrian.Repository.ICarreraRepository;

@Service
public class CarreraService implements ICarreraService{
@Autowired
ICarreraRepository carreraRepository;

	@Override
	public List<CarreraDTO> getCarreras() {
		List<Carrera> carreras = carreraRepository.findAll();
		List<CarreraDTO> carrerasDTO = new ArrayList<>();
		for (Carrera car : carreras) {
			CarreraDTO caDTO = new CarreraDTO();
			caDTO.setCircuito(car.getCircuito());
			caDTO.setPiloto(car.getPiloto());
			caDTO.setPosicion(car.getPosicion());
			caDTO.setTemporada(car.getTemporada());
			carrerasDTO.add(caDTO);
			//System.out.println(caDTO);
		}
		return carrerasDTO;
	}

	@Override
	public CarreraDTO getCarreraId(Integer id) {
        Optional<Carrera> op = carreraRepository.findById((long)id);
        if (op.isPresent()) {
			Carrera car = op.get();
			CarreraDTO caDTO = new CarreraDTO();
			caDTO.setCircuito(car.getCircuito());
			caDTO.setPiloto(car.getPiloto());
			caDTO.setPosicion(car.getPosicion());
			caDTO.setTemporada(car.getTemporada());
			return caDTO;
		}
        System.out.println("No se encontro carrera con ese id.");
        return null;        
	}

	@Override
	public Carrera guardarCarrera(Carrera ca) {
		return carreraRepository.save(ca);
	}

	@Override
	public CarreraDTO actualizarCarrera(Carrera ca) {
		Carrera carr = carreraRepository.save(ca);
		return new CarreraDTO(carr.getPiloto(), carr.getCircuito(), carr.getTemporada(), carr.getPosicion());
	}

	@Override
	public void eliminarCarreraId(Integer id) {
		if (carreraRepository.existsById((long)id)) {
            carreraRepository.deleteById((long)id);
            System.out.println("La carrera con el id " +id+ "ha sido borrada.");
        }
        System.out.println("La carrera con id " + id + " no existe.");
	}

}
