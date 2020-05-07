package com.loanapp.auth.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.loanapp.auth.model.CustomerLoanInfo;
import com.loanapp.auth.model.Product;
import com.loanapp.auth.model.User;
import com.loanapp.auth.service.CustomerInfoService;
import com.loanapp.auth.service.CustomerLoanInfoService;
import com.loanapp.auth.service.ProductInfoService;
import com.loanapp.auth.service.SecurityService;
import com.loanapp.auth.service.UserService;
import com.loanapp.auth.validator.UserValidator;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;
    
    @Autowired
    private CustomerInfoService customerInfoService;
    
    @Autowired
    private ProductInfoService productInfoService;
    
    @Autowired
    private CustomerLoanInfoService customerLoanInfoService;
    
    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/index";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @GetMapping({"/", "/index"})
    public String welcome(Model model) {
        return "index";
    }
    
    @GetMapping("/create-customer")
    public String getCustomer(Model model) {
    	
        return "create-customer";
    }
    
    @GetMapping("/fetch-customer")
    public String getCustomerFromFile(Model model) {
    	String filePath = "D:\\workspace\\eclipse\\loan-app\\src\\main\\resources\\data.txt";
    	customerInfoService.getListProductFromTextFile(filePath);
        return "create-customer";
    }
    
    @GetMapping("/loan-approval")
    public String loanApproval(Model model) {
        return "test";
    }
    
    @GetMapping("/loan-apply")
    public String applyLoan(Model model) {
    	List<Product> list = productInfoService.getAllProducts();
    	model.addAttribute("productList", list);
        return "loan-apply";
    } 
    
    @GetMapping("/loan-list")
    public String getLoanList(Model model) {
    	List<CustomerLoanInfo> list = customerLoanInfoService.getAllLoans();
    	System.out.println(list);
    	model.addAttribute("loanList", list);
        return "loan-list";
    } 
}
