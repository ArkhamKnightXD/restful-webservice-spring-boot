package arkham.kinght.service.repositories;

import arkham.kinght.service.models.Esence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EsenceRepository extends JpaRepository<Esence, Long> {


}
