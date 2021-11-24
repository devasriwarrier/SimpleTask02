package com.example.simpletask02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        ImageButton mButtonAddNote = (ImageButton) findViewById(R.id.imageButton_AddNote);

        mButtonAddNote.setOnClickListener(view -> {
            Intent addNoteIntent = new Intent(HomeActivity.this, NoteMainActivity.class);
            startActivity(addNoteIntent);
        });
    }
}