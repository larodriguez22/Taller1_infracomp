import java.util.Scanner;

/**
 * Desarrolle un programa en Java que tenga dos threads. El primer thread imprime los números pares entre 1 y un
límite superior recibido por entrada estándar. El segundo thread imprime los números impares entre el mismo
rango. Después de imprimir un número en la consola, el thread debe dormir por una cantidad de milisegundos
especificada desde la creación del thread. Haga dos versiones de este programa, una utilizando la extensión de la
clase Thread y otra mediante la implementación de la interface Runnable o alguna de las dos implementaciones
existentes en Python.
 * @author la.rodriguez@uniandes.edu.co
 *
 */

// IMPLEMENTACION 1: USANDO LA CLASE THREAD EN JAVA
public class EsPar extends Thread {
	
	private int max;
	private boolean esPar;
	public EsPar(int max, boolean esPar) {
		this.max = max;
		this.esPar = esPar;
	}
	
	public void run() {
		try {
			for (int i=0; i<max; i++) {
				if (esPar && (((i+1)%2)==0)) { // true
					System.out.println("Thread 1 (par): "+(i+1));
					Thread.sleep(70);
				}
				else if(!esPar && (((i+1)%2)!=0)){
					System.out.println("Thread 2 (impar): "+(i+1));
					Thread.sleep(50);
				}
			}
		}
		catch(Exception e) { }
		
	}
	
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el limite superior del metodo: "); 
		int maximo = entrada.nextInt();

		System.out.print("Creando primer Thread ");
		EsPar t0 = new EsPar(maximo,true);//par
		System.out.print("Creando segundo Thread ");
		EsPar t1 = new EsPar(maximo,false);//impar
		
		System.out.println("\nEl rango de valores va de 1 a "+maximo);
		
		t0.start();
		t1.start();
	}
}