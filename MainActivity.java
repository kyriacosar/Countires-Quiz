package com.example.android.countriesquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    private static boolean c1 = false;
    private static boolean c3 = false;
    private static boolean c4 = false;
    private static boolean c5 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkSingleAnswer1(View view) {
        CheckBox ans = (CheckBox) view;

        if (!ans.isChecked())
            c1 = false;
        else {
            if (c1) {
                ans.setChecked(false);
                Toast.makeText(this, "You can only choose one answer", Toast.LENGTH_SHORT).show();
            }
            else
                c1 = true;
        }
    }

    public void checkSingleAnswer3(View view) {
        CheckBox ans = (CheckBox) view;

        if (!ans.isChecked())
            c3 = false;
        else {
            if (c3) {
                ans.setChecked(false);
                Toast.makeText(this, "You can only choose one answer", Toast.LENGTH_SHORT).show();
            }
            else
                c3 = true;
        }
    }

    public void checkSingleAnswer4(View view) {
        CheckBox ans = (CheckBox) view;

        if (!ans.isChecked())
            c4 = false;
        else {
            if (c4) {
                ans.setChecked(false);
                Toast.makeText(this, "You can only choose one answer", Toast.LENGTH_SHORT).show();
            }
            else
                c4 = true;
        }
    }

    public void checkSingleAnswer5(View view) {
        CheckBox ans = (CheckBox) view;

        if (!ans.isChecked())
            c5 = false;
        else {
            if (c5) {
                ans.setChecked(false);
                Toast.makeText(this, "You can only choose one answer", Toast.LENGTH_SHORT).show();
            }
            else
                c5 = true;
        }
    }

    public void submitAnswers(View view) {
        int correctCounter = 0;
        CheckBox ans1 = (CheckBox) findViewById(R.id.canada_checkbox);
        EditText cityNameEditText = (EditText) findViewById(R.id.city_name_edit_text);
        String ans2 = cityNameEditText.getText().toString();
        CheckBox ans3 = (CheckBox) findViewById(R.id.ecuador_flag_checkbox);
        CheckBox ans4 = (CheckBox) findViewById(R.id.num195);
        CheckBox ans5 = (CheckBox) findViewById(R.id.qatar_checkbox);

        if (ans1.isChecked())
            correctCounter++;

        if (ans2.equals("Nicosia")||ans2.equals("nicosia"))
            correctCounter++;

        if (ans3.isChecked())
            correctCounter++;

        if (ans4.isChecked())
            correctCounter++;

        if (ans5.isChecked())
            correctCounter++;

        String resultsMessage = createResultMessage(correctCounter);
        displayResults(resultsMessage);
    }

    public String createResultMessage(int correct) {
        EditText nameEditText = (EditText) findViewById(R.id.name_edit_text);
        if (correct==5)
            return "Congratulation " + nameEditText.getText() + "\nYou scored " + correct + " out of 5.\nYou got everything right!!!";
        else if (correct>3)
            return "Great job " + nameEditText.getText() + "\nYou scored " + correct + " out of 5.";
        else if (correct>0)
            return "Nice try " + nameEditText.getText() + "\nYou scored " + correct + " out of 5.";
        else
            return "You need some studying on countries " + nameEditText.getText() + "\nYou scored " + correct + " out of 5.";
    }

    public void displayResults(String results) {
        TextView resultsTextView = (TextView) findViewById(R.id.results_text_view);
        resultsTextView.setText(results);
    }
}


