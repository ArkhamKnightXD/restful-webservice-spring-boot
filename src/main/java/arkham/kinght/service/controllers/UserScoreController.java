package arkham.kinght.service.controllers;

import arkham.kinght.service.models.UserScore;
import arkham.kinght.service.services.UserScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserScoreController {

    @Autowired
    private UserScoreService userScoreService;


    // la diferencia entre rest controller y el controller normal es que en el rest controller las funciones me retornaran json en vez de objetos
    // Como queremos que esto solo sea accedido mediante get request pues le ponemos getmapping
    @GetMapping("/scores")
    public List<UserScore> findAllScores() {

        return userScoreService.FindAllUserScore();
    }


    @PutMapping("/save/{name}/{score}")
    public String saveScore(@PathVariable("name") String name, @PathVariable( "score") Float score) {

        UserScore userScoreToSave = new UserScore();

        userScoreToSave.setPlayerName(name);
        userScoreToSave.setScore(score);

        userScoreService.SaveUserScore(userScoreToSave);

        return "Score saved";
    }


    //Este consigue los datos mediante el body y es mas seguro que conseguir los datos mediante url como en el savescore de arriba
    @PutMapping("/request")
    public String saveScoreBody(@RequestBody UserScore userScoreToSave) {

        userScoreService.SaveUserScore(userScoreToSave);

        return "Score saved";
    }


    @GetMapping("/scores/{id}")
    public UserScore findUserScoreById(@PathVariable("id") Long userScoreId){

        return userScoreService.FindUserScoreById(userScoreId);
    }
}
