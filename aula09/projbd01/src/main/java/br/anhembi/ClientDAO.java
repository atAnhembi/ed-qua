package br.anhembi;

public interface ClientDAO {
    boolean create(Client client);
    Client findById(int id);
    boolean delete(int id);
}
