package arkham.kinght.service.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Esence {

    @Id
    @GeneratedValue
    private Long id;

    private String playerName;

    private float greenScore;
    private float yellowScore;
    private float redScore;
    private float blueScore;
    private float pinkScore;
    private float purpleScore;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public float getGreenScore() {
        return greenScore;
    }

    public void setGreenScore(float greenScore) {
        this.greenScore = greenScore;
    }

    public float getYellowScore() {
        return yellowScore;
    }

    public void setYellowScore(float yellowScore) {
        this.yellowScore = yellowScore;
    }

    public float getRedScore() {
        return redScore;
    }

    public void setRedScore(float redScore) {
        this.redScore = redScore;
    }

    public float getBlueScore() {
        return blueScore;
    }

    public void setBlueScore(float blueScore) {
        this.blueScore = blueScore;
    }

    public float getPinkScore() {
        return pinkScore;
    }

    public void setPinkScore(float pinkScore) {
        this.pinkScore = pinkScore;
    }

    public float getPurpleScore() {
        return purpleScore;
    }

    public void setPurpleScore(float purpleScore) {
        this.purpleScore = purpleScore;
    }
}
