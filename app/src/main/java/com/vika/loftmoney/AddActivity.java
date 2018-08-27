package com.vika.loftmoney;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {
    private EditText nameInput;
    private EditText priceInput;
    private Button addbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        nameInput = findViewById(R.id.name);
        priceInput = findViewById(R.id.price);
        addbutton = findViewById(R.id.button);

        nameInput.addTextChangedListener(txtwatcher);
        priceInput.addTextChangedListener(txtwatcher);
    }
    private  TextWatcher txtwatcher = new TextWatcher() {
         @Override
         public void beforeTextChanged(CharSequence s, int start, int count, int after) {

         }

         @Override
         public void onTextChanged(CharSequence s, int start, int before, int count) {
          String ninput =nameInput.getText().toString().trim();
             String pinput =priceInput.getText().toString().trim();
            addbutton.setEnabled(!ninput.isEmpty()&& !pinput.isEmpty());
         }

         @Override
         public void afterTextChanged(Editable s) {

         }
     };


    }








