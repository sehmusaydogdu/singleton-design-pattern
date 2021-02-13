package com.example;

public class Database {

	private static Database instance = null;
	
	// thread safe
	//private static volatile Database instance = null;
	
	private Database() {
	}

	// version - 1
	public static Database getInstance() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}

	/*
	// version - 2
	public static Database getInstance() {
		return instance == null ? new Database() : instance;
	}

	// version - 3
	// multi thread version (thread safe)
	public static Database getInstance() {
		if (instance == null) {
			synchronized (Database.class) {
				instance = new Database();
			}
		}
		return instance;
	}
	*/
	public void displayMessage() {
		System.out.println("single thread created...");
	}
}
