import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Remover4 extends JFrame implements ActionListener {
    private JLabel nameLabel, addressLabel, phoneLabel;
    private JTextField nameTextField, addressTextField, phoneTextField;
    private JButton saveButton, getBack;

    public Remover4() {
        super("Remover Sobre");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        nameLabel = new JLabel("Nome:");
        nameTextField = new JTextField(20);
        add(nameLabel);
        add(nameTextField);

        addressLabel = new JLabel("Numero:");
        addressTextField = new JTextField(9);
        add(addressLabel);
        add(addressTextField);

        phoneLabel = new JLabel("Pergunta:");
        phoneTextField = new JTextField(20);
        add(phoneLabel);
        add(phoneTextField);

        saveButton = new JButton("Remover");
        saveButton.addActionListener(this);
        add(saveButton);
        
        getBack = new JButton("Voltar");
        getBack.addActionListener(this);
        add(getBack);



        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        Remover4 rem =  new Remover4();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == getBack){
            setVisible(false);
        }
    }
}

