package application;

import java.util.Scanner;

public class ProblemaSemPOO {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("valores do triangulo x:");
		xA = teclado.nextDouble();
		xB = teclado.nextDouble();
		xC = teclado.nextDouble();
		System.out.println("valores do triangulo y:");
		yA = teclado.nextDouble();
		yB = teclado.nextDouble();
		yC = teclado.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("area x: %.4f%n", areaX);
		System.out.printf("area y: %.4f%n", areaY);
		
		if (areaX > areaY)
			System.out.println("x é maior");
		else
			System.out.println("y é maior");

		teclado.close();
	}
}
                                