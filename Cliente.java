package com.apimysql.apimysql.domains;

public class Cliente {

    private String name;

    private String lastname;

    private String password;

    public Cliente() {
    }

    public Cliente(String name, String lastname, String password) {
        this.name = name;
        this.lastname = lastname;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

