package com.example.simpletask02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //home activity page, maps each button to respective activity page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); //xml file in res > layout > activity_home file
        ImageButton mButtonAddNote = (ImageButton) findViewById(R.id.imageButton_AddNote); //addNote button
        ImageButton mButtonReminder = (ImageButton) findViewById(R.id.imageButton_AddReminder);
        ImageButton mButtonAddAlarm = (ImageButton) findViewById(R.id.imageButton_SetAlarm);
        ImageButton mButtonAddToDo = (ImageButton) findViewById(R.id.imageButton_AddToDo);

        mButtonAddNote.setOnClickListener(view -> { //onclick of add notes takes to NotesActivity code
            Intent addNoteIntent = new Intent(HomeActivity.this, NotesActivity.class);
            startActivity(addNoteIntent);
        });
    }
}