package laba.spring.controller;

import laba.spring.model.Direction;
import laba.spring.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DirectionController {
    @Autowired
    private DirectionService directionService;

    @RequestMapping("/")
    public ModelAndView home() {
        List<Direction> listDirections = directionService.getUsersWithoutDirectins();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listDirections", listDirections);
        return mav;
    }
}
