package college.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame{
    
    About(){
        setSize(700,500);
        setLocation(400,150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450, 0, 200, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>College<br/>Management System</html>");
        heading.setBounds(70,20,500,130);
        heading.setFont(new Font("tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Developed By - Priyanka Solanki");
        name.setBounds(70,220,500,30);
        name.setFont(new Font("tahoma", Font.BOLD, 30));
        add(name);
        
        JLabel rollno = new JLabel("<html>University Roll No. - 20EEMCS077<br/>College ID - 20CSE076</html>");
        rollno.setBounds(70,280,400,50);
        rollno.setFont(new Font("tahoma", Font.PLAIN, 20));
        add(rollno);
        
        JLabel subject = new JLabel("<html>Subject - Advance JAVA Lab<br/>Section - CSE (B)</html>");
        subject.setBounds(70,334,400,50);
        subject.setFont(new Font("tahoma", Font.PLAIN, 20));
        add(subject);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args){
        new About();
    }
}
