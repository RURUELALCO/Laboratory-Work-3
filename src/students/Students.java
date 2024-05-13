/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package students;

import javax.swing.JFrame;

/**
 *
 * @author Ruel Rey
 */
public class Students {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GradeCalculator calculator = new GradeCalculator();

        // Make the frame visible
        calculator.setVisible(true);

        // Set the default close operation
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
