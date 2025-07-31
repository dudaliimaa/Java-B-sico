package exercicioSO;

import java.util.Scanner; 

public class GerenciamentoMemoria {

    // Função First-Fit
    public static void firstFit(int[] particoes, int nPart, int[] processos, int nProc) {
        System.out.println("\n== First-Fit ==");

        int[] memoria = new int[nPart]; // Cria cópia das partições
        for (int i = 0; i < nPart; i++) {
            memoria[i] = particoes[i];  // Copia os tamanhos originais
        }

        for (int i = 0; i < nProc; i++) {
            boolean alocado = false;

            for (int j = 0; j < nPart; j++) {
                if (memoria[j] >= processos[i]) {
                    System.out.println("Processo " + processos[i] + "KB alocado na partição de " + memoria[j] + "KB");
                    memoria[j] -= processos[i]; // Reduz espaço
                    alocado = true;
                    break;
                }
            }

            if (!alocado) {
                System.out.println("Processo " + processos[i] + "KB não foi alocado");
            }
        }
    }

    // Função Best-Fit
    public static void bestFit(int[] particoes, int nPart, int[] processos, int nProc) {
        System.out.println("\n== Best-Fit ==");

        int[] memoria = new int[nPart]; // Cópia
        for (int i = 0; i < nPart; i++) {
            memoria[i] = particoes[i];
        }

        for (int i = 0; i < nProc; i++) {
            int melhor = -1;

            for (int j = 0; j < nPart; j++) {
                if (memoria[j] >= processos[i]) {
                    if (melhor == -1 || memoria[j] < memoria[melhor]) {
                        melhor = j;
                    }
                }
            }

            if (melhor != -1) {
                System.out.println("Processo " + processos[i] + "KB alocado na partição de " + memoria[melhor] + "KB");
                memoria[melhor] -= processos[i];
            } else {
                System.out.println("Processo " + processos[i] + "KB não foi alocado");
            }
        }
    }

    // Função Worst-Fit
    public static void worstFit(int[] particoes, int nPart, int[] processos, int nProc) {
        System.out.println("\n== Worst-Fit ==");

        int[] memoria = new int[nPart]; // Cópia
        for (int i = 0; i < nPart; i++) {
            memoria[i] = particoes[i];
        }

        for (int i = 0; i < nProc; i++) {
            int pior = -1;

            for (int j = 0; j < nPart; j++) {
                if (memoria[j] >= processos[i]) {
                    if (pior == -1 || memoria[j] > memoria[pior]) {
                        pior = j;
                    }
                }
            }

            if (pior != -1) {
                System.out.println("Processo " + processos[i] + "KB alocado na partição de " + memoria[pior] + "KB");
                memoria[pior] -= processos[i];
            } else {
                System.out.println("Processo " + processos[i] + "KB não foi alocado");
            }
        }
    }

    // Função principal
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); 

        // Entrada do número de partições
        System.out.print("Digite o número de partições: ");
        int nPart = scanner.nextInt();

        int[] particoes = new int[nPart]; // Vetor das partições

        // Entrada dos tamanhos das partições
        for (int i = 0; i < nPart; i++) {
            System.out.print("Digite o tamanho da partição " + (i + 1) + " (em KB): ");
            particoes[i] = scanner.nextInt();
        }

        // Entrada do número de processos
        System.out.print("\nDigite o número de processos: ");
        int nProc = scanner.nextInt();

        int[] processos = new int[nProc]; // Vetor dos processos

        // Entrada dos tamanhos dos processos
        for (int i = 0; i < nProc; i++) {
            System.out.print("Digite o tamanho do processo " + (i + 1) + " (em KB): ");
            processos[i] = scanner.nextInt();
        }

        // Chamada dos algoritmos
        firstFit(particoes, nPart, processos, nProc);
        bestFit(particoes, nPart, processos, nProc);
        worstFit(particoes, nPart, processos, nProc);

        scanner.close(); 
    }
}
