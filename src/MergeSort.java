
public class MergeSort {

	private int[] novoVetor;
	
	public MergeSort(int[] vetorAleatorio) {
		this.novoVetor = vetorAleatorio;
		ordenador(0, this.novoVetor.length -1);
	}
	
	private void merge(int p, int q, int r){
		int n1 = q - p + 1;
		int n2 = r - q;
		int i, j;
		
		int[] vetorLeft = new int[n1 + 1];
		int[] vetorRight = new int[n2 + 1];
		 
		for (i = 0; i < n1; i++) {
			
			vetorLeft[i] = this.novoVetor[p + i];
			
		}
		
		for (j = 0; j < n2; j++) {
			
			vetorRight[j] = this.novoVetor[q + j + 1];
			
		}
		
		vetorLeft[n1] =  Integer.MAX_VALUE;
		vetorRight[n2] = Integer.MAX_VALUE;
		
		i = 0;
		j = 0;
		
		for (int k = p; k <= r; k++) {
			
			if (vetorLeft[i] <= vetorRight[j]){
				this.novoVetor[k] = vetorLeft[i];
				i++;
			} else {
				this.novoVetor[k] =  vetorRight[j];
				j++;
			}
		}
	}
	
	private void ordenador(int p, int r){
		if(p < r){
			int q = (p + r)/2;
			
			ordenador(p, q);
			ordenador(q+1, r);
			
			merge(p, q, r);
		}
	}

	public int[] getNovoVetor() {
		return novoVetor;
	}
}
