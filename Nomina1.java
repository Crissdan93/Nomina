package nomina;

import java.util.Scanner;

public class Nomina1 {
	
	double nominatotal;
	double nominabase;
	double nominasueldoextra;
	double tiempo;
	double sueldoporhora;
	double tiempoextra;
	double sueldohorae;
	double descuento1;
	double descuento2;
	
	
	
	public static void main (String[] args) {
		
		
		Nomina1 nomina = new Nomina1();
		nomina.solicitarDatos();
		
	}
	
	public void solicitarDatos() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido a la calculadora de nómina");
		System.out.print("Ingrese el valor de su tiempo trabajado: ");
		tiempo = scanner.nextDouble();
		System.out.print("Ingrese el valor de su sueldo por hora: ");
		sueldoporhora = scanner.nextDouble();
		System.out.print("Ingrese el tiempo extra trabajado: ");
		tiempoextra = scanner.nextDouble();
		System.out.print("Ingrese el valor de su sueldo por hora extra: ");
		sueldohorae = scanner.nextDouble();
		
		nominabase = sueldoporhora * tiempo;
		nominasueldoextra = sueldohorae * tiempoextra;
		nominatotal = nominabase + nominasueldoextra;
		
		System.out.println("Su nómina total es: " + nominatotal);
		
		
		if(nominatotal < 2000) {
			
			 descuento1= nominatotal * (1- 0.16);
			
			System.out.println("Se aplicara un descuento del 16% en impuestos");
			System.out.println("Su nomina despues de impuestos es: " + descuento1);
			
			
		} else {
			
			descuento2 =nominatotal * (1-0.18);
			
			System.out.println("Se aplicara un descuento del 18% en impuestos");
			
			System.out.println("Su nomina despues de impuestos es: " + descuento2);
				
		}
		
		
        }
    }


