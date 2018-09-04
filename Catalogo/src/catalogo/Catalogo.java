
package catalogo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Catalogo extends JFrame implements ActionListener {

        JButton b=new JButton("Elfo");
        JButton b2=new JButton("Humano");
        JButton b3=new JButton("Orco");
        
        JLabel Arma=new JLabel("Arma");
        JLabel Montura=new JLabel("Montura");
        JLabel Aspecto=new JLabel("Aspecto");
        JLabel Escudo=new JLabel("Armadura");
        
        JLabel img1=new JLabel();
        JLabel img2=new JLabel();
        JLabel img3=new JLabel();
        JLabel img4=new JLabel();
        
    public static void main(String[] args) {
        
        Catalogo P=new Catalogo();
        P.setSize(700, 500);
        P.setVisible(true);
        
    }
    
    public Catalogo(){
        
        Container c=getContentPane();
        c.setLayout(null);
        
        c.add(b);
        c.add(b2);
        c.add(b3);
        c.add(Arma);
        c.add(Montura);
        c.add(Escudo);
        c.add(Aspecto);
        c.add(img1);
        c.add(img2);
        c.add(img3);
        c.add(img4);
        
        b.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        b.setBounds(130, 50, 100, 35);
        b.setBackground(Color.CYAN);
        b2.setBounds(130, 200, 100, 35);
        b2.setBackground(Color.CYAN);
        b3.setBounds(130, 350, 100, 35);
        b3.setBackground(Color.CYAN);

        Arma.setBounds(300, 50, 40, 20);
        Escudo.setBounds(300, 270, 65, 20);
        Aspecto.setBounds(500, 50, 50, 20);
        Montura.setBounds(500, 270, 50, 20);
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b){
        
            FabricaPersonajes factory1 = new FabricaElfo();
            Cliente c1 = new Cliente(factory1);
            
            img1.setBounds(300,80,130,130);
            img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catalogo/"+c1.recibirArma())));
            img2.setBounds(500,80,130,130);
            img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catalogo/"+c1.recibirAspecto())));
            img3.setBounds(300,295,130,130);
            img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catalogo/"+c1.recibirEscudo())));
            img4.setBounds(500,295,130,130);
            img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catalogo/"+c1.recibirMontura())));
            
        } else if(e.getSource()==b2){
        
            FabricaPersonajes factory2 = new FabricaHumano();
            Cliente c2 = new Cliente(factory2);
            
            img1.setBounds(300,80,130,130);
            img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catalogo/"+c2.recibirArma())));
            img2.setBounds(500,80,130,130);
            img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catalogo/"+c2.recibirAspecto())));
            img3.setBounds(300,295,130,130);
            img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catalogo/"+c2.recibirEscudo())));
            img4.setBounds(500,295,130,130);
            img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catalogo/"+c2.recibirMontura())));
            
        } else if(e.getSource()==b3){
        
            FabricaPersonajes factory3 = new FabricaOrco();
            Cliente c3 = new Cliente(factory3);
            
            img1.setBounds(300,80,130,130);
            img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catalogo/"+c3.recibirArma())));
            img2.setBounds(500,80,130,130);
            img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catalogo/"+c3.recibirAspecto())));
            img3.setBounds(300,295,130,130);
            img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catalogo/"+c3.recibirEscudo())));
            img4.setBounds(500,295,130,130);
            img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/catalogo/"+c3.recibirMontura())));
        }
        
    }
    
}
