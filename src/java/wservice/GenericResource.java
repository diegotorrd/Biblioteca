/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wservice;

import bean.Libro;
import bean.Usuario;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dao.BibliotecaDAO;
import dao.LoginDAO;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.jboss.weld.context.bound.Bound;

/**
 * REST Web Service
 *
 * @author Jose Luis
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

    
    
    @GET
    @Produces("application/json")
    @Path("login")    
    public Usuario login(@QueryParam("usuario") String usuario,@QueryParam("password") String password) {
        LoginDAO dao=new LoginDAO();
        return dao.login(usuario, password);
    }
    
    @GET
    @Produces("application/json")
    @Consumes("application/json")
    @Path("ingresarLibro")    
    public String ingresarLibro(@QueryParam("libro") Libro libro) {
        BibliotecaDAO dao=new BibliotecaDAO();
        return dao.ingresarLibro(libro);
    }
    

    
}
