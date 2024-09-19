import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Inserir3 extends JFrame implements ActionListener {
    private JLabel nameLabel, addressLabel, phoneLabel;
    private JTextField nameTextField, addressTextField, phoneTextField;
    private JButton saveButton,  getBack;
    private JFrame frame;

    public Inserir3() {
        super("Nova Venda");
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
        Inserir3 ins= new Inserir3();
    }

    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == getBack) {
            setVisible(false);
        }
    }
}
