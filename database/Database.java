package database;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Database {

    private List<Client> clientList = new LinkedList<Client>();

    public void addClient(Client client) {
        clientList.add(client);
    }

    public void saveToFile() {
        String fileName = "database.cli";
        File file = new File(fileName);

        FileOutputStream fos;
        ObjectOutputStream oos;

        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);

            Client clients[] = clientList.toArray(new Client[clientList.size()]);

            oos.writeObject(clients);

            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
