package com.rws.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jerseyutil.domain.Book;
import com.rws.factory.ConnectionFactory;


public class BookDAOImpl implements BookDAO{
private static final String SQL_REGISTER_BOOK="insert into Book_Details values(?,?,?,?)";	

	public int registerbook(Book book) {
		int count=0;
		try{
		Connection con=ConnectionFactory.getconnection();
		PreparedStatement pst=con.prepareStatement(SQL_REGISTER_BOOK);
		pst.setInt(1,book.getIsbn());
		pst.setString(2,book.getTitle());
		pst.setString(3,book.getAuthor());
		pst.setDouble(4,book.getPrice());
		count=pst.executeUpdate();
		}catch(SQLException se){
			System.out.println("exception occured while getting the connection"+se.getMessage());
		}
		return count;
	}

}
