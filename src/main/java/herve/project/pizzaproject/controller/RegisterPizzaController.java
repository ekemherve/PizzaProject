package herve.project.pizzaproject.controller;

import herve.project.pizzaproject.model.Pizza;
import herve.project.pizzaproject.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/pizza")
public class RegisterPizzaController {

    @Autowired
    private PizzaService pizzaService;

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {

        model.addAttribute("pizza", new Pizza());

        return "integrated:pizza";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String register(Model model, @ModelAttribute("pizza")Pizza pizza, final BindingResult errors) {

        pizzaService.save(pizza);

        if(errors.hasErrors())
            return "integrated:errors";

        return "redirect:/pizzas";
    }

}
