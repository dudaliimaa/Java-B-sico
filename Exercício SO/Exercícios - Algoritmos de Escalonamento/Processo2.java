package prj_trabalho;

public class Processo2 {
	 int id;
	 int tempoRestante;
	 
	 public Processo2(int id, int tempoExecucao) {
	        this.id = id;
	        this.tempoRestante = tempoExecucao;
	    }

	    public void executar(int quantum) {
	        if (tempoRestante > quantum) {
	            System.out.println("Executando Processo " + id + " por " + quantum + " segundos...");
	            tempoRestante -= quantum;
	        } else {
	            System.out.println("Executando Processo " + id + " por " + tempoRestante + " segundos...");
	            tempoRestante = 0;
	        }

	        try {
	            Thread.sleep(quantum * 1000); // Simula o tempo de execução
	        } catch (InterruptedException e) {
	            System.out.println("Erro na execução.");
	        }

	        if (tempoRestante == 0) {
	            System.out.println("Processo " + id + " concluído.");
	        } else {
	            System.out.println("Processo " + id + " pausado, tempo restante: " + tempoRestante + " segundos.");
	        }
	    }
}
