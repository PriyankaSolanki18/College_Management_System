package college.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    
    //default class constructor
    Project(){
        setSize(1920,1080);
            
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1910, 970, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
            
        JMenuBar mb = new JMenuBar();
        
        //New Information
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);        
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        //Details
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLUE);
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        //Leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);
        
        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
        
        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
        leave.add(studentleave);
        
        //Leave Details
        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.BLUE);
        mb.add(leaveDetails);
        
        JMenuItem facultyleaveDetails = new JMenuItem("Faculty Leave Details");
        facultyleaveDetails.setBackground(Color.WHITE);
        facultyleaveDetails.addActionListener(this);
        leaveDetails.add(facultyleaveDetails);
        
        JMenuItem studentleaveDetails = new JMenuItem("Student Leave Details");
        studentleaveDetails.setBackground(Color.WHITE);
        studentleaveDetails.addActionListener(this);
        leaveDetails.add(studentleaveDetails);
        
        //Exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLUE);
        mb.add(exam);
        
        JMenuItem examDetails = new JMenuItem("Examination Results");
        examDetails.setBackground(Color.WHITE);
        examDetails.addActionListener(this);
        exam.add(examDetails);
        
        JMenuItem entermarks = new JMenuItem("Enetr Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        
         //update info
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.BLUE);
        mb.add(updateInfo);
        
        JMenuItem updatefaclutyinfo = new JMenuItem("Update Faculty Details");
        updatefaclutyinfo.setBackground(Color.WHITE);
        updatefaclutyinfo.addActionListener(this);
        updateInfo.add(updatefaclutyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);
        
        
        //fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);
        setJMenuBar(mb);
        
        //about
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLUE);
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        ab.addActionListener(this);
        ab.setBackground(Color.WHITE);
        about.add(ab);
        
        //exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLUE);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.addActionListener(this);
        ex.setBackground(Color.WHITE);
        exit.add(ex);
        
        
        
        setJMenuBar(mb);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg =ae.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);
        }else if(msg.equals("New Faculty Information")){
            new AddTeacher();
        }else if(msg.equals("New Student Information")){
            new AddStudent();
        }else if(msg.equals("Faculty Details")){
            new TeacherDetails();
        }else if(msg.equals("Student Details")){
            new StudentDetails();
        }else if(msg.equals("Faculty Leave")){
            new TeacherLeave();
        }else if(msg.equals("Student Leave")){
            new StudentLeave();
        }else if(msg.equals("Faculty Leave Details")){
            new TeacherLeaveDetails();
        }else if(msg.equals("Student Leave Details")){
            new StudentLeaveDetails();
        }else if(msg.equals("Update Faculty Details")){
            new UpdateTeacher();
        }else if(msg.equals("Update Student Details")){
            new UpdateStudent();
        }else if(msg.equals("Enetr Marks")){
            new EnterMarks();
        }else if(msg.equals("Examination Results")){
            new ExaminationDetails();
        }else if(msg.equals("Fee Structure")){
            new FeeStructure();
        }else if(msg.equals("About")){
            new About();
        }else if(msg.equals("Student Fee Form")){
            new StudentFeeForm();
        }
    }
    
    public static void main(String[] args){
        new Project();
    }
}
