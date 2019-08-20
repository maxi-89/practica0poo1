import java.util.Scanner;
public class Practica0 {
	public static void main(String[] args) {
		/* System.out.println("0-SALIR");
		System.out.println("1-hola mundo");
		System.out.println("2-suma de dos numeros");
		System.out.println("3-informar cociente de dos numeros");
		System.out.println("4-par o impar");
		System.out.println("5-separar AAAAMMDD");
		System.out.println("6-MAYOR, MENOR E IGUAL");
		System.out.println("7-MAYOR MENOR MEDIO");
		System.out.println("8-DIA DE LA SEMANA ");
		System.out.println("9-PAR O IMPAR");
		System.out.println("10-N NUMEROS NATURALES DESDE CERO");
		System.out.println("11-SUMATORIA DE NUMEROS POR TECLADO");
		System.out.println("12-PROMEDIO DE VALORES POR TECLADO");
		System.out.println("13-NO REALIZADO");
		System.out.println("14-BILLETES CANTIDADES");
		System.out.println("15-ES BISIESTO");
		System.out.println("16-FACTORIAL");
		System.out.println("17-LONGITUD DE CADENA DE CARACTERES");
		System.out.println("18-OBTENER PARTE DE CADENA");
		System.out.println("19-CARGAR, SUMAR, Y ORDENAR VECTORES");
		System.out.println("20-POSICION DE LA CADENA MAS LARGA");
		System.out.println("21-NO TERMINADO");*/
		
		int opcion;
		
		Scanner sc=new Scanner(System.in);
		Ejercicios eje= new Ejercicios();
		eje.menu();
		System.out.println("Ingrese la opcion deseada");
		opcion=sc.nextInt();
		while(opcion!=0) {
			switch(opcion) {
			case 1:
				eje.ejer1();
				break;
			case 2:
				eje.ejer2();
				break;
			case 3:
				eje.ejer3();
				break;
			case 4:
				eje.ejer4();
				break;
			case 5:
				eje.ejer5();
				break;
			case 6:
				eje.ejer6();
				break;
			case 7:
				eje.ejer7();
				break;
			case 8:
				eje.ejer8();
				break;
			case 9:
				eje.ejer9();
				break;
			case 10:
				eje.ejer10();
				break;
			case 11:
				eje.ejer11();
				break;
			case 12:
				eje.ejer12();
				break;
			case 13:
				eje.ejer13();
				break;
			case 14:
				eje.ejer14();
				break;
			case 15:
				eje.ejer15(2019);
				break;
			case 16:
				System.out.println("ingresa un valor para factorizar");
				int num1=sc.nextInt();
				eje.ejer16(num1);
				break;
			case 17:
				System.out.println("ingresar una cadena para calcular la longitud");
				String cadena=sc.nextLine();
				eje.ejer17(cadena);
				break;
			case 18:
				String cadena2;
				int inicio, cant_caracteres;
				System.out.println("ingrese la cadena");
				cadena2=sc.nextLine();
				System.out.println("ingrese numero letra de inicio");
				inicio=sc.nextInt();
				System.out.println("ingrese numero letra final");
				cant_caracteres=sc.nextInt();
				eje.ejer18(cadena2, inicio, cant_caracteres);
				
				break;
			case 19:
				eje.ejer19();
				break;
			case 20:
				eje.ejer20();
				break;
			case 21:
				eje.ejer21();
				break;
			}
			
			
			eje.menu();
			System.out.println("Ingrese la opcion deseada");
			opcion=sc.nextInt();
			
		}
	}

}
