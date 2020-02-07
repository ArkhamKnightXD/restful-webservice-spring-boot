package arkham.kinght.service.controllers;

import arkham.kinght.service.models.UserScore;
import arkham.kinght.service.services.UserScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserScoreController {

    @Autowired
    private UserScoreService userScoreService;


    @GetMapping("/save")
    public void saveScore(@RequestParam(value = "name") String name, @RequestParam(value = "score") float score) {

        UserScore userScoreToSave = new UserScore();

        userScoreToSave.setPlayerName(name);
        userScoreToSave.setScore(score);

        userScoreService.SaveUserScore(userScoreToSave);
    }


    @GetMapping("/scores")
    public List<UserScore> findAllScores() {

        return userScoreService.FindAllUserScore();
    }
}
