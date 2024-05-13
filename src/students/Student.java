/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package students;

/**
 *
 * @author Ruel Rey
 */
public class Student {
    //attributes
    private String studentNumber;
    private String studentName;
    private double Milestone1;
    private double Milestone2;
    private double TerminalAssessment;
    private double averageGrade;
   
    //getter and setter methods
    //getter methods
    public String getStudentNumber() {
        return studentNumber;
    }
   
    public String getStudentName() {
        return studentName;
    }
   
    public String getMilestone1() {
        //double Milestone11 = Milestone1 * 1;
        return String.valueOf(Milestone1);
    }
   
    public String getMilestone2() {
        //double Milestone22 = Milestone2 * 1;
        return String.valueOf(Milestone2 );
    }
   
    public String getTerAss() {
        //double TerminalAssessment11 = TerminalAssessment * 1 ;
        return String.valueOf(TerminalAssessment );
    }
   
    public String getAveGrade() {
        return String.valueOf(averageGrade);
    }
   
    //setter methods
    public void setStudentNumber(String studNumber) {
        studentNumber = studNumber;
    }
   
    public void setStudentName(String studName) {
        studentName = studName;
    }
   
    public void setMilestone1(float m1) {
        
       Milestone1 = m1;
    }

   
    public void setMilestone2(float m2) {
        Milestone2 = m2;
    }
   
    public void setTerminalAssessment(float m3) {
        TerminalAssessment = m3;
    }
   
    //methods
    public double computeAverage() {
        //double milestone11 = Milestone1 * 25;
        averageGrade = (Milestone1 + Milestone2 + TerminalAssessment ) ;
        return averageGrade;
    }
}

