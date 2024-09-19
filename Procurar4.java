import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Procurar4 extends JFrame implements ActionListener {
    private JLabel nameLabel, addressLabel, phoneLabel;
    private JTextField nameTextField, addressTextField, phoneTextField;
    private JButton saveButton, getBack;

    public Procurar4() {
        super("Procurar Sobre");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        nameLabel = new JLabel("Nome:");
        nameTextField = new JTextField(20);
        add(nameLabel);
        add(nameTextField);

        addressLabel = new JLabel("Numero:");
        addressTextField = new JTextField(20);
        add(addressLabel);
        add(addressTextField);

        phoneLabel = new JLabel("Pergunta:");
        phoneTextField = new JTextField(50);
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
        Procurar4 pr= new Procurar4();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == getBack){
            setVisible(false);
        }
    }
}
