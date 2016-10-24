var limit=5;
var counter = 1;

function addNewRow(){
	if(counter>=limit){
		alert("Cannot add new Row");
	}
	else{
		var newRow = document.createElement('div');
		
		newRow.innerHTML += '<input type="text" id="input'+counter+'"></input><input type="button" onclick="deleteRow()" id="deleteButton'+counter+'" value="Delete Row"></input><br />';
		
		document.getElementById('dynamic_input').appendChild(newRow);
		alert("Done");
	}
	
};

function deleteRow(){
	
};
