package com.ejemplos.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ejemplos.spring.model.Card;




@Controller
@RequestMapping("/")
public class CardController {
	
	@GetMapping
	public String newRegistration(ModelMap model) {
		model.addAttribute("card", new Card());
		System.out.println("newRegistration");
		return "form1";
	}
	
	@PostMapping
	public String saveRegistration(
							@Valid Card card,
							BindingResult result, 
							ModelMap model) {

		if (result.hasErrors()) {
			System.out.println("Tenemos algún error");
			return "form1";
		}

		model.addAttribute("success", "Su tarjeta es correcta , la compra se ha realicado con éxito.");
		return "resumen";
	}
	

}
