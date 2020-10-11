package com.WasteManagementSystem.Backend.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerAuthController {

    @Autowired
    private CustomerAuthenticationService CustomerAuthService;

    @PostMapping("/registerCustomer")
    public Customer registerUser(@RequestBody Customer customer) throws Exception {
        String tempEmail = customer.getEmail();
        if (tempEmail != null && !"".equals(tempEmail)) {
            Customer userObj = CustomerAuthService.fetchCustomerByEmail(tempEmail);
            if (userObj != null) {
                throw new Exception("User with " + tempEmail + " is already exist !!!");
            }
        }
        Customer userObj = null;
        userObj = CustomerAuthService.saveCustomer(customer);
        return userObj;
    }

    @PostMapping("/loginCustomer")
    public Customer loginUser(@RequestBody Customer customer) throws Exception {
        String tempEmail = customer.getEmail();
        String tempPass = customer.getPassword();
        Customer userObj = null;
        if (tempEmail != null && tempPass != null) {
            userObj = CustomerAuthService.fetchCustomerByEmailAndPassword(tempEmail, tempPass);
        }
        if (userObj == null) {
            throw new Exception("Bad credentials !!!");
        }

        return userObj;
    }

    @GetMapping("/getCustomer/{email}")
	public Customer getCustomer(@PathVariable String email) {
		return CustomerAuthService.fetchCustomerByEmail(email);
	}

    // @GetMapping("/termstatus")
    // public List<customerstatus> getAllTermStatus(){
    //     return CustomerAuthService.findAllTermStatus();
    // }
    
    @PutMapping("/updateCustomerProfile")
	public Customer updateCustomerProfile(@RequestBody Customer customer) {
    	Customer updatedUser = CustomerAuthService.saveUser(customer);
		return updatedUser;
    }
    
    @GetMapping("/customerstatus")
    public List<Customer> getTermsAceptedCustomers() {
        return CustomerAuthService.findBytermstatus();
    }
    
    
    @GetMapping("/getCustomerByType/{type}")
	public String[] getUserByType(@PathVariable String type) {
		return CustomerAuthService.findCompanyByType(type); 
	}
}
