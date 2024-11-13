package com.home.enums;

public enum Roles {
    ADMIN(1L),
    BASIC(2L);

    Long roleId;

    Roles(Long roleId){
        this.roleId = roleId;
    }

    public Long getRoleId() {
        return roleId;
    }
}
