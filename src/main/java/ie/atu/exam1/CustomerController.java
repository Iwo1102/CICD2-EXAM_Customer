package ie.atu.exam1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody CustomerDetails customer) {
        customerService.addCustomer(customer);
        return "added customer " + customer.getName() + " ID: " + customer.getCustomerId();
    }

    @GetMapping("/customers/{id}")
    public CustomerDetails getCustomer(@PathVariable int id) {
        return customerService.getCustomerById(id);
    }

}
