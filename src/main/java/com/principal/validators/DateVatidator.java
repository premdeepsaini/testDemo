package com.principal.validators;

import java.util.Calendar;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.principal.validators.DateValidator")
public class DateVatidator implements Validator {

	@Override
	public void validate(FacesContext facesContext, UIComponent component, Object value) throws ValidatorException {

		String dateValue = value.toString();
		Calendar now = Calendar.getInstance();
		int currYear = now.get(Calendar.YEAR);
		System.out.println(currYear);

		if (dateValue.contains("-")) {
			String[] dateParts = dateValue.split("-", 3);
			String dd = dateParts[0];
			String mm = dateParts[1];
			String yyyy = dateParts[2];

			int ddi = Integer.parseInt(dd);
			int mmi = Integer.parseInt(mm);
			int yyyyi = Integer.parseInt(yyyy);

			if (yyyy.length() == 4 && yyyyi <= currYear) {
				if (mmi < 1 || mmi > 12) {
					FacesMessage msg = new FacesMessage("Invalid Date: Month should be between 1 and 12 only");
					msg.setSeverity(FacesMessage.SEVERITY_ERROR);
					throw new ValidatorException(msg);

				} else {
					if (yyyyi % 4 == 0) {
						if (mmi == 2) {
							if (ddi < 1 || ddi > 29) {
								FacesMessage msg = new FacesMessage(
										"Invalid Date: Date should be between 1 and 29 for February of the year "
												+ yyyyi);
								msg.setSeverity(FacesMessage.SEVERITY_ERROR);
								throw new ValidatorException(msg);
							}
						} else if (mmi == 1 || mmi == 3 || mmi == 5 || mmi == 7 || mmi == 8 || mmi == 10 || mmi == 12) {
							if (ddi < 1 || ddi > 31) {
								FacesMessage msg = new FacesMessage(
										"Invalid Date: Date should be between 1 and 31 only");
								msg.setSeverity(FacesMessage.SEVERITY_ERROR);
								throw new ValidatorException(msg);
							}
						} else {
							if (ddi < 1 || ddi > 30) {
								FacesMessage msg = new FacesMessage(
										"Invalid Date: Date should be between 1 and 30 only");
								msg.setSeverity(FacesMessage.SEVERITY_ERROR);
								throw new ValidatorException(msg);
							}
						}
					} else {
						if (mmi == 2) {
							if (ddi < 1 || ddi > 28) {
								FacesMessage msg = new FacesMessage(
										"Invalid Date: Date should be between 1 and 28 for February");
								msg.setSeverity(FacesMessage.SEVERITY_ERROR);
								throw new ValidatorException(msg);
							}
						} else if (mmi == 1 || mmi == 3 || mmi == 5 || mmi == 7 || mmi == 8 || mmi == 10 || mmi == 12) {
							if (ddi < 1 || ddi > 31) {
								FacesMessage msg = new FacesMessage(
										"Invalid Date: Date should be between 1 and 31 only");
								msg.setSeverity(FacesMessage.SEVERITY_ERROR);
								throw new ValidatorException(msg);
							}
						} else {
							if (ddi < 1 || ddi > 30) {
								FacesMessage msg = new FacesMessage(
										"Invalid Date: Date should be between 1 and 30 only");
								msg.setSeverity(FacesMessage.SEVERITY_ERROR);
								throw new ValidatorException(msg);
							}
						}
					}
				}
			} else {
				FacesMessage msg = new FacesMessage("Invalid Date:Correct Please enter date in dd-mm-yyyy format");
				msg.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(msg);
			}
		} else {
			FacesMessage msg = new FacesMessage("Invalid Date:Correct Please enter date in dd-mm-yyyy format");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
	}
}
