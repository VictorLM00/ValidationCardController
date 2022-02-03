Feature: El cliente hace una llamada a saveRegistration
	Scenario: cliente hace una llamada a POST /validate
		When el cliente llama a /card
		Given si el cliente pasa el validador
		Then el cliente resive un mensage de success status 200
		Given si el cliente no pasa el validador 
		Then el cliente recibe un mensaje de Error status 400
		
	