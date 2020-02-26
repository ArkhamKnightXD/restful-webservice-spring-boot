package arkham.kinght.service.services;

import arkham.kinght.service.models.Esence;
import arkham.kinght.service.repositories.EsenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EsenceService {

    @Autowired
    private EsenceRepository esenceRepository;


    public void SaveEsenceScore(Esence esenceScore){

        esenceRepository.save(esenceScore);
    }

    public List<Esence> FindAllEsenceScore(){

        return esenceRepository.findAll();
    }
}
