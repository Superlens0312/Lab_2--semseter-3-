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
        if (numQuestions <= 0) throw new IllegalArgumentException("questions > 0");
        if (numMissed < 0 || numMissed > numQuestions)
            throw new IllegalArgumentException("0 <= missed <= questions");
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        this.pointsEach = 100.0 / numQuestions;
        double numericScore = 100.0 - (numMissed * pointsEach);
        setScore(numericScore);
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
     
     @Override
    public String toString() {
    double eps = 1e-9;
    String each = (Math.abs(pointsEach - Math.rint(pointsEach)) < eps)
            ? String.format("%.0f", pointsEach)
            : String.format("%.2f", pointsEach);
    String unit = (Math.abs(pointsEach - 1.0) < eps) ? "point" : "points";
    return String.format(
        "Each question is worth %s %s.%nScore: %5.1f    %nGrade: %c",
        each, unit, getScore(), getGrade()
    );
}
    
    
}
