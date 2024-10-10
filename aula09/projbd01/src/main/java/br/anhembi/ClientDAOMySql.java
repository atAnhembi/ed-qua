package br.anhembi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClientDAOMySql implements ClientDAO {

    private final String url = "jdbc:mysql://localhost:3306/bd_anhembi_uam";
    private final String user = "profuam"; // root
    private final String password = "aula"; //salavo2021

    @Override
    public boolean create(Client client) {
        String sql = "insert into cliente (id, nome, email) values(?,?,?)";
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setInt(1, client.getId());
            preparedStatement.setString(2, client.getName());
            preparedStatement.setString(3, client.getEmail());
            int resp =  preparedStatement.executeUpdate();
            return (resp > 0);
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
            return false;
        }
    }

    @Override
    public Client findById(int id) {
        String sql = "select * from cliente where id = ?;";
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setInt(1, id);

            ResultSet resp =  preparedStatement.executeQuery();
            if(resp.next()) {
                int idCliente = resp.getInt("id");
                String name = resp.getString("nome");
                String email = resp.getString("email");

                Client client = new Client(idCliente, name, email);
                return client;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
            return null;
        }
    }

    @Override
    public boolean delete(int id) {
        String sql = "delete from cliente where id = ?;";
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setInt(1, id);
            
            int resp =  preparedStatement.executeUpdate();
            return (resp > 0);
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
            return false;
        }
    }

}
