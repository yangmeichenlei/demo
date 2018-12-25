package com.media.common.utils;

import java.util.List;

import com.media.common.view.agency.AgencyView;
import com.media.form.agency.AgencyForm;

public class TreeAgencyUtils {

    public List<AgencyView> buildTreeAgency(AgencyView agency,List<AgencyView> AgencyMenu){
        
        for(AgencyView subAgency:AgencyMenu){
            if(agency.getAgencyId().equals(subAgency.getParentId())){
                agency.getSubAgency().add(subAgency);
                buildTreeAgency(subAgency,AgencyMenu);
            }
        }
        return null;
    }
    public String buildAgencyHtml(List<AgencyView> treeAgency,List<AgencyForm> agencyUser){
        String tree = "";
        if(!treeAgency.isEmpty()){
                tree += buildHtml(treeAgency,agencyUser);
        }
        return tree;
    }
    public String buildHtml(List<AgencyView> treeAgency,List<AgencyForm> agencyUser){
        String tree = "";
         for(AgencyView agency :treeAgency){ 
             
                tree += "<ul class='ztree'><li>";
                 tree += agency.getAgencyName();
                for(AgencyForm user:agencyUser){
                    if(agency.getAgencyId().equals(user.getAgencyId())){
                        tree +="<li>";
                        tree += agency.getAgencyName();
                        tree += "::" +user.getUserName();
                        tree +="</li>";
                     }
                }
                if(!agency.getSubAgency().isEmpty()){
                    tree += buildHtml(agency.getSubAgency(),agencyUser);
                }
                tree += "</li></ul>";
            }
        return tree;
    }
}
