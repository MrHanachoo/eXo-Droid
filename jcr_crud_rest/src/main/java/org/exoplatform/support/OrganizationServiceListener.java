package org.exoplatform.support;

import org.exoplatform.services.organization.User;
import org.exoplatform.services.organization.UserEventListener;

/**
 * Created by exo on 9/29/15.
 */
public class OrganizationServiceListener extends UserEventListener {

    @Override
    public void preSave(User user, boolean isNew) throws Exception {
        System.out.println("|||||||||||||||preSave " + user.toString());
    }

    @Override
    public void postSave(User user, boolean isNew) throws Exception {
        System.out.println("|||||||||||||postSave " + user.toString());
    }


    @Override
    public void preDelete(User user) throws Exception {
        System.out.println("|||||||||||||preDelete " + user.toString());
    }

    @Override
    public void postDelete(User user) throws Exception {
        System.out.println("|||||||||||||postDelete " + user.toString());
    }

}


