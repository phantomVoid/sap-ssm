package com.phantom.restful;

import com.phantom.model.TPmProjectBase;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author Mr.Void
 */
@Component
@Produces(MediaType.APPLICATION_JSON)
//@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
@Path("/restFul")
public class RestFulService {
    /**
     * 测试GET方法
     * @param id
     * @return
     */
    @GET
    @Path("/get")
    public TPmProjectBase get(@QueryParam("id") String id){
        return null;
    }

    /**
     * 测试POST方法
     * @param id
     * @return
     */
    @POST
    @Path("/post/{id}")
    public TPmProjectBase post(@PathParam("id") String id){
        return null;
    }

    /**
     * 测试PUT方法
     * @param id
     * @param base
     * @return
     */
    @PUT
    @Path("/put/{id}")
    public TPmProjectBase put(@PathParam("id")String id,TPmProjectBase base){
        return null;
    }

    /**
     * 测试DELETE方法
     * @param id
     * @return
     */
    @DELETE
    @Path("/delete/{id}")
    public TPmProjectBase delete(@PathParam("id") String id){
        return null;
    }
}


