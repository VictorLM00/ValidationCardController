Feature: El cliente hace una llamada a saveRegistration
	Scenario: cliente hace una llamada a POST /
		When el cliente llama a /
		Given si el cliente pasa el validador
		Then el cliente resive un mensage de success
		And el cliente resive una pagina con un mesage de compra realizada
		Given si el cliente no pasa el validador
		Then el cliente resive un mensaje de Error
		And el cliente vuelve al formulario
	