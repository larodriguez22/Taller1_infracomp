/**
 * El ejemplo a continuación muestra cómo manipular un contador en una aplicación monothread. 
 * El ejemplo consiste en llamar 1000 veces un método que incrementa 10000 veces un contador. 
 * Este programa es realizado utilizando únicamente el thread principal de la aplicación.
 * @author la.rodriguez@uniandes.edu.co
 *
 */

// PARTE 1.A
public class ContadorMonoThread {
	private int contador = 0;
	
	public void incrementar() {
		for (int i = 0; i<10000;i++) {
			contador++;
		}
	}
	
	public int getContador() {
		return contador;
	}
	
	public static void main(String[] args) {
		ContadorMonoThread c = new ContadorMonoThread();
		
		for (int i = 0; i<1000; i++) {
			c.incrementar();
		}
		
		System.out.println(c.getContador());
	}
}
