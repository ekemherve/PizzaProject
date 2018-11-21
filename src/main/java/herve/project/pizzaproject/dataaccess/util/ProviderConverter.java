package herve.project.pizzaproject.dataaccess.util;

import herve.project.pizzaproject.dataaccess.entity.PizzaEntity;
import herve.project.pizzaproject.model.Pizza;
import org.springframework.stereotype.Service;

@Service
public class ProviderConverter {

    public Pizza pizzaEntityToPizza(PizzaEntity pizzaEntity){

        Pizza pizza = new Pizza(pizzaEntity.getId(), pizzaEntity.getName(), pizzaEntity.getDescription());
        return pizza;
    }

    public PizzaEntity pizzaToPizzaEntity(Pizza pizza) {

        PizzaEntity pizzaEntity = new PizzaEntity(pizza.getName(), pizza.getDescription());
        return pizzaEntity;
    }
}
