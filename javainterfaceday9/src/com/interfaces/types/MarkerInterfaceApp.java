package com.interfaces.types;

import com.interfacestypes.marker.RegistrableImpl;
import com.interfacestypes.marker.Student;

public class MarkerInterfaceApp {

	public static void main(String[] args) {
		Student student1 = new Student();
		RegistrableImpl registration = RegistrableImpl.getInstance(student1);
		registration.registerStudent();
	}
}
