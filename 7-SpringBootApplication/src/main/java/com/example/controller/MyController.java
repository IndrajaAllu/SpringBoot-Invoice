package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MyController 
{
	@RequestMapping("/")  
 	public String home() 
 	{  	 	
 		return "invoice"; 
 	} 
 	@RequestMapping("/result") 
 	public String printBill(@RequestParam int id,@RequestParam String name,@RequestParam long number,@RequestParam String productName,@RequestParam double price,@RequestParam int quantity,ModelMap model) 
 	{  	 	
 		model.put("key1",id);
 		model.put("key2",name);
 		model.put("key3",number);
 		model.put("key4",productName);
 		model.put("key5",price);
 		model.put("key6",quantity);
 		
 		double total,discount;
 		total=price*quantity;
 		model.put("key7",total);
 		
 		if(total>5000)
 		{
 			discount=(total*10)/100;	
 	    } 
 		else if(total<10000)
 		{
 			discount=(total*20)/100;
 		}
 		else
 		{
 			discount=(total*30)/100;
 		}
 		double invoice=(total-discount);
 		model.put("key8",invoice);
 		
 		return "result";
    } 
}
