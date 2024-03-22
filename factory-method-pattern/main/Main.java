package main;

import factory.framework.Factory;
import factory.framework.Product;
import factory.idcard.IDCardFactory;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Sanghun Kim");
		Product card2 = factory.create("Soohyun Ahn");
		Product card3 = factory.create("Woosung Lee");
		card1.use();
		card2.use();
		card3.use();
	}
}