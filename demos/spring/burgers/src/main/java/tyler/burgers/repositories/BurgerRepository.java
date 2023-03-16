package tyler.burgers.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tyler.burgers.models.Burger;

public interface BurgerRepository extends CrudRepository<Burger, Long>{
    List<Burger> findAll();
    
}
