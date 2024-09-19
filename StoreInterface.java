import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class StoreInterface implements ActionListener {
    private JFrame frame;
    private JLabel logoLabel;
    private JMenuBar menuBar;
    private JMenu TeleMenu, ClienteMenu, PcMenu, SobreMenu ;
    private JMenuItem Inserir1, Inserir2, Inserir3, Inserir4,Remover1,Remover2,Remover3,Remover4,Listar1,Listar2,Listar3,Listar4,Procurar1,Procurar2,Procurar3,Procurar4, atualizar1,atualizar2,atualizar3,atualizar4;
    
    public StoreInterface() {
        frame = new JFrame("Bob's Technology");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon logo = new ImageIcon("Logo.png");
        logoLabel = new JLabel("", logo, JLabel.CENTER);
        logoLabel.setPreferredSize(new Dimension(800, 600));
        
        menuBar = new JMenuBar();
        TeleMenu = new JMenu("Equipamento");
        ClienteMenu = new JMenu("Clientes");
        PcMenu = new JMenu("Vendas");
        SobreMenu = new JMenu("Sobre");
        
        Inserir1 = new JMenuItem("Inserir");
        Remover1 = new JMenuItem("Remover");
        Listar1 = new JMenuItem("Listar");
        Procurar1 = new JMenuItem("Procurar");
        atualizar1 = new JMenuItem("Atualizar");
        
        Inserir2 = new JMenuItem("Inserir");
        Remover2 = new JMenuItem("Remover");
        Listar2 = new JMenuItem("Listar");
        Procurar2 = new JMenuItem("Procurar");
        atualizar2 = new JMenuItem("Atualizar");
        
        Inserir3 = new JMenu("Inserir");
        Remover3 = new JMenuItem("Remover");
        Listar3 = new JMenuItem("Listar");
        Procurar3 = new JMenuItem("Procurar");
        atualizar3 = new JMenuItem("Atualizar");
        
        Inserir4 = new JMenuItem("Inserir");
        Remover4 = new JMenuItem("Remover");
        Listar4 = new JMenuItem("Listar");
        Procurar4 = new JMenuItem("Procurar");
        atualizar4 = new JMenuItem("Atualizar");
        
        TeleMenu.add(Inserir1);
        TeleMenu.add(Remover1);
        TeleMenu.add(Listar1);
        TeleMenu.add(Procurar1);
        TeleMenu.add(atualizar1);
        
        ClienteMenu.add(Inserir2);
        ClienteMenu.add(Remover2);
        ClienteMenu.add(Listar2);
        ClienteMenu.add(Procurar2);
        ClienteMenu.add(atualizar2);
        
         PcMenu.add(Inserir3);
        PcMenu.add(Remover3);
        PcMenu.add(Listar3);
        PcMenu.add(Procurar3);
        PcMenu.add(atualizar3);
        
        SobreMenu.add(Inserir4);
        SobreMenu.add(Remover4);
        SobreMenu.add(Listar4);
        SobreMenu.add(Procurar4);
        SobreMenu.add(atualizar4);
        
        menuBar.add(TeleMenu);
        menuBar.add(ClienteMenu);
        menuBar.add(PcMenu);
        menuBar.add(SobreMenu);
        
        frame.add(logoLabel, BorderLayout.NORTH);
        frame.setJMenuBar(menuBar);
        
        Inserir1.addActionListener(this);
        Inserir2.addActionListener(this);
        Inserir3.addActionListener(this);
        Inserir4.addActionListener(this);
        Remover1.addActionListener(this);
        Remover2.addActionListener(this);
        Remover3.addActionListener(this);
        Remover4.addActionListener(this);
        Listar1.addActionListener(this);
        Listar2.addActionListener(this);
        Listar3.addActionListener(this);
        Listar4.addActionListener(this);
        Procurar1.addActionListener(this);
        Procurar2.addActionListener(this);
        Procurar3.addActionListener(this);
        Procurar4.addActionListener(this);
        atualizar1.addActionListener(this);
        atualizar2.addActionListener(this);
        atualizar3.addActionListener(this);
        atualizar4.addActionListener(this);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        StoreInterface inf= new StoreInterface();
    }
    public void actionPerformed( ActionEvent e) {
        if( e.getSource() == Inserir1){
            new Inserir();
        }else if(e.getSource() ==Inserir2) {
            new Inserir2();
        }else if( e.getSource() ==Inserir3) {
            new Inserir3();
        }else if(e.getSource() == Inserir4) {
            new Inserir4();
        } else if(e.getSource() == Remover1) {
            new Remover();
        }else if(e.getSource() == Remover2) {
            new Remover2();
        }else if(e.getSource() == Remover3){
            new Remover3();
        }else if(e.getSource() == Remover4) {
            new Remover4();
        }else if (e.getSource() == Listar1) {
            new Listar1();
        }else if(e.getSource() == Listar2) {
            new Listar2();
        }else if(e.getSource() == Listar3) {
            new Listar3();
        }else if( e.getSource() == Listar4){
             new Listar4();
        } else if (e.getSource() == Procurar1) {
            new Procurar1();
        }else if(e.getSource() == Procurar2) {
            new Procurar2();
        }else if(e.getSource() == Procurar3) {
             new Procurar3();
        }else if(e.getSource() == Procurar4){
            new Procurar4();
        }else if (e.getSource() == atualizar1) {
            new Atualizar1();
        }else if ( e.getSource() == atualizar2) {
            new Atualizar2();
        } else if ( e.getSource() == atualizar3) {
            new Atualizar3();
        }else if ( e.getSource() == atualizar4) {
            new Atualizar4();
        }
    }
}
