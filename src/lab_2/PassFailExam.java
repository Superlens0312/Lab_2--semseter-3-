/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_2;

/**
 *
 * @author 2488638
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointEach;
    private int numMissed;

    public PassFailExam(int numQuestions, int numMissed,double mps) {
        super(mps);
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public int getNumMissed() {
        return numMissed;
    }
    
    
    
}
