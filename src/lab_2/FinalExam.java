/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_2;

/**
 *
 * @author 2488638
 */
public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam(int numQuestions, int numMissed) {
        this.numQuestions = numQuestions;
        this.pointsEach = pointsEach;
        this.numMissed = numMissed;
    }
     public double FinalExam(int questions, int missed) {
        double numericscore = 100 -(missed * pointsEach);
        return numericscore;
     }

    public int getNumQuestions() {
        return numQuestions;
    }
     
    public int getNumMissed() {
        return numMissed;
    }

    public double getPointsEach() {
        return 100.0/numQuestions;
    }
     
     
    
    
}
