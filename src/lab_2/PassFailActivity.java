/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_2;

/**
 *
 * @author 2488638
 */
public class PassFailActivity extends GradedActivity {
    private double minPassingScore;
    
    public PassFailActivity(double mps) {
      this.minPassingScore = mps;
    }
   
    
    @Override
    public char getGrade(){
         if( score >= minPassingScore) {
            return 'P'; 
        } else{
                return 'F';
            }
        }
    
}

