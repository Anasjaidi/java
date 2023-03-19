package com.love.tacos.controller.order;

import com.love.tacos.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/orders")
public class orderController {

    @GetMapping("/current")
    public String orderCurrent(Model model) {
        model.addAttribute("order", new Order());
        return "orderForm";
    }

    @PostMapping
    public String processForm(Order order, Model model) {
        log.info(order.toString());
        return "redirect:/";
    }
}
