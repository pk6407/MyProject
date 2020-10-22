package controller;

import java.util.ArrayList;
import java.util.Collections;

import vo.Book;

public class BookController {
	
	private ArrayList bookList = new ArrayList();
	
	public BookController() {
		bookList.add(new Book("�ڹ��� ����","���ü�","��Ÿ",27000));
		bookList.add(new Book("���� ���� �˰���","������","��Ÿ",15000));
		bookList.add(new Book("��ȭ�� ���","������","�ι�",17500));
		bookList.add(new Book("�� ������","��ſ�","�Ƿ�",21000));
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
