package com.nedeleva.springmvc.сontroller;

import com.nedeleva.springmvc.repository.HospitalDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    private final HospitalDAO hospitalDAO;

    @Autowired
    public UserController(HospitalDAO hospitalDAO) {
        this.hospitalDAO = hospitalDAO;
    }

    @GetMapping("/users")
    public String allPatients(Model model) {
        model.addAttribute("patients", hospitalDAO.allPatients());
        model.addAttribute("doctors", hospitalDAO.allDoctors());
        return "users";
    }
}
