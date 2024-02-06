package com.customexception;

import com.customexception.entities.Student;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		Student[] studentArray = new Student[3];
		studentArray[0] = new Student(1, "xyz", 20);

		try {
			printRecord(0, studentArray);
		} catch (RecordNotFoundException e) {
			e.printStackTrace();
		}
		
		getRecordWith(-1, studentArray);
	}

	static void printRecord(int index, Student[] students) throws RecordNotFoundException {
		try {
			System.out.println(students[index].getName());
		} catch (NullPointerException e) {
			throw new RecordNotFoundException("Record with Index " + index +" Not found");
		}
	}

	static void getRecordWith(int id, Student[] students) {
		if (id < 0) {
			throw new InvalidException("Id is Negative");
		} else {
			System.out.println(students[id]);
		}
	}
}
