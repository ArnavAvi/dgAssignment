package restful.api.datagrokr.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restful.api.datagrokr.Model.Customers;
import restful.api.datagrokr.Repository.CustomerRepository;

import javax.validation.Valid;

@RestController
public class CustomerController {
@Autowired
CustomerRepository customerRepository;

@PostMapping("/addCustomer")
public Customers addCustomer(@RequestBody Customers customers) {
    Customers c1 = new Customers();
    System.out.println("BackContact Id: "+c1.getCustomerID());
    //c1.setCustomerID(new String(String.valueOf(c1.getId())));

    c1.setCustomerID(customers.getCustomerID());
    c1.setCompanyName(customers.getCompanyName());
    c1.setContactTitle(customers.getContactTitle());
    c1.setContactName(customers.getContactName());
    c1.setAddress(customers.getAddress());
    c1.setCity(customers.getCity());
    c1.setRegion(customers.getRegion());
    c1.setPostalCode(customers.getPostalCode());
    c1.setCountry(customers.getCountry());
    c1.setFax(customers.getFax());
    c1.setPhone(customers.getPhone());
    return customerRepository.save(customers);
}

@PutMapping("/updateCustomer")
    public ResponseEntity<Object> updateCustomer(@Valid @RequestBody Customers customers) {
    /*Customers c1 = new Customers();
    c1.setCustomerID(new String(String.valueOf(c1.getId())));
    c1.setCompanyName(customers.getCompanyName());
    c1.setContactTitle(customers.getContactTitle());
    c1.setContactName(customers.getContactName());
    c1.setAddress(customers.getAddress());
    c1.setCity(customers.getCity());
    c1.setRegion(customers.getRegion());
    c1.setPostalCode(customers.getPostalCode());
    c1.setCountry(customers.getCountry());
    c1.setFax(customers.getFax());
    c1.setPhone(customers.getPhone());*/
    //customers.setCustomerID(new String(String.valueOf(customers.getId())));
    return ResponseEntity.ok(customerRepository.save(customers));
}
}
