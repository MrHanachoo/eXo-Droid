package org.exoplatform.support.organization_service_user_listener;

/**
 * Created by exo on 10/13/15.
 */



import org.exoplatform.services.organization.User;
import org.exoplatform.services.organization.UserEventListener;


public class MyUserListener extends UserEventListener {


    public void preSave(User user, boolean isNew) throws Exception {

        System.out.println("Before " + (isNew?"creating":"updating") + " user " + user.getUserName());

    }


    public void postSave(User user, boolean isNew) throws Exception {

        System.out.println("After user " + user.getUserName() + (isNew?" created":" updated"));

    }


    public void preDelete(User user) throws Exception {

        System.out.println("Before deleting user " + user.getUserName());

    }


    public void postDelete(User user) throws Exception {

        System.out.println("After deleting user " + user.getUserName());

    }

}