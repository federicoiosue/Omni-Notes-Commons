/*******************************************************************************
 * Copyright 2014 Federico Iosue (federico.iosue@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/
package it.feio.android.omninotes.commons.models;


import java.util.Calendar;


public class Category {

	private Long id;
	private String name;
	private String description;
	private String color;
	private int count;


	public Category() {
		this.id = Calendar.getInstance().getTimeInMillis();
	}


	public Category(Category category) {
		this(category.getId(), category.getName(), category.getDescription(), category.getColor());
	}


	public Category(Long id, String title, String description, String color) {
		super();
		this.id = id;
		this.name = title;
		this.description = description;
		this.color = color;
	}


	public Category(Long id, String title, String description, String color, int count) {
		super();
		this.id = id;
		this.name = title;
		this.description = description;
		this.color = color;
		this.count = count;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String title) {
		this.name = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	@Override
	public boolean equals(Object obj) {

		try {
			Category c = (Category) obj;
			return getColor().equals(c.getColor()) && getDescription().equals(c.getDescription()) && getName().equals
					(c.getName()) && getId().equals(c.getId());
		} catch (ClassCastException e) {
			return false;
		}
	}
}
