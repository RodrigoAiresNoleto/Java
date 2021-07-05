
package modelo;


public class CadastroUsuarioModelo {

   private String cpf;
   private String nomecompleto;
   private String datanascimento;
   private String sexo;
   private String contato;
   private String endereco;


   public String getEndereco() {
       return endereco;
   }

   public void setEndereco(String endereco) {
       this.endereco = endereco;
   }

   public String getContato() {
       return contato;
   }

   public void setContato(String contato) {
       this.contato = contato;
   }
   
   public String getSexo() {
       return sexo;
   }

   public void setSexo(String sexo) {
       this.sexo = sexo;
   }

   public String getDatanascimento() {
       return datanascimento;
   }

   public void setDatanascimento(String datanascimento) {
       this.datanascimento = datanascimento;
   }

   public String getNomecompleto() {
       return nomecompleto;
   }

   public void setNomecompleto(String nomecompleto) {
       this.nomecompleto = nomecompleto;
   }
   
    public String getCpf() {
       return cpf;
    }

    public void setCpf(String cpf) {
       this.cpf = cpf;
    }
    
}
