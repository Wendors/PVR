package com.psv.pvr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.Dimension;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    int open = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Starts(View v)
    {
        Startss();
    }
    public void Startss()
    {
        open = 0;
        setContentView(R.layout.start_open);
    }
    public void sbutton1(View v)
    {
        Texts("1");
    }
    public void sbutton2(View v)
    {
        Texts("2");
    }
    public void sbutton3(View v)
    {
        Texts("3");
    }
    public void sbutton4(View v)
    {
        Texts("4");
    }
    public void sbutton5(View v)
    {
        Texts("5");
    }
    public void sbutton6(View v)
    {
        Texts("6");
    }
    public void sbutton7(View v)
    {
        Texts("7");
    }
    public void sbutton8(View v)
    {
        Texts("8");
    }
    public void sbutton9(View v)
    {
        Texts("9");
    }
    public void sbutton10(View v)
    {
        Texts("10");
    }
    public void sbutton11(View v)
    {
        Texts("11");
    }
    public void sbutton12(View v)
    {
        Texts("12");
    }
    public void sbutton13(View v)
    {
        Texts("13");
    }
    public void sbutton14(View v)
    {
        Texts("14");
    }
    public void sbutton15(View v)
    {
        Texts("15");
    }
    public void sbutton16(View v)
    {
        Texts("16");
    }
    public void sbutton17(View v)
    {
        Texts("17");
    }
    public void sbutton18(View v)
    {
        Texts("18");
    }
    public void sbutton19(View v)
    {
        Texts("19");
    }
    public void sbutton20(View v)
    {
        Texts("20");
    }
    public void sbutton21(View v)
    {
        Texts("21");
    }
    public void sbutton22(View v)
    {
        Texts("22");
    }
    public void sbutton23(View v)
    {
        Texts("23");
    }
    public void sbutton24(View v)
    {
        Texts("24");
    }
    public void sbutton25(View v)
    {
        Texts("25");
    }
    public void sbutton26(View v)
    {
        Texts("26");
    }
    public void sbutton27(View v)
    {
        Texts("27");
    }
    public void sbutton28(View v)
    {
        Texts("28");
    }
    public void sbutton29(View v)
    {
        Texts("29");
    }
    public void sbutton30(View v)
    {
        Texts("30");
    }
    public void sbutton31(View v)
    {
        Texts("31");
    }
    public void sbutton32(View v)
    {
        Texts("32");
    }
    public void sbutton33(View v)
    {
        Texts("33");
    }
    public void sbutton34_1(View v)
    {
        Texts("34_1");
    }
    public void sbutton34_2(View v)
    {
        Texts("34_2");
    }
    public void sbutton34(View v)
    {
        Texts("34");
    }

    public void Texts(String ins)
    {

        open = 1;
        setContentView(R.layout.text_fild);
        TextView textv = findViewById(R.id.text_teads);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(getAssets().open(ins)));
            StringBuilder sf = new StringBuilder();
            String mLine= reader.readLine();
            while (mLine  != null) {
                //process line
                sf.append(mLine);
                sf.append(System.lineSeparator());
                mLine = reader.readLine();
            }
            textv.setText(sf.toString());
        }
        catch (IOException e) {
            //log the exception
        }
    }
    public void dzmist(View v){
        d_zmist();
    }
    private void d_zmist()
    {
        open = 1;
        setContentView(R.layout.dozmist);
    }
    public void dbutton1(View v)
    {
        Texts("35");
    }
    public void dbutton2(View v)
    {
        Texts("36");
    }
    public void dbutton3(View v)
    {
        Texts("37");
    }
    public void dbutton4(View v)
    {
        Texts("38");
    }
    public void dbutton5(View v)
    {
        Texts("39");
    }
    public void dbutton6(View v)
    {
        Texts("40");
    }

    @Override
    public void onBackPressed()
    {
        if(open == 1){
            Startss();
        }
        else if(open == 0){
            super.onBackPressed();
        }
    }
}