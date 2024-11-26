package edu.adrian.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.adrian.Entities.Carrera;
import edu.adrian.Repository.ICarreraRepository;

@Service
public class CarreraService implements ICarreraService{
@Autowired
ICarreraRepository carreraRepository;

	@Override
	public List<Carrera> getCarreras() {
		return carreraRepository.findAll();
	}

	@Override
	public Carrera getCarreraId(Integer id) {
        Optional<Carrera> op = carreraRepository.findById((long)id);
        if (op.isPresent()) {
            return op.get();
        }
        System.out.println("No se encontro carrera con ese id.");
        return null;        
	}

	@Override
	public Carrera guardarCarrera(Carrera ca) {
		return carreraRepository.save(ca);
	}

	@Override
	public Carrera actualizarCarrera(Carrera ca) {
        return carreraRepository.save(ca);
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
