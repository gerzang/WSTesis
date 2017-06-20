/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import dao.EdxTrackEventDao;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.EdxTrackEvent;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * REST Web Service
 *
 * @author gerzang
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of ws.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @GET
    @Path("/buscarporid")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@QueryParam("id") String id, @QueryParam("callback") String callback) {
        EdxTrackEventDao obj = new EdxTrackEventDao();
        EdxTrackEvent e = null;
        try{
         e = obj.buscar("id", id);
        }catch( Exception ex){
            System.out.println(ex.getMessage());
        }
//        JSONObject result = new JSONObject();
//        result.put("id", e.getId());
//        result.put("nombre", e.getCourseDisplayName());
          
        JSONArray array = new JSONArray();
        array.add(e.getId());
        array.add(e.getCourseDisplayName());
        array.add(e.getCourseDisplayName());
        
        Gson g = new Gson();
        String formatoJSON = g.toJson(array);
            if (callback != null) {
                return Response.ok(callback + "(" + formatoJSON + ")", "application/json;charset=UTF-8").status(Response.Status.OK).build();
            }
            return Response.ok(formatoJSON, "application/json;charset=UTF-8").status(Response.Status.OK).build();
    }
}
