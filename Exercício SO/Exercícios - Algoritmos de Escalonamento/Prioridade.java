package prj_trabalho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Prioridade {
	
	 public static void main(String[] args) {
	        List<Processo> listaProcessos = new ArrayList<>();

	        // Adicionando processos (id, prioridade, tempoExecucao)
	        listaProcessos.add(new Processo(1, 2, 3)); // Prioridade 2
	        listaProcessos.add(new Processo(2, 1, 2)); // Prioridade 1 (maior prioridade)
	        listaProcessos.add(new Processo(3, 3, 1)); // Prioridade 3

	        // Ordenando os processos por prioridade (quanto menor o número, maior a prioridade)
	        Collections.sort(listaProcessos, Comparator.comparingInt(p -> p.prioridade));

	        // Executando os processos na ordem de prioridade
	        for (Processo p : listaProcessos) {
	            p.executar();
	        }

	        System.out.println("Todos os processos foram executados.");
	    }

}
