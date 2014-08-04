$(document).ready(function(){
	
	$("#listarusuario").on('click', function() {
	
		$.post("listarusuarios.jsp", function(data){
			
			var str = "";
			
			str = "<table class='table table-hover'> <tr> <td>NOME</td> <td>SEXO</td> <td>NACIONALIDADE</td> </tr>";
			
			for(var i=0; i < data.length; i++){
				
				str += "<tr><td>" + data[i].nome + "</td><td>" + data[i].sexo + "</td><td>" + data[i].nacionalidade + "</td></tr>"; 
				
			}
			
			str += "</table>";
			
			$("#corpo").html(str);
			
		
		}, "json");
		
	});
	
	
	$("#listarveiculo").on('click', function(){
		
$.post("listarveiculos.jsp", function(data){
			
			var str = "";
			
			str = "<table class='table table-hover'> <tr> <td>PLACA</td> <td>MODELO</td> <td>MARCA</td> <td>ANO</td> <td>TIPO</td> </tr>";
			
			for(var i=0; i < data.length; i++){
				
				str += "<tr><td>" + data[i].placa + "</td><td>" + data[i].modelo + "</td><td>" + data[i].marca + "</td><td>" + data[i].ano + "</td><td>" + data[i].tipo + "</td></tr>"; 
				
			}
			
			str += "</table>";
			
			$("#corpo").html(str);
			
		
		}, "json");
		
	});
	
});

