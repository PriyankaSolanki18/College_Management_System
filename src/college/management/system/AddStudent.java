package college.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class AddStudent extends JFrame implements ActionListener{
    
    JTextField tfname, tffname, tfaddress, tfphone, tfemail, tfx, tfxii, tfaadhar;
    JLabel labelrollno;
    JDateChooser dcdob;
    JComboBox cbbranch, cbyear;
    JButton submit, cancel;
    
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);
    
    AddStudent(){
       
        setSize(900,700);
        setLocation(350,50);
        
        setLayout(null);
        
        JLabel heading = new JLabel("New Student Information");
        heading.setForeground(Color.BLUE);
        heading.setBounds(250,30,500,50);
        heading.setFont(new Font("tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50,150,100,30);
        lblname.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);
        
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400,150,200,30);
        lblfname.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lblfname);
        
        tffname = new JTextField();
        tffname.setBounds(600,150,150,30);
        add(tffname);
        
        JLabel lblrollno = new JLabel("Roll No.");
        lblrollno.setBounds(50,200,200,30);
        lblrollno.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lblrollno);
        
        labelrollno = new JLabel("20"+first4);
        labelrollno.setBounds(200,200,200,30);
        labelrollno.setFont(new Font("tahoma", Font.BOLD, 20));
        add(labelrollno);
        
        JLabel lbldob = new JLabel("D.O.B");
        lbldob.setBounds(400,200,200,30);
        lbldob.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lbldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(600,200,150,30);
        add(dcdob);
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50,250,200,30);
        lbladdress.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200,250,150,30);
        add(tfaddress);
        
        JLabel lblphone = new JLabel("Phone No.");
        lblphone.setBounds(400,250,200,30);
        lblphone.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600,250,150,30);
        add(tfphone);
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(50,300,200,30);
        lblemail.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        
        JLabel lblx = new JLabel("10th %");
        lblx.setBounds(400,300,200,30);
        lblx.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lblx);
        
        tfx = new JTextField();
        tfx.setBounds(600,300,150,30);
        add(tfx);
        
        JLabel lbxii = new JLabel("12th %");
        lbxii.setBounds(50,350,200,30);
        lbxii.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lbxii);
        
        tfxii = new JTextField();
        tfxii.setBounds(200,350,150,30);
        add(tfxii);
        
        JLabel lblaadhar = new JLabel("Aadhar No.");
        lblaadhar.setBounds(400,350,200,30);
        lblaadhar.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lblaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600,350,150,30);
        add(tfaadhar);
        
        JLabel lblbranch = new JLabel("Branch");
        lblbranch.setBounds(50,400,200,30);
        lblbranch.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lblbranch);
        
        String branch[] = {"CSE","IT","EE","EEE","ME","ECE","AI/ML"};
        cbbranch = new JComboBox(branch);
        cbbranch.setBounds(200,400,150,30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);
        
        JLabel lblyear = new JLabel("Year");
        lblyear.setBounds(400,400,200,30);
        lblyear.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lblyear);
        
        String year[] = {"i","ii","iii","iv"};
        cbyear = new JComboBox(year);
        cbyear.setBounds(600,400,150,30);
        cbyear.setBackground(Color.WHITE);
        add(cbyear);
        
        submit = new JButton("Submit");
        submit.setBounds(250, 550, 120, 30);
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(450, 550, 120, 30);
        cancel.setBackground(Color.BLUE);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String name = tfname.getText();
            String fname = tffname.getText();
            String rollno = labelrollno.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String x = tfx.getText();
            String xii = tfxii.getText();
            String aadhar = tfaadhar.getText();
            String branch = (String) cbbranch.getSelectedItem();
            String year = (String) cbyear.getSelectedItem();
            
            try{
                String query = "insert into student values('"+name+"', '"+fname+"', '"+rollno+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+aadhar+"', '"+branch+"', '"+year+"')";
                
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Details Inserted Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new AddStudent();
    }
}
