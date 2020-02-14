package arkham.kinght.service.services;

import arkham.kinght.service.models.GravilotaScore;
import arkham.kinght.service.repositories.GravilotaScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GravilotaScoreService {

    @Autowired
    private GravilotaScoreRepository gravilotaScoreRepository;


    public void SaveGravilotaScore(GravilotaScore gravilotaScoreToSave){

        gravilotaScoreRepository.save(gravilotaScoreToSave);
    }


    public List<GravilotaScore> FindAllGravilotaScore(){

        return gravilotaScoreRepository.findAll();
    }
}
