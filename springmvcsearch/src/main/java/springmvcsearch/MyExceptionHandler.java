package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

	//Handling exception in our spring mvc	
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg","Null Pointer exception has occured");
		return "null_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHandleNumberFormat(Model m) {
		m.addAttribute("msg","Number Format exception has occured");
		return "null_page";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandleGeneric(Model m) {
		m.addAttribute("msg","Exception has occured");
		return "null_page";
	}
}
