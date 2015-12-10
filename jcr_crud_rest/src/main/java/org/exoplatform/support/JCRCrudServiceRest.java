package org.exoplatform.support;

import org.exoplatform.container.ExoContainerContext;

import javax.jcr.Node;
import javax.jcr.PropertyIterator;
import javax.jcr.RepositoryException;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import org.exoplatform.support.JCRCrudService;
import org.exoplatform.services.rest.resource.ResourceContainer;


/**
 * Created by exo on 9/28/15.
 */
@Path("/jcr_crud")
public class JCRCrudServiceRest implements ResourceContainer{

    private JCRCrudService service =
            (JCRCrudService) ExoContainerContext.getCurrentContainer().getComponentInstanceOfType(JCRCrudService.class);

    @GET
    @Path("/add_node/{nodeName}")
    public String addNode(@PathParam("nodeName") String nodeName
    ) throws RepositoryException {
        return service.addJCRNode(nodeName).toString();
    }

    @GET
    @Path("/update_node/{nodeName}/{propertyName}/{propertyValue}")
    public String updateNode(@PathParam("nodeName") String nodeName,
                             @PathParam("propertyName") String propertyName,
                             @PathParam("propertyValue") String propertyValue
    ) throws RepositoryException {
        Node updatedNode = service.updateJCRNode(propertyName, propertyValue, nodeName);
        return updatedNode.getProperties().toString();
    }

    @GET
    @Path("/delete_node/{nodeName}")
    public String deleteNode(@PathParam("nodeName") String nodeName
    ) throws RepositoryException {
        return service.removeJCRNode(nodeName).toString();
    }
}

