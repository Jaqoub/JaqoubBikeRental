package repository;

import model.Bicycle;
import org.springframework.data.repository.CrudRepository;

public interface BicycleRepository extends CrudRepository<Bicycle, Long> {
}
