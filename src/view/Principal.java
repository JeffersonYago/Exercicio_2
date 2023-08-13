package view;
import controller.ControllerVetor;
public class Principal {

	public static void main(String[] args) {
		ControllerVetor pc = new ControllerVetor();
		int vetor [] = {1,3,0,4,4,6,10};
		int m = pc.menor(vetor, 6, vetor[6]);
		System.out.println("menor valor dentro do vetor = " +m);
	}
}
