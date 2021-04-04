package com.akbay.newsaggregator.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "title")
	private String title;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	private Set<News> news;

}
