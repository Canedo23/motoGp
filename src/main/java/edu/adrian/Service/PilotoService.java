package edu.adrian.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.adrian.DTO.PilotoDTO;
import edu.adrian.Entities.Piloto;
import edu.adrian.Repository.IPilotoRepository;

@Service
public class PilotoService implements IPilotoService{
@Autowired 
IPilotoRepository pilotoRepository;

@Override
public List<Piloto> getListaPilotos() {
    return pilotoRepository.findAll();
}

@Override
public PilotoDTO getPilotoId(Integer id) {
    Optional<Piloto> op = pilotoRepository.findById((long) id);
    if (op.isPresent()) {
        PilotoDTO pidto = new PilotoDTO();
        Piloto pi = op.get();
        pidto.setNombre(pi.getNombre());
        pidto.setConduccion(pi.getConduccion());
        pidto.setListaCarreras(pi.getListaCarreras());
        return pidto;
    }
    return null;
}

@Override
public Piloto guardarPiloto(Piloto pi) {
    return pilotoRepository.save(pi);
}

@Override
public Piloto actualizarPiloto(Piloto pi) {
    return pilotoRepository.save(pi);
}

@Override
public void eliminarPilotoId(Integer id) {
    if (pilotoRepository.existsById((long)id)) {
        pilotoRepository.deleteById((long)id);
        System.out.println("Piloto con el id" +id + "borrado");
    }
    System.out.println("No se ha encontrado el piloto con el id " +id);
}


}
