package com.rws.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jerseyutil.domain.Book;
import com.jerseyutil.domain.ResponseDTO;
import com.rws.service.BookServiceClient;




public class BookServlet extends HttpServlet {
       private BookServiceClient bookserviceclient;
       public void init(){
    	   bookserviceclient=new BookServiceClient();
       }
		
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		Book book=new Book();
		book.setIsbn(Integer.parseInt(req.getParameter("isbn")));
		book.setTitle(req.getParameter("title"));
		book.setAuthor(req.getParameter("author"));
		book.setPrice(Double.parseDouble(req.getParameter("price")));
		ResponseDTO rdto1=bookserviceclient.savebookdetails(book);
		req.setAttribute("responseDTO", rdto1);
		String target="/WEB-INF/pages/register.jsp";
		RequestDispatcher rd=req.getRequestDispatcher(target);
		rd.forward(req, res);
	}

}
