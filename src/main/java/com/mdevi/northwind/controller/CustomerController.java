package com.mdevi.northwind.controller;

import com.mdevi.northwind.model.Customer;
import com.mdevi.northwind.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping()
    public String getCustomersList(Model model) {
        model.addAttribute("customers", customerService.getAllCustomers());
        return "customers";
    }

    @RequestMapping(value = "/CustomerById", method = RequestMethod.GET)
    public String getCustomerByID(Model model, @RequestParam("id") String customerId) {
        Customer customer = customerService.getCustomerById(customerId);
        model.addAttribute("theCustomer", customer);
        return "customer";
    }

    //TODO Create a controller method to select customers by name, country, city
/*

    @RequestMapping(value = "/CustomersByName", method = RequestMethod.GET)
    public String getCustomersByName(Model model, @RequestParam("name") String customerName) {
        model.addAttribute("customers", customerService.getCustomerByName(customerName));
        return "customers";
    }

*/

/*    @RequestMapping(value = "/{filters}", method = RequestMethod.GET)
    public String getCustomersByFilter(Model model, @MatrixVariable(pathVar = "filters")Map<String,List<String>> filtersValues) {
        model.addAttribute("customers", customerService.getCustomersByFilter(filtersValues));
        return "customers";
    }*/


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getAddNewCustomerForm(Model model) {
        Customer customer = new Customer();
        model.addAttribute("theCustomer", customer);
        return "customer";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processAddNewCustomerForm(@ModelAttribute("theCustomer") Customer customer) {
        customerService.save(customer);
        return "redirect:/customers";
    }
}
