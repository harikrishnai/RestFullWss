package com.jerseyutil.domain;

import java.io.Serializable;

public class Book implements Serializable {
         private Integer isbn;
         private String title;
         private String author;
         private Double price;
		
		public Integer getIsbn() {
			return isbn;
		}
		public void setIsbn(Integer isbn) {
			this.isbn = isbn;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + "]";
		}
         
}
