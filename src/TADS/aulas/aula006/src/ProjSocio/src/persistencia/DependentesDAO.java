package persistencia;

import aplicacao.Dependentes;
import aplicacao.Socio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DependentesDAO {
    private final String select = "SELECT * FROM \"dependente\" WHERE cpf_s = ?";
    private final String selectId = "SELECT * FROM \"dependente\" WHERE id = ? and cpf_s = ?";
    private final String deletetCpf = "DELETE  FROM \"dependente\" WHERE cpf_s = ?";
    private final String selectAllId = "SELECT * FROM \"dependente\" WHERE id = ?";
    private final String insert = "INSERT INTO \"dependente\" (id, nome, idade,cpf_s) values (?,?,?,?) ";
    private final String delete = "DELETE FROM \"dependente\" WHERE id = ? and cpf_s = ?";
    private final String update = "UPDATE \"dependente\" SET id = ?, nome = ? , idade = ?, cpf_s = ? WHERE id = ? and cpf_s = ?";
    private final String updateAll = "UPDATE \"dependente\" SET cpf_s = ? WHERE  cpf_s = ?";
    private final Conexao connection;
    public DependentesDAO(){
        this.connection = new Conexao("jdbc:postgresql://localhost:5432/BDSocio", "postgres", "123");
    }
    public void insert(Dependentes d){
        try{
            connection.conectar();
            PreparedStatement instrucao = this.connection.getConexao().prepareStatement(this.insert);
            instrucao.setInt(1, d.getId());
            instrucao.setString(2,d.getNome_d());
            instrucao.setInt(3, d.getIdade());
            instrucao.setInt(4, d.getCpf_s());
            instrucao.execute();
            connection.desconectar();
        }catch(Exception e){
            System.out.println("Erro na inclusão: " + e.getMessage());
        }
    }
    public void delete(int id, int cpf){
        try{
            this.connection.conectar();
            PreparedStatement instrucao = connection.getConexao().prepareStatement(this.delete);
            instrucao.setInt(1,id);
            instrucao.setInt(2,cpf);
            instrucao.execute();
            this.connection.desconectar();
        }catch(Exception e){
            System.out.println("Erro na exclusão: " + e.getMessage());
        }
    }
    public void deleteCpf( int cpf){
        try{
            this.connection.conectar();
            PreparedStatement instrucao = connection.getConexao().prepareStatement(this.deletetCpf);
            instrucao.setInt(1,cpf);
            instrucao.execute();
            this.connection.desconectar();
        }catch(Exception e){
            System.out.println("Erro na exclusão: " + e.getMessage());
        }
    }

    public Dependentes selectId(int id, int cpf){
        Dependentes d = null;
        try{
            this.connection.conectar();
            PreparedStatement instrucao = this.connection.getConexao().prepareStatement(this.selectId);
            instrucao.setInt(1, id);
            instrucao.setInt(2, cpf);
            ResultSet rs = instrucao.executeQuery();
            if(rs.next())
                d = new Dependentes(rs.getInt("id"), rs.getString("nome"), rs.getInt("idade"),rs.getInt("cpf_s"));
            this.connection.desconectar();
        }catch(Exception e){
            System.out.println("Erro no relatório por ID: " + e.getMessage());
        }
        return d;
    }
    public ArrayList<Dependentes> select(int cpf){
        ArrayList<Dependentes> dependetes = new ArrayList<>();
        Dependentes d;
        try {
            this.connection.conectar();
            PreparedStatement instrucao = this.connection.getConexao().prepareStatement(this.select);
            instrucao.setInt(1,cpf);
            ResultSet rs = instrucao.executeQuery();
            while (rs.next()) {
                d = new Dependentes(rs.getInt("id"), rs.getString("nome"), rs.getInt("idade"),rs.getInt("cpf_s"));
                dependetes.add(d);
            }
            this.connection.desconectar();
        } catch (Exception e) {
            System.out.println("Erro na busca: " + e.getMessage());
        }
        return dependetes;
    }
    public Dependentes selectAllId(int id){
        Dependentes d = null;
        try{
            this.connection.conectar();
            PreparedStatement instrucao = this.connection.getConexao().prepareStatement(this.selectAllId);
            instrucao.setInt(1, id);
            ResultSet rs = instrucao.executeQuery();
            if(rs.next())
                d = new Dependentes(rs.getInt("id"), rs.getString("nome"), rs.getInt("idade"),rs.getInt("cpf_s"));
            this.connection.desconectar();
        }catch(Exception e){
            System.out.println("Erro no relatório por ID: " + e.getMessage());
        }
        return d;
    }
    public void update(int id, int cpf, Dependentes d){
        try{
            this.connection.conectar();
            PreparedStatement instrucao = connection.getConexao().prepareStatement(this.update);
            instrucao.setInt(1, d.getId());
            instrucao.setString(2, d.getNome_d());
            instrucao.setInt(3, d.getIdade());
            instrucao.setInt(4,d.getCpf_s());
            instrucao.setInt(5, id);
            instrucao.setInt(6,cpf);
            instrucao.execute();
            this.connection.desconectar();
        }catch(Exception e){
            System.out.println("Erro na atualização: " + e.getMessage());
        }
    }
    public void updateAll(int oldCpf, int newCpf){
        try{
            this.connection.conectar();
            PreparedStatement instrucao = connection.getConexao().prepareStatement(this.updateAll);
            instrucao.setInt(1, newCpf);
            instrucao.setInt(2, oldCpf);
            instrucao.execute();
            this.connection.desconectar();
        }catch(Exception e){
            System.out.println("Erro na atualização: " + e.getMessage());
        }
    }

}
