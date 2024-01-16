package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
    }

    private void initializeViews() {
        editText = findViewById(R.id.inputTextField);
    }

    public void btn_cancel(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        String oldInputText = editText.getText().toString();

        if (buttonText.equalsIgnoreCase("C")) {
            editText.setText("");
            return;
        } else if (buttonText.equalsIgnoreCase("DELETE")) {
            // Handle the DELETE button by removing the last character
            if (!oldInputText.isEmpty()) {
                String newInputText = oldInputText.substring(0, oldInputText.length() - 1);
                editText.setText(newInputText);
            }
        } else if (buttonText.equalsIgnoreCase("X")) {
            editText.setText(oldInputText + "*");
        }

        else if (buttonText.equalsIgnoreCase("+")) {
            editText.setText(oldInputText + "+");

        }
             else if (buttonText.equalsIgnoreCase("-")) {
                editText.setText(oldInputText + "-");

        } else if (buttonText.equalsIgnoreCase("=")) {
            // Handle the "=" button (perform calculation or whatever you intend to do)
            // For now, let's just clear the input field
            editText.setText("😂");
        } else {
            // For other buttons, just append the buttonText to the existing text
            editText.setText(oldInputText + buttonText);
        }

    }
}
