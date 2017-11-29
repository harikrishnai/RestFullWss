package com.rws.factory;

import com.rws.dao.BookDAO;
import com.rws.dao.BookDAOImpl;

public class DAOFactory {
 private static BookDAO bookdao;
 static {
	 bookdao=new BookDAOImpl();
 }
 public static BookDAO getbookdao(){
	return bookdao;
 }
}
