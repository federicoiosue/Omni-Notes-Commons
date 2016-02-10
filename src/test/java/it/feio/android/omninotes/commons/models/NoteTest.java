package it.feio.android.omninotes.commons.models;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.*;


public class NoteTest {

	private Note note1;
	private Note note2;


	@Before
	public void setUp() {
		note1 = new Note();
		note1.setTitle("new title");
		note1.setContent("some random content");
		note1.setCreation(Calendar.getInstance().getTimeInMillis() - 10000);
		note1.setLastModification(Calendar.getInstance().getTimeInMillis() - 10000);
		note1.setLocked(true);

		note2 = new Note();
		note2.setTitle("another title");
		note2.setContent("some more random different content");
		note2.setCreation(Calendar.getInstance().getTimeInMillis());
		note2.setLastModification(Calendar.getInstance().getTimeInMillis());
		note2.setCategory(new Category());
	}


	@Test
	public void equivalence() {
		Note newNote = new Note(note1);
		assertEquals(note1, newNote);
		newNote.setContent(note1.getContent());
		assertEquals(note1, newNote);
	}


	@Test
	public void equivalenceByCategory() {
		Note newNote = new Note(note1);
		newNote.setCategory(new Category());
		assertEquals(note1, newNote);
	}


	@Test
	public void difference() {
		assertNotEquals(note1, note2);
	}


	@Test
	public void listContainsNote() {
		List<Note> notes = new ArrayList<>();
		notes.add(note1);
		notes.add(note2);
		assertTrue(notes.contains(note1));
		assertTrue(notes.contains(note2));
		assertFalse(notes.contains(new Note()));
	}
}
