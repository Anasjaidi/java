package com.love.tacos.controller.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/order")
public class orderController {

    @GetMapping("/current")
    public String orderCurrent(Model model) {
        return "orderForm";
    }
}
