package entidade;

public class Modelo {
    public String Nome;
    public double SalarioBruto;
    public double imposto;
    public double porc;
    public double calliquido;


    public double calSalario(){
      calliquido = SalarioBruto - imposto;
      return calliquido;
    }

    public double aumentoSalario(){

        double calp = SalarioBruto * porc/100.0;
        double calpc = calliquido + calp;
        return calpc;
    }
}
