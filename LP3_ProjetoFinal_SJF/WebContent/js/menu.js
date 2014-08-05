$(document).ready(function(){
	
	// CADASTRO
	
	$("#cadastrousuario").on('click', function(){
		
		$("#corpo").load("cadastrousuario.jsp");
		
	});
	
	$("#cadastroveiculo").on('click', function(){
		
		$("#corpo").load("cadastroveiculo.jsp");
		
	});
	
	$("#cadastrofuncionario").on('click', function(){
		
		$("#corpo").load("cadastrofuncionario.jsp");
		
	});
	
	// EDIÇÃO
	
	$("#alterausuario").on('click', function(){
		
		$("#corpo").load("alterausuario.jsp");
		
	});
	
	$("#alteraveiculo").on('click', function(){
		
		$("#corpo").load("alteraveiculo.jsp");
		
	});
	
	$("#alterafuncionario").on('click', function(){
		
		$("#corpo").load("alterafuncionario.jsp");
		
	});
	
	// LISTAGEM
	
	$("#listarusuario").on('click', function() {
	
		$.post("listarusuarios.jsp", function(data){
			
			var str = "";
			
			str = "<table id ='tabela-listagem' class='table table-striped'> <thead> <th>NOME</th> <th>SEXO</th> <th>NACIONALIDADE</th> </thead><tbody>";
			
			for(var i=0; i < data.length; i++){
				
				str += "<tr><td>" + data[i].nome + "</td><td>" + data[i].sexo + "</td><td>" + data[i].nacionalidade + "</td></tr>"; 
				
			}
			
			str += "</tbody></table>";
			
			$("#corpo").html(str);
			
		
		}, "json");
		
	});
	
	
	$("#listarveiculo").on('click', function(){
		
		$.post("listarveiculos.jsp", function(data){
			
			var str = "";
			
			str = "<table id ='tabela-listagem' class='table table-striped'> <thead> <th>PLACA</th> <th>MODELO</th> <th>MARCA</th> <th>ANO</th> <th>TIPO</th> </thead><tbody>";
			
			for(var i=0; i < data.length; i++){
				
				str += "<tr><td>" + data[i].placa + "</td><td>" + data[i].modelo + "</td><td>" + data[i].marca + "</td><td>" + data[i].ano + "</td><td>" + data[i].tipo + "</td></tr>"; 
				
			}
			
			str += "</tbody></table>";
			
			$("#corpo").html(str);
			
		
		}, "json");
		
	});
	
	$("#listarfuncionario").on('click', function(){
		
		$.post("listarfuncionarios.jsp", function(data){
			
			var str = "";
			
			str = "<table id ='tabela-listagem' class='table table-striped'> <thead> <th>NOME</th> <th>FUNCAO</th> <th>SALARIO</th> </thead><tbody>";
			
			for(var i=0; i < data.length; i++){
				
				str += "<tr><td>" + data[i].nome + "</td><td>" + data[i].funcao + "</td><td> R$ " + data[i].salario + "</td></tr>"; 
				
			}
			
			str += "</tbody></table>";
			
			$("#corpo").html(str);
			
			
		}, "json");
		
	});
	
});

