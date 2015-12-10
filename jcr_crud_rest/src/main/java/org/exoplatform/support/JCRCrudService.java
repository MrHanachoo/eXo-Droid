package org.exoplatform.support;

import org.exoplatform.container.ExoContainerContext;

import org.exoplatform.services.jcr.RepositoryService;
import org.exoplatform.services.jcr.config.RepositoryConfigurationException;
import org.exoplatform.services.jcr.core.ManageableRepository;

import org.picocontainer.Startable;

import javax.jcr.Node;
import javax.jcr.PropertyIterator;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;


/**
 * Created by exo on 9/28/15.
 */
public class JCRCrudService {
    private static final Log LOG = ExoLogger.getLogger(JCRCrudService.class);


    /**
     *  JCR session handler
     */
    private Session getSession() throws RepositoryConfigurationException, RepositoryException {
        RepositoryService repoService =
                (RepositoryService) ExoContainerContext.getCurrentContainer().getComponentInstanceOfType(RepositoryService.class);
        ManageableRepository repo = repoService.getRepository("repository");
        Session session = repo.getSystemSession("collaboration");
        return session;
    }

    /**
     * creates a JCR node under / with name nodeName
     *
     * @param nodeName
     */
    public Node addJCRNode(String nodeName) {
        try {
            Session session = getSession();
            Node root = session.getRootNode();
            // Store content
            Node childNode = root.addNode(nodeName);
            session.save();
            //session.logout();
            return childNode;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * updates the node with a new property having the name equal to propertyName and value equal propertyValue
     *  @param propertyName
     * @param propertyValue
     */
    public Node updateJCRNode(String propertyName, String propertyValue, String nodeName) {
        try {
            Session session = getSession();
            //Create a node that represents the root node
            Node root = session.getRootNode();
            //update node
            Node nodeToUpdate = root.getNode(nodeName);
            nodeToUpdate.setProperty(propertyName, propertyValue);
            nodeToUpdate.save();
            session.save();
            return nodeToUpdate;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    /**
     * will remove this JCR node with name equal to nodeName
     *
     * @param nodeName
     */
    public Node removeJCRNode(String nodeName) {
        try {
            Session session = getSession();
            //Create a node that represents the root node
            Node root = session.getRootNode();
            //delete node
            Node nodeToDelete = root.getNode(nodeName);
            nodeToDelete.remove();
            session.save();
            //session.logout();
            return nodeToDelete;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}