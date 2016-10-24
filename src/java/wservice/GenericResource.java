/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wservice;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dao.CalculadorDAO;
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


@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;
    

    public GenericResource() {
    }

    @GET
    @Path("suma")    
    public double suma(@QueryParam("num1") double num1,@QueryParam("num2") double num2) {
        CalculadorDAO dao=new CalculadorDAO();
        return dao.suma(num1, num2);
    }
    
    @GET
    @Path("diferencia")    
    public double diferencia(@QueryParam("num1") double num1,@QueryParam("num2") double num2) {
        CalculadorDAO dao=new CalculadorDAO();
        return dao.diferencia(num1, num2);
    }
    
    @GET
    @Path("multiplicacion")    
    public double multiplicacion(@QueryParam("num1") double num1,@QueryParam("num2") double num2) {
        CalculadorDAO dao=new CalculadorDAO();
        return dao.multiplicacion(num1, num2);
    }
    
    @GET
    @Path("division")    
    public double division(@QueryParam("num1") double num1,@QueryParam("num2") double num2) {
        CalculadorDAO dao=new CalculadorDAO();
        return dao.division(num1, num2);
    }
    

    
}
