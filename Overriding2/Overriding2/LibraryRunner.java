package com.xworkz.Overriding2;

public class LibraryRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in Libraryrunner");

		Library library = new Library();
		library.displyaInfo();
		System.out.println("*********Child ref**********");
		Library book = new Books();
		book.displyaInfo();

	}
}
