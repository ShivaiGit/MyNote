package ru.osmanov.mynote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton addNote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NoteFragment noteFragment = new NoteFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1,noteFragment).addToBackStack("").commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container2,noteFragment).addToBackStack("").commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container3,noteFragment).addToBackStack("").commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container4,noteFragment).addToBackStack("").commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container5,noteFragment).addToBackStack("").commit();

        addNote = findViewById(R.id.addButton);
    }
}