package persistencia;

import aplicacao.Socio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SocioDAO {
    private Conexao connection;
    private final String select = "SELECT * FROM\"socio\"";
    private final String selectId = "SELECT * FROM \"socio\" WHERE cpf_s = ?";
    private final String insert = "INSERT INTO \"socio\" (cpf_s, nome_s, data_adm) values (?,?,TO_DATE(?, 'YYYY-MM-DD')) ";
    private final String delete = "DELETE FROM \"socio\" WHERE cpf_s = ?";
    private final String update = "UPDATE \"socio\" SET cpf_s = ?, nome_s = ? , data_adm = TO_DATE(?, 'YYYY-MM-DD') WHERE cpf_s = ?";

    public SocioDAO(){
        this.connection = new Conexao("jdbc:postgresql://localhost:5432/BDSocio", "postgres", "123");
    }
    public void update(int cpf, Socio s){
        try{
            this.connection.conectar();
            PreparedStatement instrucao = connection.getConexao().prepareStatement(this.update);
            instrucao.setInt(1, s.getCpf_s());
            instrucao.setString(2, s.getNome_s());
            instrucao.setString(3, s.getData_adm());
            instrucao.setInt(4,cpf);
            instrucao.execute();
            this.connection.desconectar();
        }catch(Exception e){
            System.out.println("Erro na atualização: " + e.getMessage());
        }
    }

    public void delete(int cpf){
        try{
            this.connection.conectar();
            PreparedStatement instrucao = connection.getConexao().prepareStatement(this.delete);
            instrucao.setInt(1,cpf);
            instrucao.execute();
            this.connection.desconectar();
        }catch(Exception e){
            System.out.println("Erro na exclusão: " + e.getMessage());
        }
    }

    public void insert(Socio s){
        try{
            connection.conectar();
            PreparedStatement instrucao = this.connection.getConexao().prepareStatement(this.insert);
            instrucao.setInt(1, s.getCpf_s());
            instrucao.setString(2,s.getNome_s());
            instrucao.setString(3, s.getData_adm());
            instrucao.execute();
            connection.desconectar();
        }catch(Exception e){
            System.out.println("Erro na inclusão: " + e.getMessage());
        }
    }
    public Socio selectPk(int cpf){
        Socio socio = null;
        try{
            this.connection.conectar();
            PreparedStatement instrucao = this.connection.getConexao().prepareStatement(this.selectId);
            instrucao.setInt(1, cpf);
            ResultSet rs = instrucao.executeQuery();
            if(rs.next())
                socio = new Socio(rs.getInt("cpf_s"), rs.getString("nome_s"), rs.getString("data_adm"));
            this.connection.desconectar();
        }catch(Exception e){
            System.out.println("Erro no relatório por CPF: " + e.getMessage());
        }
        return socio;
    }
    public ArrayList<Socio> select() {
        ArrayList<Socio> socios = new ArrayList<>();
        Socio socio;
        try {
            this.connection.conectar();
            Statement instrucao = this.connection.getConexao().createStatement();
            ResultSet rs = instrucao.executeQuery(this.select);
            while (rs.next()) {
                socio = new Socio(rs.getInt("cpf_s"), rs.getString("nome_s"), rs.getString("data_adm"));
                socios.add(socio);
            }
            this.connection.desconectar();
        } catch (Exception e) {
            System.out.println("Erro na busca: " + e.getMessage());
        }
        return socios;
    }


}
