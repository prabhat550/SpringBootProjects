package com.qualifier.autowiring.seviceimpl;

import org.springframework.stereotype.Service;

import com.qualifier.autowiring.service.QualifierAutowiringService;

@Service
public class QualifierAutowiringServiceImplOne implements QualifierAutowiringService {

	@Override
	public String testQualifierAutowiring() {
		System.out.println("In The Service One");
		return "In The Service One";
	}

}
