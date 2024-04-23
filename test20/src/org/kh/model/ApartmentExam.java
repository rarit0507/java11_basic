package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Apartment;

public class ApartmentExam {

	public static void main(String[] args) {
		List<Apartment> aptList = new ArrayList<>();
		
		for(int i = 0; i<10; i++) {
			Apartment apt = new Apartment("종로"+i+"가", "kh아파트", i, i, 1200, 32);
			aptList.add(apt);
		}
		for(Apartment apt:aptList) {
			System.out.println(apt.toString());
		}
	}

}
