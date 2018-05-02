package fr.formation.blog.domain;

// @Component : Annotation permettant de déclarer un bean Spring.

public class Article {

	private String description;

	private Integer id;

	private String title;

	public Article() {
	}

	public Article(Integer id, String title, String description) {
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public Integer getId() {
		return this.id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
