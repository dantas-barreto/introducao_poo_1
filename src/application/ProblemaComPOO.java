package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class ProblemaComPOO {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("valores do triangulo x:");
		x.a = teclado.nextDouble();
		x.b = teclado.nextDouble();
		x.c = teclado.nextDouble();
		System.out.println("valores do triangulo y:");
		y.a = teclado.nextDouble();
		y.b = teclado.nextDouble();
		y.c = teclado.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("area x: %.4f%n", areaX);
		System.out.printf("area y: %.4f%n", areaY);
		
		if (areaX > areaY)
			System.out.println("x é maior");
		else
			System.out.println("y é maior");
		
		teclado.close();
	}
}
