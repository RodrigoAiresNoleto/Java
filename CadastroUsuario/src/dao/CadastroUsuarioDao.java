package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.CadastroUsuarioModelo;
import util.Conexao;

public class CadastroUsuarioDao{
    public void inserircadastroproduto(CadastroUsuarioModelo novousuario)throws SQLException{
        Connection conexao = Conexao.createConnection();

        String sql = "INSERT INTO public.usuario(\n"+
           "cpf, nomecompleto,datanascimento,sexo, contato, endereco)\n" + 
         //  " telefone)\n"+
            "VALUES (?, ?, ?, ?, ?, ?);";

            

            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, novousuario.getCpf());
            ps.setString(2, novousuario.getNomecompleto());
            ps.setString(3, novousuario.getDatanascimento());
            ps.setString(4, novousuario.getSexo());
            ps.setString(5, novousuario.getContato());
            ps.setString(6, novousuario.getEndereco());

            ps.execute();
    }

    public ResultSet pesquisarcadastro(String codigo )throws SQLException{
    
        Connection conexao = Conexao.createConnection();

        String sql = "SELECT cpf, nomecompleto, datanascimento, sexo, contato,endereco\n" +
                    "FROM public.\"usuario\" WHERE cpf=?;";
        
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, codigo);
        ResultSet rs = ps.executeQuery();
        
        return rs;
      }
}