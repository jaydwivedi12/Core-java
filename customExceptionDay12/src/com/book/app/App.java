package com.book.app;

import com.book.app.services.BookServiceImpl;
import com.book.app.services.BookServices;

public class App {
	public static void main(String[] args) {
		int choice;
		BookServices service = new BookServiceImpl();
		int idx = 0;
		do {
			choice = service.printMenu();
			switch (choice) {
			case 1 -> service.insertRecord(idx++);
			case 2 -> service.updateRecord();
			case 3 -> service.deleteRecord();
			case 4 -> service.printRecord(idx);
			case 5 -> service.printAllRecord();
			case 0 -> System.out.println("Exit....?");
			default -> System.out.println("Invalid Input");

			}
		} while (choice != 0);
	}
}
