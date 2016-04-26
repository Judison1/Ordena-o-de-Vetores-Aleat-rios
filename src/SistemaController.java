import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class SistemaController {
	
	private int quantidade;
	private int[] vetorAleatorio;
	private int[] vetorOrdenado;
	private String metodoOrdenacao;
	
	public SistemaController(int quantidade,String metodoOrdenacao){
		
		this.quantidade = quantidade; // tamanho do vetor que ser� utilizado.
		
		this.vetorAleatorio = new int[this.quantidade];
		
		this.vetorOrdenado = new int[this.quantidade];
		
		this.metodoOrdenacao = metodoOrdenacao;
		
	}
	
	// gera o vetor aleatrio de tamanho determinado pela variavel quantidade.
	public void gerarVetorAleatorio(){
		
		 Random gerador = new Random();

		for (int i = 0; i < this.quantidade; i++) {
			// gera e adiciona no vetor um numero aleat�rio entre 0 e o maximo inteiro.
			this.vetorAleatorio[i] = gerador.nextInt(Integer.MAX_VALUE - 1); 
			
		}
	}
	public void ordenar(){
		
		if(this.metodoOrdenacao == "Bubble-Sort"){
			BubbleSort bubble = new BubbleSort(vetorAleatorio);
			this.vetorOrdenado = bubble.getNovoVetor();
		}
		if(this.metodoOrdenacao == "Selection-Sort"){
			SelectionSort selection =  new SelectionSort(vetorAleatorio);
			this.vetorOrdenado = selection.getNovoVetor();
		}
		if(this.metodoOrdenacao == "Insertion-Sort"){
			InsertionSort insertion = new InsertionSort(vetorAleatorio);
			this.vetorOrdenado = insertion.getNovoVetor();
		}
		if(this.metodoOrdenacao == "Merge-Sort"){
			MergeSort merge = new MergeSort(vetorAleatorio);
			this.vetorOrdenado = merge.getNovoVetor();
		}
		if(this.metodoOrdenacao == "Quick-Sort"){
			QuickSort quick = new QuickSort(vetorAleatorio);
			this.vetorOrdenado = quick.getNovoVetor();
		}
	}
	
	public boolean verificaOrdenacao(){
		if(this.vetorOrdenado == null){
			return false;
		}else{
			for (int i = 0; i < this.vetorOrdenado.length - 1; i++) {
				if(this.vetorOrdenado[i] > this.vetorOrdenado[i+1]){
					return false;
				}
			}
			return true;
		}
	}
	// armazenar o tempo de execução num arquivo
	public void salvarTempoExecucao(long[] tempoExecucao){
		
		try {
			
			File f = new File("./" + this.metodoOrdenacao + "-" + this.quantidade + ".txt");
			
			if(f.isFile() == false)
				f.createNewFile();
			
			FileWriter  fw = new FileWriter(f);
			
			for (int i = 0; i < tempoExecucao.length; i++) {
				fw.write(tempoExecucao[i] + "\n");
			}
			fw.flush();
			fw.close();
			
			System.out.println("Finalizado.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void swap(int[] vetor,int a, int b){
		int aux = vetor[a];
		vetor[a] = vetor[b];
		vetor[b] = aux;
	}
	public int[] getVetorAleatorio() {
		return vetorAleatorio;
	}
	public int getQuantidade() {
		return quantidade;
	}
}
