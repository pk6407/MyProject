package controller;

import java.util.ArrayList;
import java.util.Collections;

import vo.Book;

public class BookController {
	
	private ArrayList bookList = new ArrayList();
	
	public BookController() {
		bookList.add(new Book("자바의 정석","남궁성","기타",27000));
		bookList.add(new Book("쉽게 배우는 알고리즘","문병로","기타",15000));
		bookList.add(new Book("대화의 기술","강보람","인문",17500));
		bookList.add(new Book("암 정복기","빅신우","의료",21000));
	}
	
	public void insertBook(Book book) {
		bookList.add(book);
	}
	
	public ArrayList selectList() {
		return bookList;
	}
	
	public ArrayList searchBook(String keyword) {
		ArrayList searchList = new ArrayList();
		for(int i =0; i<bookList.size();i++) {
			if(((Book)bookList.get(i)).getTitle().contains(keyword)) {
				searchList.add(bookList.get(i));
			}
		}
		
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		
		for(int i= 0; i<bookList.size();i++) {
			if(((Book)bookList.get(i)).getTitle().equals(title)&&
					((Book)bookList.get(i)).getAuthor().equals(author)) {
				removeBook = (Book)bookList.remove(i);
			}
		}
		
		return removeBook;
	}

	public int ascBook() {
		Collections.sort(bookList);
		return 1;
	}
}
