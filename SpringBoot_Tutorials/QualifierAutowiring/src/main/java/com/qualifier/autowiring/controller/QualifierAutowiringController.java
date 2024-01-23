package com.qualifier.autowiring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qualifier.autowiring.service.QualifierAutowiringService;


@RestController
public class QualifierAutowiringController {


	@Autowired(required = true)
	@Qualifier(value = "qualifierAutowiringServiceImplOne")	
	QualifierAutowiringService 	service;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testQualifier() {
		return service.testQualifierAutowiring();
	}
	
	
}
