package it.feio.android.omninotes.commons.api;

import java.util.List;

import it.feio.android.omninotes.commons.models.Attachment;
import it.feio.android.omninotes.commons.models.Category;
import it.feio.android.omninotes.commons.models.Note;

public interface ONCloudApi {

    public static final String NOTES_FOLDER = "notes";
    public static final String CATEGORIES_FOLDER = "categories";
    public static final String ATTACHMENTS_FOLDER = "attachments";

    public List<Note> getNotes();

    public Note getNote(String noteId);

    public void putNote(Note note);

    public List<Category> getCategories(String attachmentId);

    public Category getCategory(String categoryId);

    public void putCategory(Category category);

    public List<Attachment> getAttachments();

    public Attachment getAttachment(String attachmentId);

    public void putAttachment(Attachment attachment);
}

