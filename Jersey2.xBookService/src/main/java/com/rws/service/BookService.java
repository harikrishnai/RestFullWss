package com.rws.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jerseyutil.domain.Book;
import com.jerseyutil.domain.ResponseDTO;
import com.jerseyutil.util.JsonUtil;
import com.jerseyutil.util.StatusUtil;
import com.rws.factory.DAOFactory;

@Path("/books")
public class  BookService {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/registerbook")
	public String registerbook(String jsonbook){
		System.out.println("entered");
		ResponseDTO responsedto=new ResponseDTO();
		responsedto.setMessage(StatusUtil.STATUS_FAILURE);
		responsedto.setMessage("registration is failure!please try again");
//		convert json into java(book)
			Book book=JsonUtil.convertjsontojava(jsonbook,Book.class);
//			call DAO methods
			 int count=DAOFactory.getbookdao().registerbook(book);
//			 based on DAO method result prepare response
			 if (count>0) {
				 responsedto.setStatus(StatusUtil.STATUS_SUCCESS);
				 responsedto.setData(book.getIsbn().toString());
				 responsedto.setMessage("book details saved successfully!");
				 System.out.println("success");
			}else{
				System.out.println("failure");
				responsedto.setMessage("book details could not be found!please try again!");
			}
			
//			convert response into json
		String jsonresponse=JsonUtil.convertjavatojson(responsedto);
		return jsonresponse;
}
}
