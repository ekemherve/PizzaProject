package herve.project.pizzaproject.service;

import herve.project.pizzaproject.dataaccess.dao.PizzaDAO;
import herve.project.pizzaproject.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {

    @Autowired
    private PizzaDAO pizzaDAO;

    public Pizza save(Pizza pizza) {

        return pizza != null ? pizzaDAO.save(pizza) : null;
    }

    public List<Pizza> findAll() {

        return pizzaDAO.findAll();
    }
}
