var counter = 2;
document
		.addEventListener(
				'DOMContentLoaded',
				function addNewRow() {

					if (counter > 5) {
						alert("only 5 entries possible");
					} else {
						var newDiv = document.createElement('div');
						newDiv.setAttribute("class", 'row form-group');

						newDiv.innerHTML = "<h:outputText styleClass='col-md-2 col-sm-2 col-xs-12' value='New Organization: ' for='newOrganization"
								+ counter
								+ "' />"
								+ "<div class='col-md-4 col-sm-4 col-xs-12'> <h:inputText"
								+ "styleClass='form-control col-md-4 col-sm-4 col-xs-12' id='newOrganization"
								+ counter
								+ "'"
								+ "value='#{formBean.priorJob.newOrganization}'> </h:inputText>"
								+ "</div> <h:message styleClass='col-md-6 col-sm-6 col-xs-12'"
								+ "for='newOrganization"
								+ counter
								+ "'></h:message>";

						document.getElementById("priorJobDetails").appendChild(
								newDiv);
						counter++;

					}

				});