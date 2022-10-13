package com.example.springsecuritymaster.security.util;

public class RolesHierarchyBulider {

    private StringBuilder stringBuilder=new StringBuilder();

    public RolesHierarchyBulider append(String uplineRole,String downlineRole){
        stringBuilder.append(
                String.format("ROLE_%S > ROLE_%S \n",
                        uplineRole,downlineRole)
        );
        return this;
    }




    public String build(){
        return stringBuilder.toString();
    }
}
