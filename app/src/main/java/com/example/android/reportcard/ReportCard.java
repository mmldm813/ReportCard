package com.example.android.reportcard;

/**
 * Created by michellemedina on 11/14/17.
 */

public class ReportCard {

    private static final double GRADE_A = 90.0;
    private static final double GRADE_B = 80.0;
    private static final double GRADE_C = 70.0;
    private static final double GRADE_D = 60.0;
    private static final double NUM_OF_GRADES = 4.0;

    private int chemistryGrade;
    private int mathGrade;
    private int socialStudiesGrade;
    private int artGrade;
    private int sum;
    private double percentage;

    public ReportCard(int chemistryGrade,
                      int mathGrade,
                      int socialStudiesGrade,
                      int artGrade) {
        this.chemistryGrade = chemistryGrade;
        this.mathGrade = mathGrade;
        this.socialStudiesGrade = socialStudiesGrade;
        this.artGrade = artGrade;
    }

    public int getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(int chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getSocialStudiesGrade() {
        return socialStudiesGrade;
    }

    public void setSocialStudiesGrade(int socialStudiesGrade) {
        this.socialStudiesGrade = socialStudiesGrade;
    }

    public int getArtGrade() {
        return artGrade;
    }

    public void setArtGrade(int artGrade) {
        this.artGrade = artGrade;
    }

    public String getGrade() {
        String grade;
        sum = chemistryGrade + mathGrade + socialStudiesGrade + artGrade;
        percentage = sum / NUM_OF_GRADES;

        if (percentage >= GRADE_A) {
            grade = "A";
        }else if (percentage >= GRADE_B && percentage < GRADE_A) {
            grade = "B";
        }else if (percentage >= GRADE_C && percentage < GRADE_B) {
            grade = "C";
        }else if (percentage >= GRADE_D && percentage < GRADE_C){
            grade = "D";
        } else if (percentage < GRADE_D) {
            grade = "F";
        } else {
            grade = "error";
        }
        return grade;
    }

    @Override
    public String toString() {
        String completedReportCard = "Chem: " + chemistryGrade +
                ",Math: " + mathGrade + ",Social Studies: " + socialStudiesGrade + ",Art: " +
                artGrade + ",Final Grade: " + getGrade();
        return completedReportCard;

    }


}
