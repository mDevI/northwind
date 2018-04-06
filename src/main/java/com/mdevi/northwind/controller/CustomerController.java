package com.mdevi.northwind.controller;

import com.mdevi.northwind.model.Customer;
import com.mdevi.northwind.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/customers")
    public String getCustomersList(Model model) {
        model.addAttribute("customers", customerService.getAllCustomers());
        return "customers";
    }

    @RequestMapping(value = "/customers/add", method = RequestMethod.GET)
    public String getAddNewCustomerForm(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customerToBeAdd", customer);
        return "addcustomer";
    }

    @RequestMapping(value = "/customers/add", method = RequestMethod.POST)
    public String processAddNewCustomerForm(@ModelAttribute("customerToBeAdd") Customer customer) {
        customerService.save(customer);
        return "redirect:/customers";
    }
}
