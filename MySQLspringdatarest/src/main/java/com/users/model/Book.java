package com.users.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_table")
public class Book {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long bookId;
	private String bookName;
	private String authorName;

	/*
	 * public long getBookId() { return bookId; } public void setBookId(long bookId)
	 * { this.bookId = bookId; }
	 */
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + "]";
	}
	
	

}
