package com.mathdenizi.notes.services;

import com.mathdenizi.notes.models.Note;

public interface AuditLogService {
    void logNoteCreation(String username, Note note);

    void logNoteUpdate(String username, Note note);

    void logNoteDeletion(String username, Long noteId);
}