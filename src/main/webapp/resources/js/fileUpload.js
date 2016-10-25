function fileSelected() {
  var file = document.getElementById('fileToUpload').files[0];
  if (file) {
    var fileSize = 0;
    if (file.size > 1024 * 1024)
      fileSize = (Math.round(file.size * 100 / (1024 * 1024)) / 100).toString() + 'MB';
    else
      fileSize = (Math.round(file.size * 100 / 1024) / 100).toString() + 'KB';
          
    document.getElementById('fileName').innerHTML = 'Name: ' + file.name;
    document.getElementById('fileSize').innerHTML = 'Size: ' + fileSize;
    document.getElementById('fileType').innerHTML = 'Type: ' + file.type;
    var reader = new FileReader();
    reader.readAsDataURL(file);
    
    console.log(reader.readAsDataURL(file));
  }
}

function uploadFile(){
	
	var files = document.getElementById('fileToUpload').files[0];
	
	var formData = new FormData();
	for (var i = 0; i < files.length; i++) {
	  formData.append('file', files[i]);
	}

	// now post a new XHR request
	var xhr = new XMLHttpRequest();
	xhr.open('POST', '/');
	xhr.onload = function () {
	  if (xhr.status === 200) {
	    alert('all done: ' + xhr.status);
	  } else {
	    alert('Something went terribly wrong...');
	  }
	};

	xhr.send(formData);
}