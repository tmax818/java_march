package tyler.dojoninja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tyler.dojoninja.models.Ninja;
import tyler.dojoninja.repositories.NinjaRepository;
@Service
public class NinjaService {

    @Autowired NinjaRepository ninjaRepository;

    public void createNinja(Ninja ninja) {
        ninjaRepository.save(ninja);
    }
    
}
