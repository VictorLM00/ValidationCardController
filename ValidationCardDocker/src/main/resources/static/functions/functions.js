function validar(){
	
	//Almacenamos los valores
	var nombre=$('#numero').val();
	
   //Comprobamos la longitud de caracteres
	if (nombre.length<=4){
		return true;
	}
	else {
		alert('Maximo 4 caracteres');
		nombre.style.backgroundColor = "red";
		return false;
	}
}