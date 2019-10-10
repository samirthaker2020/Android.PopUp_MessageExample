package com.example.androidpopup_messageexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {

    Button btnclick;
    PopupWindow popUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnclick=findViewById(R.id.btn1);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog2 = new AlertDialog.Builder(MainActivity.this);

// Setting Dialog Title
                alertDialog2.setTitle("Pop-Up Dialog Message");

// Setting Dialog Message
                alertDialog2.setMessage("This is the Dialog Message");

// Setting Icon to Dialog
               // alertDialog2.setIcon(R.drawable.delete);
                alertDialog2.show();
            }

        });


    }
}
