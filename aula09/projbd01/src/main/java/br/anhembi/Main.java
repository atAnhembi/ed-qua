package br.anhembi;

public class Main {
    public static void main(String[] args) {
        ClientDAO clientDAO = new ClientDAOMySql();

        // Client client = new Client(1, "Emerson", "emerson@email.com");

        // boolean resp = clientDAO.create(client);
        // if(resp) {
        //     System.out.println("Cliente inserido no BD");
        // } else {
        //     System.out.println("Falha na inserção");
        // }

        // Client client = clientDAO.findById(1);
        // System.out.println(client);

        boolean apagou = clientDAO.delete(1);

        if(apagou) {
            System.out.println("apagou");
        } else {
            System.out.println("Não apagou");
        }

    }
}