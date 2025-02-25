package springmvcexample;

import java.io.IOException;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor{

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
		System.out.println("this is prehandler....");
		String name = request.getParameter("user");
		if(name.startsWith("d")) {
			response.setContentType("text/html");
			response.getWriter().println("<h1>Invalid name...Name should not start with d</h1>");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("this is post handler");
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("this is after completion");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
	

}
