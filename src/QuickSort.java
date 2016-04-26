
public class QuickSort {
	
	private int[] novoVetor;
	private int pivo;
		
	public QuickSort(int[] vetorAleatorio) {
		this.novoVetor = vetorAleatorio;
		ordenador(0, this.novoVetor.length - 1);
	}
	
	private int partition(int p, int r){
		
		this.pivo = this.novoVetor[r];
		int i = p - 1;
		
		for (int j = p; j < r; j++) {
			if(this.novoVetor[j] <= this.pivo){
				i++;
				SistemaController.swap(this.novoVetor,i,j);
			}
		}
		SistemaController.swap(this.novoVetor,i+1,r);
		
		return i+1;
	}
	
	private void ordenador(int p, int r){
		if(p < r){
			int q = partition(p, r);
			ordenador(p, q-1);
			ordenador(q+1, r);
		}
	}
	
	public int[] getNovoVetor() {
		return novoVetor;
	}
}
