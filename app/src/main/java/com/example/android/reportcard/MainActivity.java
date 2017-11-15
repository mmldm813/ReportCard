package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard reportCard = createReportCard();
        setupViews(reportCard);

        Log.v("Report Card", reportCard.toString());
    }

    private ReportCard createReportCard(){
        ReportCard reportCard = new ReportCard(100, 100, 100, 100);
        reportCard.setChemistryGrade(80);
        reportCard.setMathGrade(60);
        reportCard.setSocialStudiesGrade(78);
        reportCard.setArtGrade(50);
        return reportCard;
    }

    private void setupViews(ReportCard reportCard){
        ((TextView) findViewById(R.id.chem_grade_text)).setText("Chemistry Grade = " +
                reportCard.getChemistryGrade());

        ((TextView) findViewById(R.id.math_grade_text)).setText("Math Grade = " +
                reportCard.getMathGrade());

        ((TextView) findViewById(R.id.social_studies_grade_text))
                .setText("Social Studies Grade = " +
                reportCard.getSocialStudiesGrade());

        ((TextView) findViewById(R.id.art_grade_text)).setText("Art Grade = " +
                reportCard.getArtGrade());

        ((TextView) findViewById(R.id.final_grade_text)).setText("Final Grade = " +
                reportCard.getGrade());
    }
}
