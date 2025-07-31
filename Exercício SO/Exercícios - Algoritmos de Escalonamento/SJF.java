package prj_exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SJF {
	
	public static void main(String[] args) {
		
        List<Processo> listaProcessos = new ArrayList<>();
        
        // Adicionando processos
        listaProcessos.add(new Processo(1, 3, 0));
        listaProcessos.add(new Processo(2, 1, 0));
        listaProcessos.add(new Processo(3, 2, 0));
        
        // Ordenando os processos pelo tempo de execução (do menor para o maior)
        Collections.sort(listaProcessos, Comparator.comparingInt(p -> p.tempoExecucao));

        // Executando os processos em ordem de menor tempo de execução primeiro
        for (Processo p : listaProcessos) {
            p.executar();
        }

        System.out.println("Todos os processos foram executados.");
    }

}
