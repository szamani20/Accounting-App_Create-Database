package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {

    private JLabel nameLabel;
    private JLabel lastNameLabel;
    private JLabel phoneLabel;
    private JLabel passwordLabel;

    private JTextField nameField;
    private JTextField lastNameField;
    private JTextField phoneField;
    private JPasswordField passwordField;

    private JButton okButton;

    private FormListener formListener;

    public FormPanel() {
        Dimension dimension = getPreferredSize();
        setPreferredSize(dimension);

        nameLabel = new JLabel("Name: ");
        lastNameLabel = new JLabel("Last name: ");
        phoneLabel = new JLabel("Phone number: ");
        passwordLabel = new JLabel("Password: ");

        nameField = new JTextField(10);
        lastNameField = new JTextField(10);
        phoneField = new JTextField(10);

        passwordField = new JPasswordField(10);

        okButton = new JButton("OK");

        phoneField.setText("09");

        okButton.addActionListener(e -> {
            FormEvent event = new FormEvent(FormPanel.this, nameField.getText(), lastNameField.getText(),
                    phoneField.getText(), new String(passwordField.getPassword()));


            if(formListener != null) {
                formListener.formEventOccur(event);
                nameField.setText("");
                lastNameField.setText("");
                phoneField.setText("09");
                passwordField.setText("");
            }
        });

        Border innerBorder = BorderFactory.createTitledBorder("Add Client");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        setLayoutComponents();
    }

    public void setLayoutComponents() {
        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        gc.weighty = 0.1;
        gc.weightx = 2;
        gc.gridy = 0;

        /////////////////first row//////////////////
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.fill = GridBagConstraints.NONE;
        gc.insets = new Insets(0, 0, 0, 5);

        add(nameLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);

        add(nameField, gc);

        ////////////////////next row//////////////////
        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.fill = GridBagConstraints.NONE;
        gc.insets = new Insets(0, 0, 0, 5);

        add(lastNameLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);

        add(lastNameField, gc);

        ////////////////////next row//////////////////
        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.fill = GridBagConstraints.NONE;
        gc.insets = new Insets(0, 0, 0, 5);

        add(phoneLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);

        add(phoneField, gc);

        ////////////////////next row//////////////////
        gc.gridy++;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.fill = GridBagConstraints.NONE;
        gc.insets = new Insets(0, 0, 0, 5);

        add(passwordLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);

        add(passwordField, gc);

        ////////////////////next row//////////////////
        gc.gridy++;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.fill = GridBagConstraints.NONE;
        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);

        add(okButton, gc);

    }

    public void setFormListener(FormListener formListener) {
        this.formListener = formListener;
    }


}
