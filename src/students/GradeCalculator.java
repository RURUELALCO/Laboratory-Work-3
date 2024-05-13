/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package students;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import javax.swing.SpringLayout;


public class GradeCalculator extends JFrame {
    // Declare private variables for the Swing components
    private JLabel lblStudentName, lblStudentNo, lblMilestone1, lblMilestone2, lblTerAss;
    JTextField txtStudentName;
    JTextField txtStudentNo;
    JTextField txtMilestone1;
    private JTextField txtMilestone2, txtTerAss;
    private JButton calculateButton;


    public GradeCalculator() {
        // Set up the frame
        super("Milestone Calculator");
        setSize(450, 450);


        // Create the components
        // Create labels and textfields
        lblStudentName = new JLabel("Student Name:");
        txtStudentName = new JTextField(30);
        lblStudentNo = new JLabel("Student No:");
        txtStudentNo = new JTextField(30);
        lblMilestone1 = new JLabel("Milestone 1:");
        txtMilestone1 = new JTextField(10);
        lblMilestone2 = new JLabel("Milestone 2:");
        txtMilestone2 = new JTextField(10);
        lblTerAss = new JLabel("Terminal Assessment:");
        txtTerAss = new JTextField(10);
        calculateButton = new JButton("Calculate");
       
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
        panel.add(calculateButton);
 
        // Put constraint on components
        // Set label position: left
        layout.putConstraint(SpringLayout.WEST, lblStudentName, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblStudentNo, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblMilestone1, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblMilestone2, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, lblTerAss, 6, SpringLayout.WEST, panel);
       
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
       
        // Set textfield position: right
        layout.putConstraint(SpringLayout.WEST, txtStudentName, 6, SpringLayout.EAST, lblStudentName);
        layout.putConstraint(SpringLayout.WEST, txtStudentNo, 24, SpringLayout.EAST, lblStudentNo);
        layout.putConstraint(SpringLayout.WEST, txtMilestone1, 51, SpringLayout.EAST, lblMilestone1);
        layout.putConstraint(SpringLayout.WEST, txtMilestone2, 51, SpringLayout.EAST, lblMilestone2);
        layout.putConstraint(SpringLayout.WEST, txtTerAss, 51, SpringLayout.EAST, lblTerAss);
       
        // Set button position
        layout.putConstraint(SpringLayout.NORTH, calculateButton, 6, SpringLayout.SOUTH, txtTerAss);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, calculateButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


        //Add panel to frame
        add(panel);


        // Add an ActionListener to the button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              if (!ValidInput(txtMilestone1, 0, 25) ||
            !ValidInput(txtMilestone2, 0, 40) ||
            !ValidInput(txtTerAss, 0, 35)) {
            JOptionPane.showMessageDialog(null, "Please enter numbers within the specified ranges: \n"
                    + "Milestone 1: 0-25\n"
                    + "Milestone 2: 0-40\n"
                    + "Terminal Assessment: 0-35");
            return;
        }

        // Instantiate Student class
        Student stud = new Student();
       
        // Assign textfield values to stud object
        stud.setStudentName(txtStudentName.getText());
        stud.setStudentNumber(txtStudentNo.getText());
        stud.setMilestone1(Float.parseFloat(txtMilestone1.getText()));
        stud.setMilestone2(Float.parseFloat(txtMilestone2.getText()));
        stud.setTerminalAssessment(Float.parseFloat(txtTerAss.getText()));
       
        // Instantiate and call GradeOutput class
        GradeOutput output = new GradeOutput(stud);
        output.setVisible(true);
    }

     private boolean ValidInput(JTextField textField, int min, int max) {
        try {
            int value = Integer.parseInt(textField.getText());
            if (value < min || value > max) {
                textField.setText("");
                return false;
            }
            return true;
        } catch (NumberFormatException ex) {
            txtMilestone1.setText("");
            txtMilestone2.setText("");
            txtTerAss.setText("");
            return false;
        }
    }
});
        ((AbstractDocument) txtStudentName.getDocument()).setDocumentFilter(new LetterOnlyDocumentFilter());
        ((AbstractDocument) txtStudentNo.getDocument()).setDocumentFilter(new NumberOnlyDocumentFilter());
        ((AbstractDocument) txtMilestone1.getDocument()).setDocumentFilter(new NumberOnlyDocumentFilter());
        ((AbstractDocument) txtMilestone2.getDocument()).setDocumentFilter(new NumberOnlyDocumentFilter());
        ((AbstractDocument) txtTerAss.getDocument()).setDocumentFilter(new NumberOnlyDocumentFilter());
    }
    
    
    
    
    // DocumentFilter to allow only letters
    class LetterOnlyDocumentFilter extends DocumentFilter {
        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                throws BadLocationException {
            if (string == null) return;
            if (string.chars().allMatch(Character::isLetter))
                super.insertString(fb, offset, string, attr);
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                throws BadLocationException {
            if (text == null) return;
            if (text.chars().allMatch(Character::isLetter))
                super.replace(fb, offset, length, text, attrs);
        }
    }

    // DocumentFilter to allow only numbers
    class NumberOnlyDocumentFilter extends DocumentFilter {
        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                throws BadLocationException {
            if (string == null) return;
            if (string.chars().allMatch(Character::isDigit))
                super.insertString(fb, offset, string, attr);
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                throws BadLocationException {
            if (text == null) return;
            if (text.chars().allMatch(Character::isDigit))
                super.replace(fb, offset, length, text, attrs);
        }
    }
    // Setter method for updating txtMilestone1
    public void setTxtMilestone1Text(String text) {
        txtMilestone1.setText(text);
    }

    // Setter method for updating txtMilestone2
    public void setTxtMilestone2Text(String text) {
        txtMilestone2.setText(text);
    }

    // Setter method for updating txtTerAss
    public void setTxtTerAssText(String text) {
        txtTerAss.setText(text);
    }
}
    

    

