import java.util.Scanner;
public class Ejercicios {
	
	
public void menu() {
		
	    System.out.println("0-SALIR");
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
		System.out.println("21-NO TERMINADO");


	}	
	
	public void ejer1() {
		System.out.println("hola mundo");
		
	}
	
	public void ejer2() {
		int num1;
		int num2;
		int suma;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese un numero");
		num1=sc.nextInt();
		System.out.println("ingrese otro numero");
		num2=sc.nextInt();
		suma=num1+num2;
		System.out.println("la suma es :+ " +suma);
	}
	
	public void ejer3() {
		
		Scanner sc= new Scanner(System.in);
		
		float dividendo;
		float divisor;
		float resu;
		
		System.out.println("ingrese un numero: ");
		dividendo=sc.nextFloat();
		
		System.out.println("ingrese el segundo numero:  ");
		divisor=sc.nextFloat();
		
		resu=dividendo/divisor;
		
		System.out.println("el cociente de estos dos numeros es "+resu);
		
		
	}
	
	public void ejer4() {
		int num1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ingrese un numero entero");
		num1=sc.nextInt();
		
		if (num1%2==0) {
			System.out.println("ES PAR");
		}
		else {
			System.out.println("ES IMPAR");
		}
	}
	
	public void ejer5() {
		//Se ingresa por teclado un valor numérico de 8 dígitos, que representa una fecha 
		//con formato AAAAMMDD. Informar por pantalla, separadamente, el año, el mes y el día ingresados
		
		Scanner sc=new Scanner(System.in);
		
		String fecha;
		String año;
		String mes;
		String dia;
		
		System.out.println("ingrese un valor con formato AAAAMMDD");
		fecha=sc.nextLine();
		
		año=fecha.substring(0, 4);
		mes=fecha.substring(4,6);
		dia=fecha.substring(6,8);
		
		System.out.println("el año ingreado es: "+año);
		System.out.println("el mes ingresado es: "+mes);
		System.out.println("el dia ingresado es: "+dia);
		
		
		
	}
	
	public void ejer6() {
		
		// Leer por teclado dos valores numéricos enteros e indicar por pantalla cuál es el mayor
		//y cuál es el menor. Asimismo informar también si los valores ingresados son iguales. 
	int num1;
	int num2;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("ingrese un numero");
	num1=sc.nextInt();
	System.out.println("ingrese otro numero");
	num2=sc.nextInt();
	
	if (num1<num2) {System.out.println("el mayor es "+num2);
	}else if(num1>num2) {System.out.println("el mayor es "+num1);}
	else {
		System.out.println("SON IGUALES!!");}
	}
public void ejer7() {
	
	// Leer por teclado tres valores numéricos enteros e indicar por pantalla 
	//cuál es el mayor, cuál el menor y 
	//cuál está en el medio. Asumir que los tres valores ingresados son distintos. 
	int num1;
	int num2;
	int num3;
	int mayor,medio,menor;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("ingrese un numero");
	num1=sc.nextInt();
	System.out.println("ingrese otro numero");
	num2=sc.nextInt();
	System.out.println("ingrese un tercer valor: ");
	num3=sc.nextInt(); 
	
	if (num1>num2&&num2>num3) {
	mayor=num1;
	medio=num2;
	menor=num3;
	}else if (num2<num3) {
		mayor=num1;
		medio=num3;
		menor=num2;
	}
	

	if(num2>num1&&num1>num3) {
		mayor=num2;
		medio=num1;
		menor=num3;
	}else if (num1<num3) {
		mayor=num2;
		medio=num3;
		menor=num1;
	}
	
	if(num3>num2&&num2>num1) {
		mayor=num3;
		medio=num2;
		menor=num1;
	}else if (num2<num1) {
		mayor=num3;
		medio=num1;
		menor=num2;
	}
}

public void ejer8() {
	/*Se lee desde el teclado un valor numéro entero entre 1 y 7, que corresponde a un día de la semana. 
	 * Informar por pantalla el nombre del día (1 = lunes, 2 = martes, ...);
	 *  asimismo informar también si el valor numérico ingresado es incorrecto*/
	 int num_dia;
	 
	Scanner sc=new Scanner(System.in);
	 
	 System.out.println("ingrese un numero de 1 a 7. y el programa le indicara a que dia corresponde");
	 num_dia=sc.nextInt();
	 if (num_dia>=1&&num_dia<=7) {
		 switch(num_dia) {
		 case 1:
			 System.out.println("LUNES");
			 break;
		 case 2:
			 System.out.println("MARTES");
			 break;
		 case 3:
			 System.out.println("MIERCOLES");
			 break;
		 case 4:
			 System.out.println("JUEVES");
			 break;
		 case 5:
			 System.out.println("VIERNES");
			 break;
		 case 6:
			 System.out.println("SABADO");
			 break;
		 case 7:
			 System.out.println("DOMINGO");
			 break;
		 
		 }
	 }else {
		 System.out.println("INGRESE UN NUMERO ENTRE 1 Y 7");
	 }
	
	
}

public void ejer9() {
	/*Se ingresan por teclado valores numéricos enteros positivos y se informa, para cada número ingresado, 
	 * si es par o impar. Se continúan ingresando números hasta que se recibe un número negativo ó 0. */
	 int num1;
	Scanner sc = new Scanner(System.in);
	System.out.println("ingrese un numero");
	num1=sc.nextInt();
	
	while(num1>0) {
		if (num1%2==0) {
			System.out.println("ES PAR");
		}else {
			System.out.println("ES IMPAR");
		}
		System.out.println("ingrese un numero");
		num1=sc.nextInt();
		
	}
	
}
public void ejer10() {
	/*Desarrollar un programa que muestre por pantalla 
	 * los primeros n números naturales (comenzando por el 0). El valor n se ingresa por teclado
	 */
	 int num1;
	 int i;
	 
	Scanner sc = new Scanner(System.in);
	System.out.println("ingrese la cantidad de numeros naturales que quiere que aparescan por pantalla");
	num1=sc.nextInt();
	for (i=0;i<=num1;i++) {
		System.out.println("los numeros naturales son "+i);
	}
	
}
public void ejer11() {
	/* Calcular e informar por pantalla la sumatoria de un conjunto de valores 
	 * numéricos reales ingresados por teclado. El ingreso de números finaliza al recibirse un 0. 
	 */
	int num1;
	int acu_total=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("ingrese valores a sumar");
	num1=sc.nextInt();
	while(num1!=0) {
		acu_total=acu_total+num1;
		System.out.println("ingrese valores a sumar");
		num1=sc.nextInt();
	}
	System.out.println("el total acumulado es "+acu_total);
}

public void ejer12() {
	/*Cacular e informar por pantalla el promedio de un conjunto de valores numéricos
reales ingresados por teclado. El ingreso de números finaliza al recibirse un 0. 
	*/
	int num1;
	int acu_total=0;
	int promedio;
	int cont=0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("ingrese valores a sumar");
	num1=sc.nextInt();
	while(num1!=0) {
		cont++;
		acu_total=acu_total+num1;
		System.out.println("ingrese valores a sumar");
		num1=sc.nextInt();
	}
	promedio=acu_total/cont;
	System.out.println("el total acumulado es "+acu_total);
	System.out.println("el promedio de los numeros ingresados es:" +promedio);
}

public void ejer13() {}

public void ejer14() {
	/*Se ingresa por consola un 
	 * número entero que representa un sueldo que se debe pagar.
	 *  Informar por pantalla cuántos billetes de $100, $50, $20, $10, $5, $2 y $1 
	 *  se necesitan para poder pagarlo, comenzando por los billetes de nominación más alta. */
	
	int sueldo;
	int b_100;
	int b_50;
	int b_20;
	int b_10;
	int b_5;
	int b_2;
	int b_1;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("ingrese el sueldo a pagar");
	sueldo=sc.nextInt();
	
	b_100=sueldo/100;
	b_50=(sueldo%100)/50;
	b_20=((sueldo%100)%50)/20;
	b_10=(((sueldo%100)%50)%20)/10;
	b_5=((((sueldo%100)%50)%20)%10)/5;
	b_2=(((((sueldo%100)%50)%20)%10)%5) /2;
	b_1=((((((sueldo%100)%50)%20)%10)%5) %2)/1;
	
	System.out.println("el sueldo se abonara con: ");
	System.out.println(+b_100+"  billetes de 100");
	System.out.println(+b_50+"  billetes de 50");
	System.out.println(+b_20+"  billetes de 20");
	System.out.println(+b_10+"  billetes de 10");
	System.out.println(+b_5+"  billetes de 5");
	System.out.println(+b_2+"  billetes de 2");
	System.out.println(+b_1+"  billetes de 1");
	
	
	
}
public boolean ejer15(int año) {
	/*Programar una función esBisiesto, que reciba como parámetro 
	un año cualquiera y devuelva verdadero si el año es bisiesto, o falso en caso contrario*/
	
	boolean bisiesto=false;
	
	if(año%4==0) {
		bisiesto=true;
	}
	return bisiesto;
	
}

public void ejer16(int num1) {
	
//* Programar una función calcularFactorial, 
// * que reciba como parámetro un número entero y devuelva su factorial  
// *  */
	int factorial=1;
	System.out.println("el factorial de "+num1+"es");
	if (num1<=1) {
		factorial=num1;
	}
	else {
		while(num1>0) {
		
		num1--;
		
		System.out.println(factorial=num1);
		
		}
		
	}
	
}

public int ejer17(String cadena) {
	/* Desarrollar una funcion obtenerLongitud, 
	 * que reciba por parámetro una cadena de caracteres y devuelva su longitud. */
int longitud;
longitud=cadena.length();
	
	return longitud;
}

public String ejer18(String cadena2, int inicio, int cant_caracteres) {
	/* Desarrollar una función obtenerParteCadena, que reciba tres parámetros: una cadena de caracteres y dos valores numéricos: ​inicio 
	 ​ y ​cantidadCaracteres
	 ​ . La función debe devolver una porción de la cadena recibida por parámetro, comenzando en ​inicio 
	 ​ y abarcando la cantidadCaracteres 
	 ​ especificada. */
	String porcion_cadena=cadena2.substring(inicio, cant_caracteres);
	
	
	return porcion_cadena;
}

public void ejer19() {
	/* Desarrollar un programa que reciba por teclado la cantidad K de números enteros
	 *  a almacenar en un vector. Luego, cargar dicho vector con números ingresados 
	 *  también desde el teclado. Finalmente, mostrar por pantalla:
	 *   a. la sumatoria de los 
	 *  números cargados en el vector 
	 *  b. los números del vector en el orden en que se ingresaron 
	 *  c. 
	 *  los números del vector pero en orden inverso 
	 *  
	 */
	int num_vec;
	int [] vec1;
	int i;
	int suma=0;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ingrese la cantidad de numeros a ingresar");
	num_vec=sc.nextInt();
	vec1=new int [num_vec];
	
	for(i=0;i<vec1.length;i++) {
		System.out.println("ingrese un valor entero");
		vec1[i]=sc.nextInt();
	
	}
	
	for (i=0;i<vec1.length;i++) {
		suma=suma+vec1[i];
		
	}
	
	System.out.println("la suma de los valores del vector es "+suma);
	
	for (i=0;i<vec1.length;i++) {
		System.out.println(vec1[i]);
		
	}
	
	for (i=vec1.length-1;i>=0;i--) {
		System.out.println(vec1[i]);
	}
}

public void ejer20() {
	/* Desarrollar un programa que reciba por teclado 3 cadenas de caracteres
	 *  y las almacene en un vector. Informar por pantalla en qué posición del 
	 *  vector se halla la cadena más larga. 
	 */
	Scanner sc=new Scanner(System.in);
	String [] vec1;
	int i;
	int mayor;
	
	vec1=new String[3];
	
	for(i=0;i<vec1.length;i++) {
	System.out.println("ingrese una cadena");
	vec1[i]=sc.nextLine();
	}
	mayor=vec1[0].length();
	
	for(i=0;i<vec1.length;i++) {
		if (vec1[i].length()>mayor) {
			
			System.out.println("la posicion de la cadena mayor es  "+i);
		}
	}}
	
	public void ejer21() {
	
	/*Se ingresa un conjunto de ternas de valores, que representan el año, el grado
	 *  y la cantidad de alumnos que se inscribieron en un colegio durante ese año y para ese
	 *  grado en particular. En este colegio los alumnos cursan desde el primero hasta
	 *   el séptimo año. Se pide: 
	 *   a. mostrar un listado por pantalla, informando para cada año, 
	 *   la cantidad de inscriptos por grado
	 *    b. mostrar un listado por pantalla,
	 *    informado para cada grado, la cantidad de inscriptos por año 
 
	 */
	
	int i;
	int j;
	int p;
	int  vec_alumno[][][];
	
	Scanner sc=new Scanner(System.in);
	
	vec_alumno=new int [3][3][3];
	
	
	for (i=0;i<vec_alumno.length;i++) {
		for(j=0;j<vec_alumno[i].length;j++) {
			for(p=0;p<vec_alumno[j].length;p++) {
				System.out.println("introduzca el elemento ["+i+","+j+","+p+"]");
				vec_alumno[i][j][p]=sc.nextInt();
			}
		}
		}}
	


	
}

	


