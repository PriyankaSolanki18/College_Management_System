package college.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateStudent extends JFrame implements ActionListener{
    
    JTextField tfbranch, tfyear, tfaddress, tfphone, tfemail;
    JLabel labelrollno;
    JButton submit, cancel;
    Choice crollno;
    
    UpdateStudent(){
       
        setSize(900,650);
        setLocation(350,50);
        
        setLayout(null);
        
        JLabel heading = new JLabel("Update Student Information");
        heading.setForeground(Color.BLUE);
        heading.setBounds(50,10,500,50);
        heading.setFont(new Font("tahoma", Font.ITALIC, 35));
        add(heading);
        
        JLabel lblrollnumber = new JLabel("Select Roll No.");
        lblrollnumber.setBounds(50,100,200,20);
        lblrollnumber.setFont(new Font("tahoma", Font.PLAIN, 20));
        add(lblrollnumber);
        
        crollno = new Choice();
        crollno.setBounds(250,100,200,20);
        add(crollno);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()){
                crollno.add(rs.getString("rollno"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50,150,100,30);
        lblname.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lblname);
        
        JLabel labelname = new JLabel();
        labelname.setBounds(200,150,150,30);
        labelname.setFont(new Font("tahoma", Font.PLAIN, 18));
        add(labelname);
        
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400,150,200,30);
        lblfname.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lblfname);
        
        JLabel labelfname = new JLabel();
        labelfname.setBounds(600,150,150,30);
        labelfname.setFont(new Font("tahoma", Font.PLAIN, 18));
        add(labelfname);
        
        JLabel lblrollno = new JLabel("Roll No.");
        lblrollno.setBounds(50,200,200,30);
        lblrollno.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lblrollno);
        
        labelrollno = new JLabel();
        labelrollno.setBounds(200,200,200,30);
        labelrollno.setFont(new Font("tahoma", Font.PLAIN, 18));
        add(labelrollno);
        
        JLabel lbldob = new JLabel("D.O.B");
        lbldob.setBounds(400,200,200,30);
        lbldob.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lbldob);
        
        JLabel labeldob = new JLabel();
        labeldob.setBounds(600,200,150,30);
        labeldob.setFont(new Font("tahoma", Font.PLAIN, 18));
        add(labeldob);
        
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
        
        JLabel labelx = new JLabel();
        labelx.setBounds(600,300,150,30);
        labelx.setFont(new Font("tahoma", Font.PLAIN, 18));
        add(labelx);
        
        JLabel lbxii = new JLabel("12th %");
        lbxii.setBounds(50,350,200,30);
        lbxii.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lbxii);
        
        JLabel labelxii = new JLabel();
        labelxii.setBounds(200,350,150,30);
        labelxii.setFont(new Font("tahoma", Font.PLAIN, 18));
        add(labelxii);
        
        JLabel lblaadhar = new JLabel("Aadhar No.");
        lblaadhar.setBounds(400,350,200,30);
        lblaadhar.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lblaadhar);
        
        JLabel labelaadhar = new JLabel();
        labelaadhar.setBounds(600,350,150,30);
        labelaadhar.setFont(new Font("tahoma", Font.PLAIN, 18));
        add(labelaadhar);
        
        JLabel lblbranch = new JLabel("Branch");
        lblbranch.setBounds(50,400,200,30);
        lblbranch.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lblbranch);
        
        tfbranch = new JTextField();
        tfbranch.setBounds(200,400,150,30);
        add(tfbranch);
        
        JLabel lblyear = new JLabel("Year");
        lblyear.setBounds(400,400,200,30);
        lblyear.setFont(new Font("tahoma", Font.BOLD, 20));
        add(lblyear);
        
        tfyear = new JTextField();
        tfyear.setBounds(600,400,150,30);
        add(tfyear);
        
        try{
            Conn c = new Conn();
            String query = "select * from student where rollno='"+crollno.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
              labelname.setText(rs.getString("name"));  
              labelfname.setText(rs.getString("fname"));  
              labeldob.setText(rs.getString("dob"));  
              tfaddress.setText(rs.getString("address"));  
              tfphone.setText(rs.getString("phone"));  
              tfemail.setText(rs.getString("email"));  
              labelx.setText(rs.getString("class_x"));  
              labelxii.setText(rs.getString("class_xii"));  
              labelaadhar.setText(rs.getString("aadhar"));  
              labelrollno.setText(rs.getString("rollno"));  
              tfbranch.setText(rs.getString("branch"));  
              tfyear.setText(rs.getString("year"));  

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        
        crollno.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie){
                
                try{
                    Conn c = new Conn();
                    String query = "select * from student where rollno='"+crollno.getSelectedItem()+"'";
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()){
                    labelname.setText(rs.getString("name"));  
                    labelfname.setText(rs.getString("fname"));  
                    labeldob.setText(rs.getString("dob"));  
                    tfaddress.setText(rs.getString("address"));  
                    tfphone.setText(rs.getString("phone"));  
                    tfemail.setText(rs.getString("email"));  
                    labelx.setText(rs.getString("class_x"));  
                    labelxii.setText(rs.getString("class_xii"));  
                    labelaadhar.setText(rs.getString("aadhar"));  
                    labelrollno.setText(rs.getString("rollno"));  
                    tfbranch.setText(rs.getString("branch"));  
                    tfyear.setText(rs.getString("year"));  

            }
        }catch (Exception e){
            e.printStackTrace();
        }
            }
        });
        
        submit = new JButton("Update");
        submit.setBounds(250, 500, 120, 30);
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(450, 500, 120, 30);
        cancel.setBackground(Color.BLUE);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String rollno = labelrollno.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String branch = tfbranch.getText();
            String year = tfyear.getText();
            
            try{
                String query = "update student set address='"+address+"', phone='"+phone+"', email='"+email+"', branch='"+branch+"', year='"+year+"' where rollno='"+rollno+"'";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Details Updated Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new UpdateStudent();
    }
}
