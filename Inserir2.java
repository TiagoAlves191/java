import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Inserir2 extends JFrame implements ActionListener {
    private JLabel nameLabel, addressLabel, phoneLabel;
    private JTextField nameTextField, addressTextField, phoneTextField;
    private JButton saveButton,  getBack;
    private JFrame frame;

    public Inserir2() {
        super("Novo Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        nameLabel = new JLabel("Nome:");
        nameTextField = new JTextField(20);
        add(nameLabel);
        add(nameTextField);

        addressLabel = new JLabel("Morada:");
        addressTextField = new JTextField(20);
        add(addressLabel);
        add(addressTextField);

        phoneLabel = new JLabel("Numero:");
        phoneTextField = new JTextField(9);
        add(phoneLabel);
        add(phoneTextField);

        saveButton = new JButton("Inserir");
        saveButton.addActionListener(this);
        add(saveButton);
        
        getBack = new JButton("Voltar");
        getBack.addActionListener(this);
        add(getBack);



        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        Inserir2 ins= new Inserir2();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == getBack) {
            setVisible(false);
    }
}
}
