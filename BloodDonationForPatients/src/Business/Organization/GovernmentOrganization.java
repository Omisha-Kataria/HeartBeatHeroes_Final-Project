/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GovernmentAgentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author krish19
 */
public class GovernmentOrganization extends Organization{

    // Constructor to initialize the GovernmentOrganization with a name and parent organization directory
    public GovernmentOrganization(String name, OrganizationDirectory parent) {
        super(name == null ? Organization.Type.Government.getValue() : name, parent);
    }

    @Override
    // Method to return a list of roles supported by the GovernmentOrganization
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentAgentRole()); // Adding a GovernmentAgentRole to the list
        return roles;
    }
    
}
