package com.madlabs.assigment01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =(Button) findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v)
            {
                openActivityLogin();
            }

        });

    }

    public  void  openActivityLogin()
    {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}
