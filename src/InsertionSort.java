
public class InsertionSort {

	private int[] novoVetor;
	private int key, j;
	
	public InsertionSort(int[] vetorAleatorio) {
		 this.novoVetor = vetorAleatorio;
		 ordenar();
		 
	}
	
	private void ordenar(){
		
		for (int i = 1; i < this.novoVetor.length; i++) {
			
			key = this.novoVetor[i];
			j = i - 1;
			
			while (j >= 0 && this.novoVetor[j] > key) {
				this.novoVetor[j+1] =  this.novoVetor[j];
				j = j - 1;
			}
			
			this.novoVetor[j + 1] = key;
		}
		
	}
	
	public int[] getNovoVetor() {
		return novoVetor;
	}
}
