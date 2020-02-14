package arkham.kinght.service.repositories;

import arkham.kinght.service.models.GravilotaScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GravilotaScoreRepository extends JpaRepository<GravilotaScore, Long> {

}
