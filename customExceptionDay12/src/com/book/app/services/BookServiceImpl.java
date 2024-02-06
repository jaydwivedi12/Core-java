package com.book.app.services;

import java.util.Scanner;

import com.book.app.entities.Book;

public class BookServiceImpl implements BookServices {

	Book[] books;
	Scanner scanner;

	public BookServiceImpl() {
		super();
		this.scanner = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		books= new Book[scanner.nextInt()];
	}

	@Override
	public int printMenu() {
		System.out.println("1.Insert");
		System.out.println("2.update");
		System.out.println("3.Delete");
		System.out.println("4.print Record");
		System.out.println("5.Print all ");
		System.out.println("0.Exit");
		return scanner.nextInt();
	}

	@Override
	public void insertRecord(int idx) {
		books[idx] = new Book();
		System.out.println("Enter Book Id");
		books[idx].setId(scanner.nextInt());
		scanner.nextLine();

		System.out.println("Enter Book Name:");
		books[idx].setName(scanner.nextLine());

		System.out.println("Enter Boo Price:");
		books[idx].setPrice(scanner.nextFloat());
	}

	@Override
	public void deleteRecord() {
		System.out.println("Enter Book id to delete a record");
		int id=scanner.nextInt();
		for (int i = 0; i < books.length; i++) {
			int j = 0;
			if (books[i]!=null&& books[i].getId() == id) {
				for (j = i; j < books.length - 1; j++) {
					books[j] = books[j + 1];
				}
				books[j] = null;
			}
		}
	}

	
	public void updateRecord() {
		System.out.println("Enter Book Id");
		int id=scanner.nextInt();
		for (int i = 0; i < books.length; i++) {
			if (books[i]!=null && books[i].getId() == id) {
				System.out.println(books[i]);
				scanner.nextLine();
				
				System.out.println("Enter New Book name;");
				books[i].setName(scanner.nextLine());

				System.out.println("Enter New Book Price");
				books[i].setPrice(scanner.nextFloat());

			}
		}
	}

	@Override
	public void printRecord(int id) {
		for (Book book : books) {
			if (book!=null && book.getId() == id) {
				System.out.println(book);
			}
		}
	}

	@Override
	public void printAllRecord() {
		for (Book book: books) {
			System.out.println(book);
		}

	}

}
