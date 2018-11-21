package herve.project.pizzaproject.controller;

import herve.project.pizzaproject.model.Pizza;
import herve.project.pizzaproject.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.List;

import static herve.project.pizzaproject.model.Constant.PIZZAS;

@Controller
@RequestMapping(value = "/pizzas")
@SessionAttributes({PIZZAS})
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @ModelAttribute(PIZZAS)
    public List<Pizza> pizzas(){
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model, @ModelAttribute(PIZZAS)List<Pizza> pizzas) {

        if(pizzas == null || pizzas.isEmpty())
            model.addAttribute(PIZZAS, pizzaService.findAll());

        return "integrated:allpizzas";
    }
}
