package arkham.kinght.service;

import arkham.kinght.service.models.UserScore;
import arkham.kinght.service.services.UserScoreService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(UserScoreService userScoreService){
        return args -> {

            List<UserScore> userScoreList = new ArrayList<>();

            UserScore userScore = new UserScore();
            UserScore userScore2 = new UserScore();
            UserScore userScore3 = new UserScore();

            userScore.setPlayerName("Sam");
            userScore.setScore(50);

            userScore2.setPlayerName("Pepe");
            userScore2.setScore(20);

            userScore3.setPlayerName("Alex");
            userScore3.setScore(30);

            userScoreList.add(userScore);
            userScoreList.add(userScore2);
            userScoreList.add(userScore3);

            userScoreService.SaveAllUserScore(userScoreList);

        };
    }

}
