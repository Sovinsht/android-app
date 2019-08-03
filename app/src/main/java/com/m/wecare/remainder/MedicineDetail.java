package com.m.wecare.remainder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.m.wecare.R;

public class MedicineDetail extends AppCompatActivity {

    private TextView nameText,dosageText,timeText;
    private Button deleteBtn;
    private ImageView typeImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pill_medicine_detail);

        nameText=findViewById(R.id.title);
        dosageText=findViewById(R.id.dosage);
        timeText=findViewById(R.id.time);
        typeImageView=findViewById(R.id.type);

        //getting data from intent
        String name=getIntent().getStringExtra("name");
        String dosage=getIntent().getStringExtra("dosage");
        String type=getIntent().getStringExtra("type");
        String time=getIntent().getStringExtra("time");

        //setting data to ui
        nameText.setText(name);
        dosageText.setText(dosage);
        timeText.setText(time);
        typeImageView.setImageResource(R.drawable.capsule_large);






    }
}
