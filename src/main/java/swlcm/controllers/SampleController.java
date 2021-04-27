package swlcm.controllers;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/api/sample")
public class SampleController {

    private static int counter = 0;

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String SampleMethod(){
        counter++;
        System.out.println("Call to GET");
        return "sample: " + counter;
    }

    @POST
    @Path("/{delta}")
    @Produces(MediaType.TEXT_PLAIN)
    public String SampleMethodWithDelta(@PathParam("delta") int delta){
        // curl -X POST http://localhost:8080/api/sample/5 -v
        counter = counter + delta;
        System.out.println("Call to POST");
        return "sample: " + counter;
    }
}
