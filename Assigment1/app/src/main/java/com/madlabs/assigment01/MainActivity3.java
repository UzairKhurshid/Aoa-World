package com.madlabs.assigment01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button =(Button) findViewById(R.id.btnLogout);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v)
            {
                openActivitySignUp();
            }

        });

    }
    public  void  openActivitySignUp()
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
