package Employeee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AboutUs extends JFrame implements ActionListener{

	private JPanel contentPane;
    private JButton b;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
        
    
        public AboutUs() {
            
            super("About Us");
            setBackground(new Color(173, 216, 230));
            setBounds(350, 150, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);
            
            b = new JButton("Go BACK");
            b.setForeground(new Color( 0,0,0));
        	b.setBackground(new Color(204, 255, 255));
            b.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            b.setBounds(450,400,120,30);
            b.addActionListener(this);
            contentPane.add(b);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/AboutUs.jpg"));
            Image i2 = i1.getImage().getScaledInstance(180, 110,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(400, 40, 250, 100);
            contentPane.add(l1);
            
            
        	

     

            JLabel l3 = new JLabel("DiGinetCO");
            l3.setForeground(new Color(0, 0, 255));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(140, 40, 200, 55);
            contentPane.add(l3);

       
            JLabel l6 = new JLabel("Developed By : PIYUSH , ONKAR & SUFIYA");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Roll Number - 68 , 70 , 72");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Contact : www.diginetco.in ");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Education - B.Tech ( COMPUTER ENGINEERING REGIONAL )");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("Phone - +91 9346383941");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 400, 600, 34);
            contentPane.add(l10);
                
            ImageIcon im = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/bg.jpeg"));
            Image img = im.getImage();
            Image temp_img = img.getScaledInstance(900,500,Image.SCALE_SMOOTH);
            JLabel bg = new JLabel("",im,JLabel.CENTER);
            bg.setBounds(0,0,900,500);
            contentPane.add(bg);
               
            
	}
        public void actionPerformed(ActionEvent ae){

        	 if(ae.getSource() == b){
                 this.setVisible(false);
 		         new Home();
 			
             }
        }
        
}

