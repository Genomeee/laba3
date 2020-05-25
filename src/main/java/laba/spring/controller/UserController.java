package laba.spring.controller;

import laba.spring.model.User;
import laba.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/sortedUsers")
    public ModelAndView sortedUsers() {
        List<User> listUser = userService.users();
        ModelAndView mav = new ModelAndView("users");
        mav.addObject("listUser", listUser);
        return mav;
    }
}
