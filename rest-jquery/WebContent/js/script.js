$(document).ready(function() {
	console.log("jQuery is loaded!");
	
	$.ajax({
		url: "http://localhost:8080/rest-demo2/rest/products/viewall"
	}).then(function(data){
		console.log(data);
	})
	
/*	
	$("#btn").click(function() { 
		var pId = $("#t1").val(); 
		$.ajax({ 
			url: "http://localhost:8080/rest-demo2/rest/products/view/" + pId 
		}).then(function(data) { 
			console.log(data); 
		}) 
	})
*/
	$("#btn").click(function() {
		var pid = $("#pid").val();
		var name = $("#pname").val();
		var price = $("#price").val();
		
		$.ajax({
			
			url: "http://localhost:8080/rest-demo2/rest/products/create",
			type: "POST",
			data: JSON.stringify({
				"id" : pid,
				"name" : name,
				"price" : price
			}),
			dataType: "json",
			contentType: "application/json; charset=utf-8",
			success: function(data) {
				console.log("Success: " + data);
			}
			
		})
	});
})