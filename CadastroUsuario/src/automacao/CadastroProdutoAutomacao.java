package automacao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;

import javax.naming.spi.DirStateFactory.Result;

import dao.CadastroUsuarioDao;
import modelo.CadastroUsuarioModelo;

public class CadastroProdutoAutomacao {       
    public static void main(String[] args) {
        
        CadastroUsuarioModelo cadastroUsuarioModelo = new CadastroUsuarioModelo();
        CadastroUsuarioDao cadastroUsurioDao = new CadastroUsuarioDao();
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o Cpf");
            cadastroUsuarioModelo.setCpf(sc.next());
    
            System.out.println("Digite o nome completo");
            cadastroUsuarioModelo.setNomecompleto(sc.next());
    
            System.out.println("Data de nascimento");
            cadastroUsuarioModelo.setDatanascimento(sc.next());
    
            System.out.println("Sexo");
            cadastroUsuarioModelo.setSexo(sc.next());
    
            System.out.println("Contato");
            cadastroUsuarioModelo.setContato(sc.next());
    
            System.out.println("Endereço");
            cadastroUsuarioModelo.setEndereco(sc.next());
    
            try {
            cadastroUsurioDao.inserircadastroproduto(cadastroUsuarioModelo);
            System.out.println("Cadastro Realizado com sucesso");
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(CadastroProdutoAutomacao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Cadastrado com sucesso");
            }
    }

}
