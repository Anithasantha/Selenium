package book;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book")
public class Book {
	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("{name}")
	public String sayHelloXML(@PathParam("name") String name ) {
	
		String response="<?xml version='1.0'?>"+"<hello>Hello"+name+"</hello>";
		return response;
	}
	@POST
	@Produces(MediaType.TEXT_XML)
	@Consumes(MediaType.TEXT_XML)
	public String mess() {
		
		return "Post works well";
		
	}
	/*
	 * @PathParam("name") String name
		@GET
		@Produces(MediaType.TEXT_HTML)
		@Path("{name}")
		public String sayHelloHTML() {
			String response="<h1>Hello HTML</h1>";
			return response;
		}
	
	
*/
}
