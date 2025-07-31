package prj_trabalho;

import java.util.LinkedList;
import java.util.Queue;


public class RoundRobin {
	
	public static void main(String[] args) {
		
        Queue<Processo2> fila = new LinkedList<>();
        int quantum = 2; // Tempo máximo para cada execução

        // Adicionando processos (id, tempoExecucao)
        fila.add(new Processo2(1, 5));
        fila.add(new Processo2(2, 3));
        fila.add(new Processo2(3, 7));

        // Executando processos de forma cíclica (Round Robin)
        while (!fila.isEmpty()) {
        	
            Processo2 p = fila.poll(); // Retira o primeiro processo da fila
            p.executar(quantum);

            // Se o processo não terminou, ele volta para o final da fila
            if (p.tempoRestante > 0) {
                fila.add(p);
            }
        }

        System.out.println("Todos os processos foram executados.");
    }

}
