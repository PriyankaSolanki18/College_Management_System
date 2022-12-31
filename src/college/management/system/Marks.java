package college.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Marks extends JFrame implements ActionListener{
    
    String rollno;
    JButton cancel;
    
    Marks(String rollno){
        this.rollno = rollno;
        
        setSize(700,600);
        setLocation(500,100);
        
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("Government Women Engineering College, Ajmer");
        heading.setForeground(Color.BLUE);
        heading.setBounds(100,10,500,25);
        heading.setFont(new Font("tahoma", Font.BOLD, 20));
        add(heading);
       
        JLabel subheading = new JLabel("Examination Result");
        subheading.setForeground(Color.BLUE);
        subheading.setBounds(250,50,500,20);
        subheading.setFont(new Font("tahoma", Font.BOLD, 18));
        add(subheading);
        
        JLabel lblrollno = new JLabel("Roll No. " + rollno);
        lblrollno.setForeground(Color.BLACK);
        lblrollno.setBounds(60,100,500,20);
        lblrollno.setFont(new Font("tahoma", Font.PLAIN, 20));
        add(lblrollno);
       
        JLabel lblsemester = new JLabel();
        lblsemester.setForeground(Color.BLACK);
        lblsemester.setBounds(60,130,500,20);
        lblsemester.setFont(new Font("tahoma", Font.PLAIN, 18));
        add(lblsemester); 
        
        JLabel sub1 = new JLabel();
        sub1.setForeground(Color.BLACK);
        sub1.setBounds(100,200,500,20);
        sub1.setFont(new Font("tahoma", Font.PLAIN, 18));
        add(sub1); 
        
        JLabel sub2 = new JLabel();
        sub2.setForeground(Color.BLACK);
        sub2.setBounds(100,230,500,20);
        sub2.setFont(new Font("tahoma", Font.PLAIN, 18));
        add(sub2); 
        
        JLabel sub3 = new JLabel();
        sub3.setForeground(Color.BLACK);
        sub3.setBounds(100,260,500,20);
        sub3.setFont(new Font("tahoma", Font.PLAIN, 18));
        add(sub3); 
        
        JLabel sub4 = new JLabel();
        sub4.setForeground(Color.BLACK);
        sub4.setBounds(100,290,500,20);
        sub4.setFont(new Font("tahoma", Font.PLAIN, 18));
        add(sub4); 
        
        JLabel sub5 = new JLabel();
        sub5.setForeground(Color.BLACK);
        sub5.setBounds(100,320,500,20);
        sub5.setFont(new Font("tahoma", Font.PLAIN, 18));
        add(sub5); 
        
        JLabel sub6 = new JLabel();
        sub6.setForeground(Color.BLACK);
        sub6.setBounds(100,350,500,20);
        sub6.setFont(new Font("tahoma", Font.PLAIN, 18));
        add(sub6); 
        
        try{
            Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from subject where rollno='"+rollno+"'");
            while(rs1.next()){
                sub1.setText(rs1.getString("subject1"));
                sub2.setText(rs1.getString("subject2"));
                sub3.setText(rs1.getString("subject3"));
                sub4.setText(rs1.getString("subject4"));
                sub5.setText(rs1.getString("subject5"));
                sub6.setText(rs1.getString("subject6"));
            }
            
            ResultSet rs2 = c.s.executeQuery("select * from marks where rollno='"+rollno+"'");
            while(rs2.next()){
                sub1.setText(sub1.getText() + "---------------" + rs2.getString("marks1"));
                sub2.setText(sub2.getText() + "---------------" + rs2.getString("marks2"));
                sub3.setText(sub3.getText() + "---------------" + rs2.getString("marks3"));
                sub4.setText(sub4.getText() + "---------------" + rs2.getString("marks4"));
                sub5.setText(sub5.getText() + "---------------" + rs2.getString("marks5"));
                sub6.setText(sub6.getText() + "---------------" + rs2.getString("marks6"));
                lblsemester.setText("Semester " + rs2.getString("semester"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        cancel = new JButton("Cancel");
        cancel.setBounds(270, 500, 120, 25);
        cancel.setBackground(Color.BLUE);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    public static void main(String[] args){
        new Marks("");
    }
}
