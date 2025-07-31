package prj_trabalho;

public class Processo {
	 int id;
	 int prioridade; // Quanto menor o valor, maior a prioridade
	 int tempoExecucao;

	public Processo(int id, int prioridade, int tempoExecucao) {
		
		this.id = id;
		this.prioridade = prioridade;
		this.tempoExecucao = tempoExecucao;
		
	}

	public void executar() {
		
		System.out.println("Executando Processo " + id + " (Prioridade " + prioridade + ") por " + tempoExecucao + " segundos...");
		
		try {
			Thread.sleep(tempoExecucao * 1000); // Simula o tempo de execução
			} catch (InterruptedException e) {
	            System.out.println("Erro na execução.");
	        }
	        System.out.println("Processo " + id + " concluído.");
	        }
}
