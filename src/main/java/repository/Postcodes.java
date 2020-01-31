package repository;

import model.Bicycle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Postcodes  extends CrudRepository<Postcodes, Long> {

    List<Postcodes> findAll();
}
