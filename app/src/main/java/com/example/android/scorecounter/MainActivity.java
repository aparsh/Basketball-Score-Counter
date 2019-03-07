package com.example.android.scorecounter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int pointa = 0;
    int pointb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dunkscorea(View view) {
        pointa = pointa + 1;
        displaya(pointa);

    }

    public void twoscorea(View view) {
        pointa = pointa + 2;
        displaya(pointa);
    }

    public void threescorea(View view) {
        pointa = pointa + 3;
        displaya(pointa);
    }

    public void dunkscoreb(View view) {
        pointb = pointb + 1;
        displayb(pointb);

    }

    public void twoscoreb(View view) {
        pointb = pointb + 2;
        displayb(pointb);
    }

    public void threescoreb(View view) {
        pointb = pointb + 3;
        displayb(pointb);
    }

    public void reset(View view) {
        pointa = 0;
        pointb = 0;
        displaya(pointa);
        displayb(pointb);
        String d = " ";
        display(d);
    }

    public void result(View view) {
        if (pointa > pointb) {
            String a = "TEAM 1 WON!!!";
            display(a);
        }
        if (pointa < pointb) {
            String a = "TEAM 2 WON!!!";
            display(a);
        }
        if (pointb == pointa) {
            String c = "ITS A TIE!!!";
            display(c);
        }
    }
    private void displaya(int number) {
        TextView quantityTextViewa = (TextView) findViewById(
                R.id.score1);
        quantityTextViewa.setText("" + number);
    }

    private void displayb(int number) {
        TextView quantityTextViewb = (TextView) findViewById(
                R.id.score2);
        quantityTextViewb.setText("" + number);
    }

    private void display(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.result);
        priceTextView.setText(message);
    }
}
