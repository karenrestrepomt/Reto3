package Repository.Crud;

import model.Games;
import org.springframework.data.repository.CrudRepository;

public interface GamesCrudRepository extends CrudRepository<Games, Integer> {
}
