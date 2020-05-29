package arkham.kinght.service.services;

import arkham.kinght.service.models.UserScore;
import arkham.kinght.service.repositories.UserScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserScoreService {

    @Autowired
    private UserScoreRepository userScoreRepository;


    public void SaveUserScore(UserScore userScore){

        userScoreRepository.save(userScore);
    }


    public List<UserScore> FindAllUserScore(){

        return userScoreRepository.findAll();
    }
}
