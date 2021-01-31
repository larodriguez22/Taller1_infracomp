/**
 * El ejemplo a continuación muestra un ejemplo de una aplicación multithread para la manipulación de un contador. 
 * El ejemplo consiste en crear 1000 threads que al ejecutarse, incremente 10000 veces un contador.
 * @author 57301
 *
 */

// PARTE 1.B
public class ContadorThreads extends Thread{
	
	private static int contador = 0;
	
	public void run() {
		for (int i=0;i<10000;i++) {
			contador++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContadorThreads[] t = new ContadorThreads[1000];
		for(int i = 0; i<t.length;i++) {
			t[i]=new ContadorThreads();
			t[i].start();
		}
		System.out.println(contador);
	}

}
