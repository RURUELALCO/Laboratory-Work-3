/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package students;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.SpringLayout;


public class GradeOutput extends JFrame {
    // Declare private variables for the Swing components
    private JLabel lblStudentName, lblStudentNo, lblMilestone1, lblMilestone2, lblTerAss, lblAveGrade;
    private JTextField txtStudentName, txtStudentNo, txtMilestone1, txtMilestone2, txtTerAss, txtAveGrade;
    private JButton closeButton;


    public GradeOutput(Student stud) {
        // Set up the frame
        super("Grade Output");
        setSize(450, 250);


        // Compute Average
        stud.computeAverage();


        // Create the components
        // Create labels
        lblStudentName = new JLabel("Student Name:");
        lblStudentNo = new JLabel("Student No:");
        lblMilestone1 = new JLabel("Milestone 1:");
        lblMilestone2 = new JLabel("Milestone 2:");
        lblTerAss = new JLabel("Terminal Assessment:");
        lblAveGrade = new JLabel("Total Grade:");
       
        // Create Student Name textfield
        txtStudentName = new JTextField(30);
        txtStudentName.setEnabled(false);
        txtStudentName.setText(stud.getStudentName());
       
        // Create Student Number textfield
        txtStudentNo = new JTextField(30);
        txtStudentNo.setEnabled(false);
        txtStudentNo.setText(stud.getStudentNumber());
       
        // Create Quiz 1 textfield
        txtMilestone1 = new JTextField(10);
        txtMilestone1.setEnabled(false);
        txtMilestone1.setText(stud.getMilestone1());
       
        // Create Quiz 2 textfield
        txtMilestone2 = new JTextField(10);
        txtMilestone2.setEnabled(false);
        txtMilestone2.setText(stud.getMilestone2());
       
        // Create Quiz 3 textfield
        txtTerAss = new JTextField(10);
        txtTerAss.setEnabled(false);
        txtTerAss.setText(stud.getTerAss());
       
        // Create Average Grade textfield
        txtAveGrade = new JTextField(10);
        txtAveGrade.setEnabled(false);
        txtAveGrade.setText(stud.getAveGrade());
       
        // Create Close button
        closeButton = new JButton("Close");
       
        // Define the panel to hold the components  
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setSize(300, 300);
        panel.setLayout(layout);
       
        // Add the components to the frame
        panel.add(lblStudentName);
        panel.add(txtStudentName);
        panel.add(lblStudentNo);
        panel.add(txtStudentNo);
        panel.add(lblMilestone1);
        panel.add(txtMilestone1);
        panel.add(lblMilestone2);
        panel.add(txtMilestone2);
        panel.add(lblTerAss);
        panel.add(txtTerAss);
        panel.add(lblAveGrade);
        panel.add(txtAveGrade);
        panel.add(closeButton);
 
        // Put constraint on components
        // Set label position: left
        layout.putConstraint(SpringLayout.WEST, lblStudentName, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblStudentNo, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblMilestone1, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblMilestone2, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblTerAss, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblAveGrade, 6, SpringLayout.WEST, panel);
       
        // Set label and textfield position: top and bottom
        layout.putConstraint(SpringLayout.NORTH, lblStudentName, 6, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, txtStudentName, 6, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, lblStudentNo, 10, SpringLayout.SOUTH, lblStudentName);
        layout.putConstraint(SpringLayout.NORTH, txtStudentNo, 6, SpringLayout.SOUTH, txtStudentName);
        layout.putConstraint(SpringLayout.NORTH, lblMilestone1, 10, SpringLayout.SOUTH, lblStudentNo);
        layout.putConstraint(SpringLayout.NORTH, txtMilestone1, 6, SpringLayout.SOUTH, txtStudentNo);
        layout.putConstraint(SpringLayout.NORTH, lblMilestone2, 10, SpringLayout.SOUTH, lblMilestone1);
        layout.putConstraint(SpringLayout.NORTH, txtMilestone2, 6, SpringLayout.SOUTH, txtMilestone1);
        layout.putConstraint(SpringLayout.NORTH, lblTerAss, 10, SpringLayout.SOUTH, lblMilestone2);
        layout.putConstraint(SpringLayout.NORTH, txtTerAss, 6, SpringLayout.SOUTH, txtMilestone2);
        layout.putConstraint(SpringLayout.NORTH, lblAveGrade, 10, SpringLayout.SOUTH, lblTerAss);
        layout.putConstraint(SpringLayout.NORTH, txtAveGrade, 6, SpringLayout.SOUTH, txtTerAss);
       
        // Set textfield position: right
        layout.putConstraint(SpringLayout.WEST, txtStudentName, 6, SpringLayout.EAST, lblStudentName);
        layout.putConstraint(SpringLayout.WEST, txtStudentNo, 24, SpringLayout.EAST, lblStudentNo);
        layout.putConstraint(SpringLayout.WEST, txtMilestone1, 51, SpringLayout.EAST, lblMilestone1);
        layout.putConstraint(SpringLayout.WEST, txtMilestone2, 51, SpringLayout.EAST, lblMilestone2);
        layout.putConstraint(SpringLayout.WEST, txtTerAss, 51, SpringLayout.EAST, lblTerAss);
        layout.putConstraint(SpringLayout.WEST, txtAveGrade, 51, SpringLayout.EAST, lblAveGrade);
       
        // Set button position
        layout.putConstraint(SpringLayout.NORTH, closeButton, 6, SpringLayout.SOUTH, txtAveGrade);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, closeButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


        //Add panel to frame
        add(panel);


        // Add an ActionListener to the button
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
