package controller;
public class ControllerVetor {
	public ControllerVetor() {
		super();
	}
public int menor(int vet[], int i, int m) {
	  if(i < 0) {
// i foi definido como parâmetro de busca no vetor, se ele for menor que 0, a busca será encerrada
	    return m;
	  }
// verificando se o valor atual é menor do que o que foi salvo até então
	  if(vet[i] < m) {
	    m = vet[i];
	  }
	  return menor(vet, i-1, m);
	}
}
