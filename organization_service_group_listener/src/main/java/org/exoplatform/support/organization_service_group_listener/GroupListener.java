package org.exoplatform.support.organization_service_group_listener;

/**
 * Created by exo on 10/21/15.
 */


import org.exoplatform.services.organization.Group;
import org.exoplatform.services.organization.GroupEventListener;

public class GroupListener extends GroupEventListener {


    public void preSave(Group group, boolean isNew) throws Exception {

        System.out.println("Before " + (isNew?"creating":"updating") + " group " + group.getGroupName());

    }


    public void postSave(Group group, boolean isNew) throws Exception {

        System.out.println("After group " + group.getGroupName() + (isNew?" created":" updated"));

    }


    public void preDelete(Group group) throws Exception {

        System.out.println("Before deleting group " + group.getGroupName());

    }


    public void postDelete(Group group) throws Exception {

        System.out.println("After deleting group " + group.getGroupName());

    }

}
