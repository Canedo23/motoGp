package edu.adrian.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.adrian.DTO.EstadisticasPilotoDTO;
import edu.adrian.DTO.PilotoDTO;
import edu.adrian.Entities.Piloto;
import edu.adrian.Repository.IPilotoRepository;

@Service
public class PilotoService implements IPilotoService{
@Autowired 
IPilotoRepository pilotoRepository;

@Override
public List<PilotoDTO> getListaPilotos() {
    List<Piloto> pilotos = pilotoRepository.findAll();
    List<PilotoDTO> pilotosDTO = new ArrayList<>();
    for (Piloto pi : pilotos) {
        PilotoDTO pidto = new PilotoDTO();
        pidto.setNombre(pi.getNombre());
        pidto.setConduccion(pi.getConduccion());
        pidto.setListaCarreras(pi.getListaCarreras());
        pilotosDTO.add(pidto);
    }
    return pilotosDTO;
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
public PilotoDTO guardarPiloto(Piloto pi) {
    Piloto piDB = pilotoRepository.save(pi);
    PilotoDTO piDTO = new PilotoDTO();
    piDTO.setNombre(piDB.getNombre());
    piDTO.setConduccion(piDB.getConduccion());
    piDTO.setListaCarreras(piDB.getListaCarreras());
    return piDTO;
}

@Override
public PilotoDTO actualizarPiloto(Piloto pi) {
    Piloto piDB = pilotoRepository.save(pi);
    System.out.println("PILOOTOOOO: " + piDB);
    PilotoDTO piDTO = new PilotoDTO();
    piDTO.setNombre(piDB.getNombre());
    piDTO.setConduccion(piDB.getConduccion());
    piDTO.setListaCarreras(piDB.getListaCarreras());
    return piDTO;
}

@Override
public void eliminarPilotoId(Integer id) {
    if (pilotoRepository.existsById((long)id)) {
        pilotoRepository.deleteById((long)id);
        System.out.println("Piloto con el id" +id + "borrado");
    }
    System.out.println("No se ha encontrado el piloto con el id " +id);
}

@Override
public EstadisticasPilotoDTO getEstadisticasPiloto(Integer idEp) {
    Optional<Piloto> op = pilotoRepository.findById((long)idEp);
    if(!op.isPresent()){
        return null;
    }
    Piloto pilotobd = op.get();
    EstadisticasPilotoDTO epdto = new EstadisticasPilotoDTO();
    epdto.setNombrePiloto(pilotobd.getNombre());
    Integer numeroCarreras = pilotobd.getListaCarreras().size();
    epdto.setNumeroCarreras(numeroCarreras);
    return epdto;
}


}
