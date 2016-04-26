
public class SelectionSort {
	private int[] novoVetor;
	private int low;
	
	public SelectionSort(int[] vetorAleatorio) {
		 this.novoVetor = vetorAleatorio;
		 ordenar();
		 
	}
	
	private void ordenar(){
		for (int i = 0; i < this.novoVetor.length - 1; i++) {
			low = i;
			for (int j = i + 1; j < this.novoVetor.length; j++) {
				if(this.novoVetor[j] < this.novoVetor[low]){
					low = j;
				}
			}
			if(low != i){
				SistemaController.swap(this.novoVetor, low, i);
			}
		}
	}
	
	public int[] getNovoVetor() {
		return novoVetor;
	}

}
