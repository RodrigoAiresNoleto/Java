package entidade;

public class Modelo {

	public int vc;
	public int cv;
	public int vp;
	public int res;
	
	public int Quantidadepecas() {
		
		res = (cv*vp)+vc;
		
		return res;
	}
	
	
	
	
}
