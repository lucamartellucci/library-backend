package com.absontheweb.bookshop.book.model;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.absontheweb.bookshop.book.model.validation.Isbn;

public class Book {
	
	private Long id;
	
	@NotNull(message="{error.validation.title.notnull}")
	@Size(max=150, message="{error.validation.title.maxlength}")
	private String title;
	
	@Isbn
	private String isbn;
	
	@Size(max=3000, message="{error.validation.description.maxlength}")
	private String description;
	
	@NotNull(message="{error.validation.author.notnull}")
	@Size(min=1, message="{error.validation.author.atleastone.required}")
	private List<Author> authors;
	
	@NotNull(message="{error.validation.price.notnull}")
	private Double price;
	
	private LocalDate releaseDate;
	
	@NotNull(message="{error.validation.currency.notnull}")
	private Currency currency;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Book id(Long id) {
		this.id = id;
		return this;
	}
	public Book title(String value) {
		this.title = value;
		return this;
	}
	public Book isbn(String value) {
		this.isbn = value;
		return this;
	}
	public Book description(String value) {
		this.description = value;
		return this;
	}
	public Book authors(List<Author> value) {
		this.authors = value;
		return this;
	}
	public Book price(Double value) {
		this.price = value;
		return this;
	}
	public Book releaseDate(LocalDate value) {
		this.releaseDate = value;
		return this;
	}
	
	public Book currency(Currency value) {
		this.currency = value;
		return this;
	}
	
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate value) {
		this.releaseDate = value;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result
				+ ((currency == null) ? 0 : currency.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (currency != other.currency)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (releaseDate == null) {
			if (other.releaseDate != null)
				return false;
		} else if (!releaseDate.equals(other.releaseDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", isbn=");
		builder.append(isbn);
		builder.append(", description=");
		builder.append(description);
		builder.append(", authors=");
		builder.append(authors);
		builder.append(", price=");
		builder.append(price);
		builder.append(", releaseDate=");
		builder.append(releaseDate);
		builder.append(", currency=");
		builder.append(currency);
		builder.append("]");
		return builder.toString();
	}

}
