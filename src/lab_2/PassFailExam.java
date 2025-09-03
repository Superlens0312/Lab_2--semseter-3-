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

   public PassFailExam(int numQuestions, int numMissed, double minPassing) {
        super(minPassing);
        if (numQuestions <= 0) throw new IllegalArgumentException("questions > 0");
        if (numMissed < 0 || numMissed > numQuestions)
            throw new IllegalArgumentException("0 <= missed <= questions");
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        this.pointEach = 100.0 / numQuestions;
        setScore(100.0 - numMissed * pointEach);
    }
   
    public int getNumQuestions() {
        return numQuestions;
    }

    public int getNumMissed() {
        return numMissed;
    }
    
@Override
public String toString() {
    String unit = (pointEach == 1.0) ? "point" : "points";
    return String.format(
        "Each question is worth %.2f %s.%nScore: %.1f    %nGrade: %c",
        pointEach, unit, getScore(), getGrade()
        );
    }
}
