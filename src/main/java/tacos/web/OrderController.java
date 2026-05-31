package tacos.web;

import tacos.TacoOrder;
import tacos.data.OrderRepository;
import tacos.data.UserRepository;
import tacos.User;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.support.SessionStatus;
import java.security.Principal;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {

    private OrderRepository orderRepo;
    private UserRepository userRepo;

    public OrderController(OrderRepository orderRepo, UserRepository userRepo){
        this.orderRepo = orderRepo;
        this.userRepo = userRepo;
    }

    @GetMapping("/current")
    public String orderForm(Principal principal,
                            @ModelAttribute("tacoOrder") TacoOrder tacoOrder){
        if (principal == null) {
            return "redirect:/login";
        }

        User user = userRepo.findByUsername(principal.getName());

        if (tacoOrder.getDeliveryName() == null) {
            tacoOrder.setDeliveryName(user.getFullname());
        }
        if (tacoOrder.getDeliveryStreet() == null) {
            tacoOrder.setDeliveryStreet(user.getStreet());
        }
        if (tacoOrder.getDeliveryCity() == null) {
            tacoOrder.setDeliveryCity(user.getCity());
        }
        if (tacoOrder.getDeliveryState() == null) {
            tacoOrder.setDeliveryState(user.getState());
        }
        if (tacoOrder.getDeliveryZip() == null) {
            tacoOrder.setDeliveryZip(user.getZip());
        }
        return "orderForm";
    }

    @PostMapping
    public String processOrder(@Valid TacoOrder tacoOrder, Errors errors,
                               SessionStatus sessionStatus,
                               Principal principal){
        if(errors.hasErrors()){
            return "orderForm";
        }

        if (principal != null) {
            User user = userRepo.findByUsername(principal.getName());
            tacoOrder.setUser(user);
        }

        orderRepo.save(tacoOrder);
        sessionStatus.setComplete();

        return "redirect:/";
    }
}