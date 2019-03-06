package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.Main2Activity;
import com.example.myapplication.R;

import java.util.EmptyStackException;

public class MainActivity extends AppCompatActivity{

    EditText da;
    double n,y;
    boolean bo=true;
    String rr;
    int last=1;
    String lastAnswer="not yet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        da=(EditText) findViewById(R.id.et);
    }

    public void plus(View view) {
        if(bo) {
            rr=da.getText().toString();
            if((rr.length()!=0)&&(rr.length()<=10)){
                n=Double.parseDouble(rr);
                da.setHint(""+n);
                da.setText("");
                bo=false;}
            else {
                da.setText("");
                da.setHint("Start Again");
                bo=true;
            }
        }
        else {
            rr=da.getText().toString();
            if((rr.length()!=0)&&(rr.length()<=10)){
                y=Double.parseDouble(rr);
                switch (last) {
                    case 1: n=n+y;
                        break;
                    case 2: n=n-y;
                        break;
                    case 3: n=n*y;
                        break;
                    case 4: if(y!=0){
                        n=n/y;}
                    else{ da.setText("");
                        da.setHint("Start Again");
                        bo=true;}
                        break;}
                da.setHint(""+n);
                da.setText("");
            }
            else {
                da.setText("");
                da.setHint("Start Again");
                bo=true;
            }
        }

        last=1;
    }

    public void minus(View view) {

        if(bo) {
            rr=da.getText().toString();
            if((rr.length()!=0)&&(rr.length()<=10)){
                n=Double.parseDouble(rr);
                da.setHint(""+n);
                da.setText("");
                bo=false;}
            else {
                da.setText("");
                da.setHint("Start Again");
                bo=true;
            }
        }
        else {
            rr=da.getText().toString();
            if((rr.length()!=0)&&(rr.length()<=10)){
                y=Double.parseDouble(rr);
                switch (last) {
                    case 1: n=n+y;
                        break;
                    case 2: n=n-y;
                        break;
                    case 3: n=n*y;
                        break;
                    case 4: if(y!=0){
                        n=n/y;}
                    else{ da.setText("");
                        da.setHint("Start Again");
                        bo=true;}
                        break;}
                da.setHint(""+n);
                da.setText("");
            }
            else {
                da.setText("");
                da.setHint("Start Again");
                bo=true;
            }
        }

        last=2;
    }



    public void multipy(View view) {


        if(bo) {
            rr=da.getText().toString();
            if((rr.length()!=0)&&(rr.length()<=10)){
                n=Double.parseDouble(rr);
                da.setHint(""+n);
                da.setText("");
                bo=false;}
            else {
                da.setText("");
                da.setHint("Start Again");
                bo=true;
            }
        }
        else {
            rr=da.getText().toString();
            if((rr.length()!=0)&&(rr.length()<=10)){
                y=Double.parseDouble(rr);
                switch (last) {
                    case 1: n=n+y;
                        break;
                    case 2: n=n-y;
                        break;
                    case 3: n=n*y;
                        break;
                    case 4: if(y!=0){
                        n=n/y;}
                    else{ da.setText("");
                        da.setHint("Start Again");
                        bo=true;}
                        break;}
                da.setHint(""+n);
                da.setText("");
            }
            else {
                da.setText("");
                da.setHint("Start Again");
                bo=true;
            }
        }

        last=3;
    }



    public void devide(View view) {


        if(bo) {
            rr=da.getText().toString();
            if((rr.length()!=0)&&(rr.length()<=10)){
                n=Double.parseDouble(rr);
                da.setText("");
                da.setHint(""+n);
                bo=false;}
            else {
                da.setText("");
                da.setHint("Start Again");
                bo=true;
            }
        }
        else {
            rr=da.getText().toString();
            if((rr.length()!=0)&&(rr.length()<=10)){
                y=Double.parseDouble(rr);
                switch (last) {
                    case 1: n=n+y;
                        break;
                    case 2: n=n-y;
                        break;
                    case 3: n=n*y;
                        break;
                    case 4: if(y!=0){
                        n=n/y;}
                    else{ da.setText("");
                        da.setHint("Start Again");
                        bo=true;}
                        break;}
                da.setHint(""+n);
                da.setText("");
            }
            else {
                da.setText("");
                da.setHint("Start Again");
                bo=true;
            }
        }

        last=4;
    }

    public void shave(View view) {
        if(bo) {
            rr=da.getText().toString();
            if((rr.length()!=0)&&(rr.length()<=10)){
                n=Double.parseDouble(rr);
                da.setText("Answer="+n);
                bo=false;}
            else {
                da.setText("");
                da.setHint("Start Again");
                bo=true;
            }
        }
        else {
            rr=da.getText().toString();
            if((rr.length()!=0)&&(rr.length()<=10)){
                y=Double.parseDouble(rr);
                switch (last) {
                    case 1: n=n+y;
                        break;
                    case 2: n=n-y;
                        break;
                    case 3: n=n*y;
                        break;
                    case 4: if(y!=0){
                        n=n/y;}
                    else{ da.setText("");
                        da.setHint("Start Again");
                        bo=true;}
                        break;}
                da.setText("Answer="+n);
                lastAnswer=""+n;
            }
            else {
                da.setText("");
                da.setHint("Start Again");
                bo=true;
            }
        }



    }

    public void ac(View view) {
        da.setText("");
        da.setHint("");
        bo=true;
    }

    public void credits(View view) {
        Intent si=new Intent(this,Main2Activity.class);
        si.putExtra("Answer",lastAnswer);
        startActivity(si);}

}