package herve.project.pizzaproject.dataaccess.dao;

import herve.project.pizzaproject.dataaccess.repository.PizzaRepository;
import herve.project.pizzaproject.dataaccess.util.ProviderConverter;
import herve.project.pizzaproject.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class PizzaDAO {


    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private ProviderConverter providerConverter;

    public Pizza save(Pizza pizza) {

        return providerConverter
                                .pizzaEntityToPizza(pizzaRepository.save(providerConverter.pizzaToPizzaEntity(pizza)));
    }

    public List<Pizza> findAll(){

        return pizzaRepository.findAll()
                              .stream()
                              .map(pizzaEntity -> providerConverter.pizzaEntityToPizza(pizzaEntity))
                              .collect(Collectors.toList());
    }
}
