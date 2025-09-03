/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_2;

/**
 *
 * @author 2488638
 */
public class CourseGrade implements Analyzable {
    private static final int NUM_GRADES = 4;
    private final GradedActivity[] grades = new GradedActivity[NUM_GRADES];

    public void setLab(GradedActivity aLab)        { grades[0] = aLab; }
    public void setPassFailExam(PassFailExam ex)   { grades[1] = ex; }
    public void setEssay(Essay essay)              { grades[2] = essay; }
    public void setFinalExam(FinalExam fe)         { grades[3] = fe; }

    @Override 
    public double getAverage() {
        double sum = 0;
        for (GradedActivity grade : grades) {
            sum += grade.score;
        }
           
        return sum/grades.length;
    }
    
    @Override 
    public GradedActivity getHighest() {
        GradedActivity highest = new GradedActivity();
        for (int i = 0; i < grades.length - 1; i ++) {
            if (grades[i].score < grades[i + 1].score) {
                highest = grades[i + 1];
            }
        }
        return highest;
    }
    
    @Override
    public GradedActivity getLowest() {
            GradedActivity lowest = new GradedActivity();
        for (int i = 0; i < grades.length - 1; i ++) {
            if (grades[i].score > grades[i + 1].score) {
                lowest = grades[i + 1];
            }
        }
        return lowest;
    }

    @Override
    public String toString() {
        return String.format(
            "%-22s %5.1f    Grade: %c%n" +
            "%-22s %5.1f    Grade: %c%n" +
            "%-22s %5.1f    Grade: %c%n" +
            "%-22s %5.1f    Grade: %c",
            "Lab Score:",           grades[0].getScore(), grades[0].getGrade(),
            "Pass/Fail Exam Score:",grades[1].getScore(), grades[1].getGrade(),
            "Essay Score:",         grades[2].getScore(), grades[2].getGrade(),
            "Final Exam Score:",    grades[3].getScore(), grades[3].getGrade()
        );
    }
}
