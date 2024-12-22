package com.springcore.lifecycle;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@jakarta.annotation.PostConstruct
	public void start() {
		System.out.println("starting method");
	}
	
	@jakarta.annotation.PreDestroy
	public void destroy() {
		System.out.println("ending method");
	}
}
