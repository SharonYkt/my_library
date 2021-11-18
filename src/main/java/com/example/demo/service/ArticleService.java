package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ArticleLibrary;


public interface ArticleService {
    List < ArticleLibrary > getAllArticle();
    void saveArticle(ArticleLibrary article);
    ArticleLibrary getArticleById(long id);
    void deleteArticleById(long id);
}
