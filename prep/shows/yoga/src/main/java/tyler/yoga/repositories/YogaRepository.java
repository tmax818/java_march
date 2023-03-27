package tyler.yoga.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tyler.yoga.models.Yoga;

public interface YogaRepository extends CrudRepository<Yoga, Long> {
    List<Yoga> findAll();
}
