package ru.osmanov.mynote;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NotesFragment extends Fragment {

    private TextView titleNotes;
    private TextView dateNotes;
    private TextView descriptionNotes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        titleNotes = view.findViewById(R.id.tv_titleNotes);
        dateNotes = view.findViewById(R.id.tv_dateNotes);
        descriptionNotes = view.findViewById(R.id.tv_descriptionNotes);
    }
}