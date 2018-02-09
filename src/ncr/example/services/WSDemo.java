



package ncr.example.services;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;


@Path("/WSDemoo")
public class WSDemo {
                                public WSDemo(){
                                                
                                                
                                }
                                @GET
                                @Path("/Hello")
                                @Produces(MediaType.TEXT_HTML)
                                
                                public String Hello(){
                                                                return "Hello";
                                }
                                
                                
                                @GET
                                @Produces(MediaType.APPLICATION_JSON)
                                @Path("/HelloJson")
                                public Response hellojson(){
                                                
                                                JSONObject jsonres=new JSONObject();
                                                jsonres.put("name","divyam");
                                                
                                
                                                                Response response=Response.status(200).type("application/json").entity(jsonres.toString()).build();
                                                                return response;
                                }
                                
                                @POST
                                @Produces(MediaType.APPLICATION_JSON)
                                @Path("/Hell")
                                public Response hellj(){
                                                
                                                JSONObject jsonres=new JSONObject();
                                                jsonres.put("name","divyam");
                                                
                                
                                                                Response response=Response.status(200).type("application/json").entity(jsonres.toString()).build();
                                                                return response;
                                }
}

