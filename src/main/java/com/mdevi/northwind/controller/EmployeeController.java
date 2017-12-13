package com.mdevi.northwind.controller;

import com.mdevi.northwind.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employeelist")
    public String getEmployeeList(Model model) {
        model.addAttribute("employees", employeeService.getList());
        return "employees";
    }
}
