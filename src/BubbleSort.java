
public class BubbleSort {
	private int[] novoVetor;

	public BubbleSort(int[] vetorAleatorio) {
		 this.novoVetor = vetorAleatorio;
		 ordenar();
	}
	
	private void ordenar(){
		
		for (int i = this.novoVetor.length; i > 0; i--) {
			
			for (int j = 0; j < i - 1; j++) {

				if(this.novoVetor[j] > this.novoVetor[j+1]){
					SistemaController.swap(this.novoVetor, j+1, j);
				}
			}
		}
	}
	
	public int[] getNovoVetor() {
		return novoVetor;
	}
	
	
}
