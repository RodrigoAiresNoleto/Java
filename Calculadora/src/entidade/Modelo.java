package entidade;

public class Modelo {
	public float n1;
	public float n2;
	public float res;
	float ad;
	float sub;
	float div;
	float mult;
	//Adição
	public float adicao() {
	ad = n1 + n2;
	
	return ad;
	}
	
	//Subtração
	public float subtração() {
		sub = n1 - n2;
		return sub;
	}
	
	//Divisão
	public float divisao() {
		div = n1 / n2;
		return div;
	}
	
	//Multiplicação
	public float multiplicação() {
		mult = n1 * n2;
		return mult;
	}
	
}
