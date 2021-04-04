package com.akbay.newsaggregator.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "news")
@Data
public class News {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "keywords")
	private String keywords;

	@Column(name = "description")
	private String description;

	@Column(name = "image")
	private String image;

	@Column(name = "detail")
	private String detail;

	@Column(name = "date_created")
	private Date dateCreated;

	@Column(name = "last_updated")
	private Date lastUpdated;

	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;
}
