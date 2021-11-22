package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.ArticleLibrary;

import com.example.demo.service.Article_Bu_Logic;

@Controller
public class ArticleRemote {

	@Autowired
	private Article_Bu_Logic bu;

	@GetMapping("/category")
	public String category() {
		return "category_collection";
	}

	@GetMapping("/fiction")
	public String fiction(Model model) {

		return "fiction";
	}

	@GetMapping("/non-fiction")
	public String nonfiction() {
		return "non-fiction";

	}

	@GetMapping("/Wildlife")
	public String Wildlife() {
		return "Wildlife";

	}

	@GetMapping("/Science_Tech")
	public String Science_Tech() {
		return "Science_Tech";

	}

	@GetMapping("/Political")
	public String Political() {
		return "Political";

	}

	@GetMapping("/fiction_book1/{id}")
	public String fictionbook1(@PathVariable("id") long id, Model model) {
		ArticleLibrary article1 = bu.getArticleById(id);
		model.addAttribute("article", article1);
		return "fiction_book1_details";
	}

	@GetMapping("/fiction_book2/{id}")
	public String fictionbook2(@PathVariable("id") long id, Model model) {
		ArticleLibrary article2 = bu.getArticleById(id);
		model.addAttribute("article", article2);
		return "fiction_book2_details";
	}

	@GetMapping("/fiction_book3/{id}")
	public String fictionbook3(@PathVariable("id") long id, Model model) {
		ArticleLibrary article3 = bu.getArticleById(id);
		model.addAttribute("article", article3);
		return "fiction_book3_details";
	}

	@GetMapping("/fiction_book4/{id}")
	public String fictionbook4(@PathVariable("id") long id, Model model) {
		ArticleLibrary article4 = bu.getArticleById(id);
		model.addAttribute("article", article4);
		return "fiction_book4_details";
	}

	@GetMapping("/fiction_book5/{id}")
	public String fictionbook5(@PathVariable("id") long id, Model model) {
		ArticleLibrary article5 = bu.getArticleById(id);
		model.addAttribute("article", article5);
		return "fiction_book5_details";
	}

/////////////////////////////////////////////////////////////////////////////////////

	@GetMapping("/non_fiction_book1/{id}")
	public String non_fiction_book1(@PathVariable("id") long id, Model model) {
		ArticleLibrary article1 = bu.getArticleById(id);
		model.addAttribute("article", article1);
		return "non_fiction_book1_details";
	}

	@GetMapping("/non_fiction_book2/{id}")
	public String non_fiction_book2(@PathVariable("id") long id, Model model) {
		ArticleLibrary article2 = bu.getArticleById(id);
		model.addAttribute("article", article2);
		return "non_fiction_book2_details";
	}

	@GetMapping("/non_fiction_book3/{id}")
	public String non_fiction_book3(@PathVariable("id") long id, Model model) {
		ArticleLibrary article3 = bu.getArticleById(id);
		model.addAttribute("article", article3);
		return "non_fiction_book3_details";
	}

	@GetMapping("/non_fiction_book4/{id}")
	public String non_fiction_book4(@PathVariable("id") long id, Model model) {
		ArticleLibrary article4 = bu.getArticleById(id);
		model.addAttribute("article", article4);
		return "non_fiction_book4_details";
	}

	@GetMapping("/non_fiction_book5/{id}")
	public String non_fiction_book5(@PathVariable("id") long id, Model model) {
		ArticleLibrary article5 = bu.getArticleById(id);
		model.addAttribute("article", article5);
		return "non_fiction_book5_details";
	}

//////////////////////////////////////////////////////////////////////////////////////////

	@GetMapping("/Wildlife_book1/{id}")
	public String wildlife_book1(@PathVariable("id") long id, Model model) {
		ArticleLibrary article1 = bu.getArticleById(id);
		model.addAttribute("article", article1);
		return "wildlife_book1_details";
	}

	@GetMapping("/Wildlife_book2/{id}")
	public String wildlife_book2(@PathVariable("id") long id, Model model) {
		ArticleLibrary article2 = bu.getArticleById(id);
		model.addAttribute("article", article2);
		return "wildlife_book2_details";
	}

	@GetMapping("/Wildlife_book3/{id}")
	public String wildlife_book3(@PathVariable("id") long id, Model model) {
		ArticleLibrary article3 = bu.getArticleById(id);
		model.addAttribute("article", article3);
		return "wildlife_book3_details";
	}

	@GetMapping("/Wildlife_book4/{id}")
	public String wildlife_book4(@PathVariable("id") long id, Model model) {
		ArticleLibrary article4 = bu.getArticleById(id);
		model.addAttribute("article", article4);
		return "wildlife_book4_details";
	}

	@GetMapping("/Wildlife_book5/{id}")
	public String wildlife_book5(@PathVariable("id") long id, Model model) {
		ArticleLibrary article5 = bu.getArticleById(id);
		model.addAttribute("article", article5);
		return "wildlife_book5_details";
	}

//////////////////////////////////////////////////////////////////////////////////////////

	@GetMapping("/Science_Tech_book1/{id}")
	public String Science_Tech_book1(@PathVariable("id") long id, Model model) {
		ArticleLibrary article1 = bu.getArticleById(id);
		model.addAttribute("article", article1);
		return "Science_Tech_book1_details";
	}

	@GetMapping("/Science_Tech_book2/{id}")
	public String Science_Tech_book2(@PathVariable("id") long id, Model model) {
		ArticleLibrary article2 = bu.getArticleById(id);
		model.addAttribute("article", article2);
		return "Science_Tech_book2_details";
	}

	@GetMapping("/Science_Tech_book3/{id}")
	public String Science_Tech_book3(@PathVariable("id") long id, Model model) {
		ArticleLibrary article3 = bu.getArticleById(id);
		model.addAttribute("article", article3);
		return "Science_Tech_book3_details";
	}

	@GetMapping("/Science_Tech_book4/{id}")
	public String Science_Tech_book4(@PathVariable("id") long id, Model model) {
		ArticleLibrary article4 = bu.getArticleById(id);
		model.addAttribute("article", article4);
		return "Science_Tech_book4_details";
	}

	@GetMapping("/Science_Tech_book5/{id}")
	public String Science_Tech_book5(@PathVariable("id") long id, Model model) {
		ArticleLibrary article5 = bu.getArticleById(id);
		model.addAttribute("article", article5);
		return "Science_Tech_book5_details";
	}

////////////////////////////////////////////////////////////////////////////////////////

	@GetMapping("/Political_book1/{id}")
	public String Political_book1(@PathVariable("id") long id, Model model) {
		ArticleLibrary article1 = bu.getArticleById(id);
		model.addAttribute("article", article1);
		return "Political_book1_details";
	}

	@GetMapping("/Political_book2/{id}")
	public String Political_book2(@PathVariable("id") long id, Model model) {
		ArticleLibrary article2 = bu.getArticleById(id);
		model.addAttribute("article", article2);
		return "Political_book2_details";
	}

	@GetMapping("/Political_book3/{id}")
	public String Political_book3(@PathVariable("id") long id, Model model) {
		ArticleLibrary article3 = bu.getArticleById(id);
		model.addAttribute("article", article3);
		return "Political_book3_details";
	}

	@GetMapping("/Political_book4/{id}")
	public String Political_book4(@PathVariable("id") long id, Model model) {
		ArticleLibrary article4 = bu.getArticleById(id);
		model.addAttribute("article", article4);
		return "Political_book4_details";
	}

	@GetMapping("/Political_book5/{id}")
	public String Political_book5(@PathVariable("id") long id, Model model) {
		ArticleLibrary article5 = bu.getArticleById(id);
		model.addAttribute("article", article5);
		return "Political_book5_details";
	}

/////////////////////////////////////////////////////////////////////////////////////

	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("ListArticle", bu.getAllArticle());
		return "index";
	}

	@GetMapping("/showNewArticle")
	public String showNewArticle(Model model) {

		ArticleLibrary article = new ArticleLibrary();
		model.addAttribute("article", article);
		return "new_article";
	}

	@PostMapping("/saveArticle")
	public String saveArticle(@ModelAttribute("article") ArticleLibrary article) {

		bu.saveArticle(article);
		return "redirect:/";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

		ArticleLibrary article = bu.getArticleById(id);

		model.addAttribute("article", article);
		return "update_article";
	}

	@GetMapping("/deleteArticle/{id}")
	public String deleteArticle(@PathVariable(value = "id") long id) {

		this.bu.deleteArticleById(id);
		return "redirect:/";
	}
}
