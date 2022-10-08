package Repository.Crud;

import model.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GamesRepository {

    @Autowired
    private GamesCrudRepository gamesCrudRepository;

    public List<Games> getAll(){
        return (List<Games>) gamesCrudRepository.findAll();
    }

    public Optional<Games> getGames(int id){
        return gamesCrudRepository.findById(id);
    }

    public Games save(Games games){
        return gamesCrudRepository.save(games);
    }

    public void delete(Games games){
        gamesCrudRepository.delete(games);
    }
}
