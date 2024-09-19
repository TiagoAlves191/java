import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Procurar3 extends JFrame implements ActionListener {
    private JLabel nameLabel, addressLabel, phoneLabel;
    private JTextField nameTextField, addressTextField, phoneTextField;
    private JButton saveButton, getBack;

    public Procurar3() {
        super("Procurar Venda");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        nameLabel = new JLabel("Codigo:");
        nameTextField = new JTextField(20);
        add(nameLabel);
        add(nameTextField);

        addressLabel = new JLabel("Quantidade:");
        addressTextField = new JTextField(20);
        add(addressLabel);
        add(addressTextField);

        phoneLabel = new JLabel("Artigo:");
        phoneTextField = new JTextField(9);
        add(phoneLabel);
        add(phoneTextField);

        saveButton = new JButton("Procurar");
        saveButton.addActionListener(this);
        add(saveButton);
        
        getBack = new JButton("Voltar");
        getBack.addActionListener(this);
        add(getBack);



        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        Procurar3 pr= new Procurar3();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == getBack){
            setVisible(false);
        }
    }
}
