/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_2;

/**
 *
 * @author 2488638
 */
public class Essay extends GradedActivity {
    private double grammer;
    private double spelling;
    private double correctLength;
    private double content;

    public void setGrammer(double grammer) {
        this.grammer = grammer;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public void setContent(double content) {
        this.content = content;
    }

    public void setScore(double gr, double sp, double len, double cnt) {
        setScore(gr + sp + len + cnt);
    }

    public double getGrammer() {
        return grammer;
    }

    public double getSpelling() {
        return spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public double getContent() {
        return content;
    }

    public double getScore() {
        return score;
    }
    @Override public String toString() { return super.toString(); }
}
    
