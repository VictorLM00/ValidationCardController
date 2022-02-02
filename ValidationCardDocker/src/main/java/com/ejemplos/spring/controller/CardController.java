package com.ejemplos.spring.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplos.spring.model.Card;

@RestController
@Validated
@RequestMapping("/card")
public class CardController {
	
	@GetMapping
	public String newRegistration(ModelMap model) {
		model.addAttribute("card", new Card());
		System.out.println("newRegistration");
		return "form1";
	}
	
	@PostMapping
	public String saveRegistration(
							@RequestBody Card card,
							BindingResult result, 
							ModelMap model) {

		if (result.hasErrors()) {
			System.out.println("Tenemos algún error");
			return "form1";
		}

		model.addAttribute("success", "Su tarjeta es correcta , la compra se ha realizado con éxito.");
		return "resumen";
	}
	
	
	@PostMapping("/validate")
	public ResponseEntity<?> validateCard(@Valid @RequestBody Card card) {
		boolean validado = true;
		String auxNum = "";
		
		auxNum = card.getNum1() + "";
		if ((auxNum.length() < 4 || auxNum.length() > 4) && validado) {
			validado = false;
		}
		
		auxNum = card.getNum2() + "";
		if ((auxNum.length() < 4 || auxNum.length() > 4) && validado) {
			validado = false;
		}
		
		auxNum = card.getNum3() + "";
		if ((auxNum.length() < 4 || auxNum.length() > 4) && validado) {
			validado = false;
		}
		
		auxNum = card.getNum4() + "";
		if ((auxNum.length() < 4 || auxNum.length() > 4) && validado) {
			validado = false;
		}
		
		if((card.getMonth() > 12 || card.getMonth() < 1) && validado) {
			validado = false;
		}
       
        //Tolera tarjeta que caducan dos años posterior, pero no tolera ninguna del año inferior a la actual
        if((card.getYear() <  22 || card.getYear() > 24) && validado) {
        	validado = false;
        }
        
        if(!validado) {
        	
    		return (ResponseEntity<?>) ResponseEntity.badRequest();
        }
        	
        else {
        	return ResponseEntity.ok("Card Validated success\n" + card);
        }
		
	}
	

}
