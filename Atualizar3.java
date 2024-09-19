import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Atualizar3 extends JFrame implements ActionListener {
    private JLabel nameLabel, addressLabel, phoneLabel;
    private JTextField nameTextField, addressTextField, phoneTextField;
    private JButton saveButton, getBack;

    public Atualizar3() {
        super("Atualizar vendas");
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

        saveButton = new JButton("Atualizar");
        saveButton.addActionListener(this);
        add(saveButton);
        
        getBack = new JButton("Voltar");
        getBack.addActionListener(this);
        add(getBack);


        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        Atualizar3 pr= new Atualizar3();
    }

    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == getBack){
            setVisible(false);
        }
    }
}
