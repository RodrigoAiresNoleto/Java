package entidade;

public class Modelo {
	public float n1;
	public float n2;
	public float res;
	float ad;
	float sub;
	float div;
	float mult;
	//Adi��o
	public float adicao() {
	ad = n1 + n2;
	
	return ad;
	}
	
	//Subtra��o
	public float subtra��o() {
		sub = n1 - n2;
		return sub;
	}
	
	//Divis�o
	public float divisao() {
		div = n1 / n2;
		return div;
	}
	
	//Multiplica��o
	public float multiplica��o() {
		mult = n1 * n2;
		return mult;
	}
	
}
