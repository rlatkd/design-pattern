package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Application app = new Application(new Scanner(System.in).nextLine());
		app.createUI();
		app.paint();
	}
}