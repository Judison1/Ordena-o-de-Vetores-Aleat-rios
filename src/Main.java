
public class Main {

	public static void main(String[] args) {
	
		long timeInicio, timeFim, timeTotal;
		long[] vetorTempoExecucao = new long[500];
		
		// define no construtor a quantidade de vetores que o sistema ira trabalhar. 
		SistemaController sis = new SistemaController(50000, "Quick-Sort");
		
		// repete o teste de acordo com o tamanho declarado do vetorTempoExecucao.
		for (int i = 0; i < vetorTempoExecucao.length; i++) {
			
			sis.gerarVetorAleatorio(); // gera o vetor aleatório
			
			timeInicio = System.nanoTime();
			
			sis.ordenar(); // chamada de ordenação
			
			timeFim = System.nanoTime();
			
			System.out.println(i + " : " +sis.verificaOrdenacao());
			// pega o tempo em nanosegundo da execução entre 'timeInicio' e 'timeFim'.
			timeTotal = timeFim - timeInicio;
			

			// adiciona os tempos de execu��o para serem salvos em arquivos.
			vetorTempoExecucao[i] = timeTotal;
			
		}
		
		// Salva o tempo de execu��o num arquivo com o nome e o tamanho. 
		sis.salvarTempoExecucao(vetorTempoExecucao);
		
		
	}

}
