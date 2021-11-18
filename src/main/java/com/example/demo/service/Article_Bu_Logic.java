package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ArticleLibrary;

import com.example.demo.repository.ArticleRepository;

@Service
public class Article_Bu_Logic implements ArticleService {
	
	   @Autowired
	    private ArticleRepository repo;

	    @Override
	    public List <ArticleLibrary > getAllArticle() {
	        return repo.findAll();
	    }

	    @Override
	    public void saveArticle(ArticleLibrary article) {
	        this.repo.save(article);
	    }

	    @Override
	    public ArticleLibrary getArticleById(long id) {
	        Optional <ArticleLibrary > optional =repo.findById(id);
	        ArticleLibrary article = null;
	        if (optional.isPresent()) {
	            article = optional.get();
	        } else {
	            throw new RuntimeException(" Article not found for id :: " + id);
	        }
	        return article;
	    }

	    @Override
	    public void deleteArticleById(long id) {
	        this.repo.deleteById(id);
	    }

}
