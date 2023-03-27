package tyler.yoga.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tyler.yoga.models.Yoga;
import tyler.yoga.repositories.YogaRepository;

@Service
public class YogaService {

    @Autowired YogaRepository yogaRepository;

    public void createYoga(Yoga yoga) {
        yogaRepository.save(yoga);
    }

    public List<Yoga> getAllYogas() {
        return yogaRepository.findAll();
    }

    public Yoga getOneYoga(Long id) {
        Optional<Yoga> yoga = yogaRepository.findById(id);
        return yoga.orElse(null);
    }

    public void updateYoga(Yoga yoga) {
        yogaRepository.save(yoga);
    }

    public void destroyYoga(Long id) {
        yogaRepository.deleteById(id);
    }
    
}
