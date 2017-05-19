package com.example.android.subtracto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView msolution;
    EditText N1;
    EditText N2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msolution= (TextView) findViewById(R.id.answer);
        N1= (EditText) findViewById(R.id.num1);
        N2= (EditText) findViewById(R.id.num2);
    }

    float calculatesol (int opindex){
        float n1=Float.parseFloat(N1.getText().toString());
        float n2=Float.parseFloat(N2.getText().toString());
        float sol=0;
        switch(opindex){
            case 1: sol=n1+n2; break;
            case 2: sol=n1-n2; break;
            case 3: sol=n1*n2; break;
            case 4: sol= n1/n2; break;
        }
        return sol;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemThatWasClickedId = item.getItemId();
        float ans=0;
        switch(itemThatWasClickedId){
            case R.id.itemadd: ans= calculatesol(1); break;
            case R.id.itemsub: ans= calculatesol(2); break;
            case R.id.itemmul: ans= calculatesol(3); break;
            case R.id.itemdiv: ans= calculatesol(4); break;
        }
        msolution.setText(String.valueOf(ans));
        return super.onOptionsItemSelected(item);
    }


}
