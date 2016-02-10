package it.feio.android.omninotes.commons.models;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class CategoryTest {

	private Category category1;
	private Category category2;


	@Before
	public void setUp() {
		category1 = new Category();
		category1.setId(1L);
		category1.setColor("#ffffff");
		category1.setCount(10);
		category1.setDescription("first cat description");
		category1.setName("first cat name");

		category2 = new Category();
		category2.setId(2L);
		category2.setColor("#000000");
		category2.setCount(5);
		category2.setDescription("second cat description");
		category2.setName("second cat name");
	}


	@Test
	public void equivalence() {
		Category newCategory = new Category(category1);
		assertEquals(category1, newCategory);
	}


	@Test
	public void difference() {
		assertNotEquals(category1, category2);
	}


	@Test
	public void listContainsNote() {
		List<Category> categories = new ArrayList<>();
		categories.add(category1);
		categories.add(category2);
		assertTrue(categories.contains(category2));
		assertTrue(categories.contains(category1));

		Category newCategory = new Category();
		newCategory.setName("newCat");
		newCategory.setDescription("newCat desc");
		newCategory.setColor("#cccccc");
		assertFalse(categories.contains(newCategory));


	}
}
