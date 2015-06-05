package controller;

import database.Client;
import database.Database;
import gui.FormEvent;

public class Controller {

    private Database database;
    private Client client;

    public Controller() {
        database = new Database();
    }

    public void addClient(FormEvent event) {
        client = new Client(event.getName(), event.getLastName(),
                event.getPhone(), event.getPassword());

        database.addClient(client);
    }

    public void saveToFile() {
        database.saveToFile();
    }


}
