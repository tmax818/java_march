package tyler.dojoninja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tyler.dojoninja.models.Dojo;
import tyler.dojoninja.repositories.DojoRepository;

@Service
public class DojoService {

    @Autowired DojoRepository dojoRepository;

    public void createDojo(Dojo dojo) {
        dojoRepository.save(dojo);
    }

    public List<Dojo> getAllDojos() {
        return dojoRepository.findAll();
    }
    
}
