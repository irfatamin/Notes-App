package com.example.notes_app;

import androidx.cardview.widget.CardView;

import com.example.notes_app.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
