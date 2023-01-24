package ru.osmanov.mynote;

import java.io.Serializable;

public class Notes implements Serializable {
    private String titleNote;
    private String descriptionNote;
    private String dataNote;

    public String getTitleNote() {
        return titleNote;
    }

    public void setTitleNote(String titleNote) {
        this.titleNote = titleNote;
    }

    public String getDescriptionNote() {
        return descriptionNote;
    }

    public void setDescriptionNote(String descriptionNote) {
        this.descriptionNote = descriptionNote;
    }

    public String getDataNote() {
        return dataNote;
    }

    public void setDataNote(String dataNote) {
        this.dataNote = dataNote;
    }
}
