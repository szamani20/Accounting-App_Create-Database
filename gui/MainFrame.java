package gui;

import controller.Controller;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private FormPanel formPanel;
    private Controller controller;

    public MainFrame() {
        super("Darpa");

        setLayout(new BorderLayout());

        formPanel = new FormPanel();
        controller = new Controller();

        formPanel.setFormListener(event -> {
            controller.addClient(event);
            controller.saveToFile();
        });

        add(formPanel, BorderLayout.CENTER);

        setSize(300, 300);
        setMinimumSize(new Dimension(300, 300));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
