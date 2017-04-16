package com.onlinebanking;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/home")
public class Home {

	 @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String sayPlainTextHome() {
	    return "Welcome to AIB BANK Home Page";
	  }

	  // This method is called if XML is request
	  @GET
	  @Produces(MediaType.TEXT_XML)
	  public String sayXMLHome() {
	    return "<?xml version=\"1.0\"?>" + "<hello> Welcome to AIB BANK Home Page" + "</hello>";
	  }

	  // This method is called if HTML is request
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public String getHTMLOnlineInfo() {
	    return "<html> " + "<title>" + "AIB Bank" + "</title>"
	        + "<body><h1>" + "Welcome to AIB BANK Home Page" + "</body></h1>" + "</html> ";
	  }
	  
	  @PUT
	  @Path("{CustomerId}")
	  @Produces(MediaType.TEXT_PLAIN)
	  public String updateCustomerInfo(@PathParam("CustomerId") String CustomerId)
	  {
		  //Code to update customer record using customerid
		  return "Done Successfully";
	  }


}
