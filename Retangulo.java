package prjRetangulo;
import java.util.Scanner;
public class Retangulo {
	
	double base;
	double altura;
	double resu;
	Scanner ler=new Scanner(System.in);
	public void area() {
		System.out.println("Digite a altura do retângulo: ");
		this.altura=ler.nextDouble();
		
		System.out.println("Digite a base do retângulo: ");
		this.base=ler.nextDouble();
		
		resu=base*altura;
		
		System.out.println(" Sua área é: "+ resu);
		
	}
	
	public void perimetro() {
		System.out.println("Digite a altura do retângulo: ");
		this.altura=ler.nextDouble();
		
		System.out.println("Digite a base do retângulo: ");
		this.base=ler.nextDouble();
		
		resu=(base+base)+ (altura+altura);
		
		System.out.println(" Seu perimetro é: "+ resu);
		
		
		
	}

}