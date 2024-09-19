import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Listar3 extends JFrame implements ActionListener {
    private JLabel nameLabel, addressLabel, phoneLabel;
    private JTextField nameTextField, addressTextField, phoneTextField;
    private JButton saveButton, getBack;

    public Listar3() {
        super("Listar vendas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        nameLabel = new JLabel("Código:");
        nameTextField = new JTextField(20);
        add(nameLabel);
        add(nameTextField);

        addressLabel = new JLabel("Quantidade:");
        addressTextField = new JTextField(20);
        add(addressLabel);
        add(addressTextField);

        phoneLabel = new JLabel("Artigo:");
        phoneTextField = new JTextField(20);
        add(phoneLabel);
        add(phoneTextField);

        saveButton = new JButton("Listar");
        saveButton.addActionListener(this);
        add(saveButton);
        
        getBack = new JButton("Voltar");
        getBack.addActionListener(this);
        add(getBack);



        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        Listar3 lt= new Listar3();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == getBack){
            setVisible(false);
        }
    }
}
