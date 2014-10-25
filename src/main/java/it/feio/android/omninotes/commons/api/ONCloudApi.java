package it.feio.android.omninotes.commons.api;

import it.feio.android.omninotes.commons.listeners.DataRetrievedListener;
import it.feio.android.omninotes.commons.models.Attachment;
import it.feio.android.omninotes.commons.models.Category;
import it.feio.android.omninotes.commons.models.Note;

public interface ONCloudApi {

    public static final String NOTES_FOLDER = "notes";
    public static final String CATEGORIES_FOLDER = "categories";
    public static final String ATTACHMENTS_FOLDER = "attachments";

    public void getNotes(DataRetrievedListener dataRetrievedListener);
    public Note getNote(String noteId);
    public void putNote(Note note);
    public void delNote(Note note);

    public void getCategories(DataRetrievedListener dataRetrievedListener);
    public Category getCategory(String categoryId);
    public void putCategory(Category category);
    public void delCategory(Category category);

    public void getAttachments(DataRetrievedListener dataRetrievedListener);
    public Attachment getAttachment(String attachmentId);
    public void putAttachment(Attachment attachment);
    public void delAttachment(Attachment attachment);

    public void purge();
}

