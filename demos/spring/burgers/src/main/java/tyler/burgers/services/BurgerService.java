package tyler.burgers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tyler.burgers.models.Burger;
import tyler.burgers.repositories.BurgerRepository;

@Service
public class BurgerService {
    @Autowired BurgerRepository burgerRepository;

    public void createBurger(Burger burger) {
        burgerRepository.save(burger);
    }

    public List<Burger> getAllBurgers(){
        return burgerRepository.findAll();
    }
}
