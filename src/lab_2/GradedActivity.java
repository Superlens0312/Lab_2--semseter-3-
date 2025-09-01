/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_2;

/**
 *
 * @author 2488638
 */
public class GradedActivity {
    protected double score;
  
    public void setScore(double score) {
        this.score = score;
    }
    public double getScore() {
        return score;
    }
    
    public char getGrade(){
        if(score >= 90) {
            return 'A';
        }
        if(score >= 80) {
            return 'B';
        }
        if(score >= 70) {
            return 'C';
        }
        if(score >= 60) {
            return 'D';
        }
            return 'F'; 
    }
    @Override public String toString() {
        return String.format("Score: %5.1f    Grade: %c", getScore(), getGrade());
    }
}
