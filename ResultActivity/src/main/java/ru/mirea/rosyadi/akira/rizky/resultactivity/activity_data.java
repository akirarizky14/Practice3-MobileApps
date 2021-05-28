package ru.mirea.rosyadi.akira.rizky.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_data extends AppCompatActivity {
    private Button button1;

         private EditText universityEditText;

         @Override
         protected void onCreate(Bundle savedInstanceState) {
             super.onCreate(savedInstanceState);
             setContentView(R.layout.activity_data);
             universityEditText = findViewById(R.id.editTextTextPersonName);
             button1 = (Button) findViewById(R.id.button2);
             button1.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                         Intent intent = new Intent();
                         intent.putExtra("name", universityEditText.getText().toString());
                         setResult(RESULT_OK, intent);
                         finish();
                     }
             });
         }



}