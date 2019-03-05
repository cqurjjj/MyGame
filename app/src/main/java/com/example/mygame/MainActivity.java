package com.example.mygame;

import android.content.DialogInterface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int Qus1 = 0 , Qus2 = 0 , Qus3 = 0 , Qus4 = 0 , Ans = 0 ;
    static int Goal = 0;
    //设置第一个图片的背景
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void SetImage1(int i){
        switch(i){
            case 0:(findViewById(R.id.imageButton1)).setBackground(getResources().getDrawable(R.drawable.bear96w));
                Qus1 = 0; break;
            case 1:(findViewById(R.id.imageButton1)).setBackground(getResources().getDrawable(R.drawable.bird96w));
                Qus1 = 1; break;
            case 2:(findViewById(R.id.imageButton1)).setBackground(getResources().getDrawable(R.drawable.cat96w));
                Qus1 = 2; break;
            case 3:(findViewById(R.id.imageButton1)).setBackground(getResources().getDrawable(R.drawable.elephant96w));
                Qus1 = 3; break;
            case 4:(findViewById(R.id.imageButton1)).setBackground(getResources().getDrawable(R.drawable.fish96w));
                Qus1 = 4; break;
            case 5:(findViewById(R.id.imageButton1)).setBackground(getResources().getDrawable(R.drawable.flower96w));
                Qus1 = 5; break;
            case 6:(findViewById(R.id.imageButton1)).setBackground(getResources().getDrawable(R.drawable.honey96w));
                Qus1 = 6; break;
        }
    }
    //设置第二个图片的背景
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void SetImage2(int i){
        switch(i){
            case 0:(findViewById(R.id.imageButton2)).setBackground(getResources().getDrawable(R.drawable.bear96w));
                Qus2 = 0; break;
            case 1:(findViewById(R.id.imageButton2)).setBackground(getResources().getDrawable(R.drawable.bird96w));
                Qus2 = 1; break;
            case 2:(findViewById(R.id.imageButton2)).setBackground(getResources().getDrawable(R.drawable.cat96w));
                Qus2 = 2; break;
            case 3:(findViewById(R.id.imageButton2)).setBackground(getResources().getDrawable(R.drawable.elephant96w));
                Qus2 = 3; break;
            case 4:(findViewById(R.id.imageButton2)).setBackground(getResources().getDrawable(R.drawable.fish96w));
                Qus2 = 4; break;
            case 5:(findViewById(R.id.imageButton2)).setBackground(getResources().getDrawable(R.drawable.flower96w));
                Qus2 = 5; break;
            case 6:(findViewById(R.id.imageButton2)).setBackground(getResources().getDrawable(R.drawable.honey96w));
                Qus2 = 6; break;
        }
    }
    //设置第三个图片的背景
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void SetImage3(int i){
        switch(i){
            case 0:(findViewById(R.id.imageButton3)).setBackground(getResources().getDrawable(R.drawable.bear96w));
                Qus3 = 0; break;
            case 1:(findViewById(R.id.imageButton3)).setBackground(getResources().getDrawable(R.drawable.bird96w));
                Qus3 = 1; break;
            case 2:(findViewById(R.id.imageButton3)).setBackground(getResources().getDrawable(R.drawable.cat96w));
                Qus3 = 2; break;
            case 3:(findViewById(R.id.imageButton3)).setBackground(getResources().getDrawable(R.drawable.elephant96w));
                Qus3 = 3; break;
            case 4:(findViewById(R.id.imageButton3)).setBackground(getResources().getDrawable(R.drawable.fish96w));
                Qus3 = 4; break;
            case 5:(findViewById(R.id.imageButton3)).setBackground(getResources().getDrawable(R.drawable.flower96w));
                Qus3 = 5; break;
            case 6:(findViewById(R.id.imageButton3)).setBackground(getResources().getDrawable(R.drawable.honey96w));
                Qus3 = 6; break;
        }
    }
    //设置第四个图片的背景
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void SetImage4(int i){
        switch(i){
            case 0:(findViewById(R.id.imageButton4)).setBackground(getResources().getDrawable(R.drawable.bear96w));
                Qus4 = 0; break;
            case 1:(findViewById(R.id.imageButton4)).setBackground(getResources().getDrawable(R.drawable.bird96w));
                Qus4 = 1; break;
            case 2:(findViewById(R.id.imageButton4)).setBackground(getResources().getDrawable(R.drawable.cat96w));
                Qus4 = 2; break;
            case 3:(findViewById(R.id.imageButton4)).setBackground(getResources().getDrawable(R.drawable.elephant96w));
                Qus4 = 3; break;
            case 4:(findViewById(R.id.imageButton4)).setBackground(getResources().getDrawable(R.drawable.fish96w));
                Qus4 = 4; break;
            case 5:(findViewById(R.id.imageButton4)).setBackground(getResources().getDrawable(R.drawable.flower96w));
                Qus4 = 5; break;
            case 6:(findViewById(R.id.imageButton4)).setBackground(getResources().getDrawable(R.drawable.honey96w));
                Qus4 = 6; break;
        }
    }

    //设置问题
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void SetQuestion(int i){
        switch(i){
            case 0:((Button)findViewById(R.id.button_ans)).setText("Bear");
                Ans = 0; break;
            case 1:((Button)findViewById(R.id.button_ans)).setText("Bird");;
                Ans = 1; break;
            case 2:((Button)findViewById(R.id.button_ans)).setText("Cat");;
                Ans = 2; break;
            case 3:((Button)findViewById(R.id.button_ans)).setText("Elephant");;
                Ans = 3; break;
            case 4:((Button)findViewById(R.id.button_ans)).setText("Fish");;
                Ans = 4; break;
            case 5:((Button)findViewById(R.id.button_ans)).setText("Flower");;
                Ans = 5; break;
            case 6:((Button)findViewById(R.id.button_ans)).setText("Honey");;
                Ans = 6; break;
        }
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void btn_Star(View view) {
        setContentView(R.layout.activity_game1);

        int x = (int) (Math.random()*7);
        //int y = 6 - x;
        SetImage1(x);
        x = (x + 1) % 7;
        SetImage2(x);
        x = (x + 1) % 7;
        SetImage3(x);
        x = (x + 1) % 7;
        SetImage4(x);
        x = x - 2;
        SetQuestion(x);
    }

    public void btn_Exit(View view) {
        System.exit(0);
    }

    public void btn_return(View view) {
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void imgbtn_ans1(View view) {
        if ( Qus1 == Ans ) {
            Goal = Goal + 10;
            String M ="" + Goal;
            ((TextView)findViewById(R.id.tv_goal)).setText(M);
            int x = (int) (Math.random()*7);

            SetImage1(x);
            x = (x + 1) % 7;
            SetImage2(x);
            x = (x + 1) % 7;
            SetImage3(x);
            x = (x + 1) % 7;
            SetImage4(x);
            x = x - 1;
            SetQuestion(x);
        }
        else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Notice").setMessage("Game Over!").setNegativeButton("Sure", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    setContentView(R.layout.activity_main);
                }
            }).show();
        }

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void imgbtn_ans2(View view) {
        if ( Qus2 == Ans ) {
            Goal = Goal + 10;
            String M ="" + Goal;
            ((TextView)findViewById(R.id.tv_goal)).setText(M);

            int x = (int) (Math.random()*7);
            SetImage1(x);
            x = (x + 1) % 7;
            SetImage2(x);
            x = (x + 1) % 7;
            SetImage3(x);
            x = (x + 1) % 7;
            SetImage4(x);
            x = x - 2;
            SetQuestion(x);
        }
        else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Notice").setMessage("Game Over!").setNegativeButton("Sure", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    setContentView(R.layout.activity_main);
                }
            }).show();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void imgbtn_ans3(View view) {
        if ( Qus3 == Ans ) {
            Goal = Goal + 10;
            String M ="" + Goal;
            ((TextView)findViewById(R.id.tv_goal)).setText(M);

            int x = (int) (Math.random()*7);
            SetImage1(x);
            x = (x + 1) % 7;
            SetImage2(x);
            x = (x + 1) % 7;
            SetImage3(x);
            x = (x + 1) % 7;
            SetImage4(x);
            x = x - 1;
            SetQuestion(x);
        }
        else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Notice").setMessage("Game Over!").setNegativeButton("Sure", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    setContentView(R.layout.activity_main);
                }
            }).show();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void imgbtn_ans4(View view) {
        if ( Qus4 == Ans ) {
            Goal = Goal + 10;
            String M ="" + Goal;
            ((TextView)findViewById(R.id.tv_goal)).setText(M);

            int x = (int) (Math.random()*7);
            SetImage1(x);
            x = (x + 1) % 7;
            SetImage2(x);
            x = (x + 1) % 7;
            SetImage3(x);
            x = (x + 1) % 7;
            SetImage4(x);
            x = x - 1;
            SetQuestion(x);
        }
        else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Notice").setMessage("Game Over!").setNegativeButton("Sure", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    setContentView(R.layout.activity_main);
                }
            }).show();

            //Toast.makeText(this,"Game Over",Toast.LENGTH_LONG).show();

        }
    }
}
