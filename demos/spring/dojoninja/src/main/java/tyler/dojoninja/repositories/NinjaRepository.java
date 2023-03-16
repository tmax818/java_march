package tyler.dojoninja.repositories;

import org.springframework.data.repository.CrudRepository;

import tyler.dojoninja.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    
}
