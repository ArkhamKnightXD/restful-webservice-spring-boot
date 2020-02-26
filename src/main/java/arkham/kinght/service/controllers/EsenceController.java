package arkham.kinght.service.controllers;

import arkham.kinght.service.models.Esence;
import arkham.kinght.service.services.EsenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/esence")
public class EsenceController {

    @Autowired
    private EsenceService esenceService;

    @PutMapping("/request")
    public String saveScoreBody(@RequestBody Esence esenceScoreToSave) {

        esenceService.SaveEsenceScore(esenceScoreToSave);

        return "Score saved";
    }


    @GetMapping("/scores")
    public List<Esence> findAllScores() {

        return esenceService.FindAllEsenceScore();
    }
}
