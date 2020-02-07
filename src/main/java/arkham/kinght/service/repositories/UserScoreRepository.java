package arkham.kinght.service.repositories;

import arkham.kinght.service.models.UserScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserScoreRepository extends JpaRepository<UserScore,Long> {

}
