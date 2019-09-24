package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
        EditText edit;
        TextView tv;
        Button bt;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            bt = (Button) findViewById(R.id.button_change_language);
            edit = (EditText) findViewById(R.id.edit_text_country);
            tv = (TextView) findViewById(R.id.text_view_language);
            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = edit.getText().toString();
                    //
                    if (str.equals("en"))
                    { tv.setText(R.string.language_en);
                    bt.setText(R.string.change_language_en);}
                    else if (str.equals("cn"))
                    {    tv.setText(R.string.language_cn);
                    bt.setText(R.string.change_language_cn);}
                   else  if (str.equals("jp"))
                     {tv.setText(R.string.language_jp);
                    bt.setText(R.string.change_language_jp);}
                     else if (str.equals("kr"))
                     { tv.setText(R.string.language_kr);
                    bt.setText(R.string.change_language_kr);}
                    else
                    { tv.setText("Language");
                        bt.setText("change language");}
                }
            });
        }
    }
