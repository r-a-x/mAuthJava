package com.example.demo.bean;

import com.example.demo.enums.Role;

/**
 * Created by rahulb on 10/8/17.
 */
public class AuthenticatedEntityContext {

    private Role role;
    private String accessToken;
    private String ipAddress;
    private String userName;
    private String email;

    public AuthenticatedEntityContext(Role role, String accessToken, String ipAddress, String userName, String email) {
        this.role = role;
        this.accessToken = accessToken;
        this.ipAddress = ipAddress;
        this.userName = userName;
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
