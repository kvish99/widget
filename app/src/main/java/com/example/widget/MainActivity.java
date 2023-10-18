package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkbox;
    RadioGroup radiobutton;
    Spinner spinner;

    Button button, button2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox = findViewById(R.id.checkbox);
        radiobutton = findViewById(R.id.radiogroup);
        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.button);
        button2=findViewById(R.id.button);



        //checkbox

        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean ischecked) {

                if (checkbox.isChecked()) {

                    Toast.makeText(MainActivity.this, "is checked", Toast.LENGTH_SHORT).show();
                } else {


                    Toast.makeText(MainActivity.this, "not selected", Toast.LENGTH_SHORT).show();

                }
            }
        });

        //radio group

        radiobutton.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);

                Toast.makeText(MainActivity.this, "you selected " + radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });


        //spinner

        String[] courses = {"java", "kotlin", "dart", "react native", "c++"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, courses);
        spinner.setAdapter(adapter);


        //button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "button is click", Toast.LENGTH_SHORT).show();



                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                        startActivity(intent1);
                    }
                });





            }
        });
    }
}














