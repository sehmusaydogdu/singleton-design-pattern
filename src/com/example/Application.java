package com.example;

public class Application {

	public static void main(String[] args) {

		Database db = Database.getInstance();
		db.displayMessage();
	}
}
