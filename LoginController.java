package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.zensar.beans.Login;
import com.zensar.beans.Product;
import com.zensar.repo.LoginRepository;
import com.zensar.repo.ProductRepository;

@Controller
public class LoginController {
	
	@Autowired
	LoginRepository loginrepository;
	
	@Autowired
	ProductRepository productrepository;
	
	@RequestMapping("/login")
	public String login(Model m)
	{
		m.addAttribute("command",loginrepository.findAll());
		return "login";
	}
	
	@RequestMapping(value = "/validate" , method =RequestMethod.GET)
	public String validate(Login login,Model m)
	{
		List<Login> list =  loginrepository.findAll();
		int flag = 0;
		
		System.out.println(loginrepository.findAll());
		
		System.out.println(login.getUsername());
		System.out.println(login.getPassword());
		
		for(Login l : list)
		{
			if(l.getUsername().equalsIgnoreCase(login.getUsername()) && l.getPassword().equalsIgnoreCase(login.getPassword()))
			{
				flag = 1;
				break;
			}
			else
				flag = 0;
		}
		
		
		if(flag == 1)
		{
			 List<Product> productlist = productrepository.findAll();   
		     m.addAttribute("productlist",productlist);
			return "home";
		}
		else
			return "error";
	}
	
	
	@RequestMapping("/register")
	public String login()
	{
		return "register";
	}
	
	@RequestMapping(value = "/registeruser" , method =RequestMethod.POST)
	public String registeruser(Login register)
	{
		System.out.println(register.getId());
		System.out.println(register.getUsername());
		System.out.println(register.getPassword());
		loginrepository.save(register);
		return "login";
		
	}
	
	/*
		@RequestMapping("/viewproducts")    
    	public String viewproducts(Model m){    
        List<Product> list=productrepository.findall();    
        m.addAttribute("list",list);  
        return "viewemp";    
    } 
		
	 */
	
	@RequestMapping(value="home/{id}")
	public String productDetails(@PathVariable int id,Model m)
	{
		List<Product> productlist = productrepository.findAll(); 
		for(Product product : productlist)
		{
			if(product.getId() == id)
			{
				m.addAttribute("product",product);
			}
		}
		
		return "productdetails";
	}
	
	
	@RequestMapping("/newhome")
	public String newhome()
	{
		return "NewHome";
	}
	

}
