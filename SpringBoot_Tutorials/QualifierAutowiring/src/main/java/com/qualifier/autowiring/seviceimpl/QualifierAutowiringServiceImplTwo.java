package com.qualifier.autowiring.seviceimpl;

import org.springframework.stereotype.Service;

import com.qualifier.autowiring.service.QualifierAutowiringService;

@Service
public class QualifierAutowiringServiceImplTwo implements QualifierAutowiringService {

	@Override
	public String testQualifierAutowiring() {
		System.out.println("In The Service Two");
		return "In The Service Two";

	}

}
