package com.example.secondproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText edittext,txtpassword,email,pno,datetime;
    Button addbtn;
    TextView textView,numbpass,emai,phonenum,datetimee;
    AutoCompleteTextView atv;
    String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext =(EditText)findViewById(R.id.edittext);
        txtpassword =(EditText)findViewById(R.id.txtpassword);
        email =(EditText)findViewById(R.id.email);
        pno =(EditText)findViewById(R.id.pno);
        datetime =(EditText)findViewById(R.id.datetime);

        addbtn=(Button)findViewById(R.id.addbtn);
        textView=(TextView)findViewById(R.id.textView);
        numbpass=(TextView)findViewById(R.id.numbpass);
        emai=(TextView)findViewById(R.id.emai);
        phonenum=(TextView)findViewById(R.id.phonenum);
        datetimee=(TextView)findViewById(R.id.datetimee);

        atv=(AutoCompleteTextView)findViewById(R.id.autocomplete);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, (List<String>) atv);

        atv.setAdapter(adapter);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable text=edittext.getText();
                Editable pass=txtpassword.getText();
                Editable emaiil=email.getText();
                Editable phone=pno.getText();
                Editable date=datetime.getText();


                textView.setText(pass);
                numbpass.setText(text);
                emai.setText(emaiil);
                phonenum.setText(phone);
                datetimee.setText(date);



            }
        });
    }
}
