package ie.atu.exam1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

     List<CustomerDetails> customers = new ArrayList<>();
    public void addCustomer(CustomerDetails customerDetails) {
        customers.add(customerDetails);
    }

    public CustomerDetails getCustomerById(int id) {
        return customers.get(id);
    }
}
