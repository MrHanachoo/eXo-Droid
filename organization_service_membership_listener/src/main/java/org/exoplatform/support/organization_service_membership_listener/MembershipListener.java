package org.exoplatform.support.organization_service_membership_listener;

/**
 * Created by exo on 10/21/15.
 */


import org.exoplatform.services.organization.Membership;
import org.exoplatform.services.organization.MembershipEventListener;

public class MembershipListener extends MembershipEventListener {


    public void preSave(Membership membership, boolean isNew) throws Exception {

        System.out.println("Before " + (isNew ? "creating" : "updating") + " membership");
        output(membership);
    }


    public void postSave(Membership membership, boolean isNew) throws Exception {

        System.out.println("After membership " + (isNew ? " created" : " updated"));
        output(membership);
    }


    public void preDelete(Membership membership) throws Exception {

        System.out.println("Before deleting membership " + membership.getGroupId());
        output(membership);
    }


    public void postDelete(Membership membership) throws Exception {

        System.out.println("After deleting membership");
        output(membership);
    }

    public void output(Membership m) {
        System.out.println("getMembershipType : " + m.getMembershipType());
        System.out.println("getId : " + m.getId());
        System.out.println("getGroupId : " + m.getGroupId());
        System.out.println("getUserName : " + m.getUserName());
        System.out.println("\n");
    }

}
