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
    double eps = 1e-9;
    String each = (Math.abs(pointEach - Math.rint(pointEach)) < eps)
            ? String.format("%.0f", pointEach)
            : String.format("%.2f", pointEach);
    String unit = (Math.abs(pointEach - 1.0) < eps) ? "point" : "points";
    return String.format(
        "Each question is worth %s %s.%nScore: %5.1f    Grade: %c",
        each, unit, getScore(), getGrade()
    );
    }
}
