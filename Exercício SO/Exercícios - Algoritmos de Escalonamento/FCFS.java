package prj_exercicio;

import java.util.LinkedList;
import java.util.Queue;

public class FCFS {
	
	 public static void main(String[] args) {
		 
	        Queue<Processo> fila = new LinkedList<>();
	        
	        // Adicionando processos na fila
	        fila.add(new Processo(1, 3, 0));
	        fila.add(new Processo(2, 2, 0));
	        fila.add(new Processo(3, 1, 0));

	        // Executando os processos na ordem de chegada
	        while (!fila.isEmpty()) {
	        	
	            Processo p = fila.poll(); // Remove o primeiro da fila
	            p.executar();
	            
	        }

	        System.out.println("Todos os processos foram executados.");
	    }
}
