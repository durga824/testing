package com.pojo;

import java.util.List;

public class GetClients {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getChargebee_status() {
        return chargebee_status;
    }

    public void setChargebee_status(String chargebee_status) {
        this.chargebee_status = chargebee_status;
    }

    public int getChargebee_plans_count() {
        return chargebee_plans_count;
    }

    public void setChargebee_plans_count(int chargebee_plans_count) {
        this.chargebee_plans_count = chargebee_plans_count;
    }

//    public List<Clients> getClients() {
//        return clients;
//    }
//
//    public void setClients(List<Clients> clients) {
//        this.clients = clients;
//    }

    public boolean isAdd_client_permission() {
        return add_client_permission;
    }

    public void setAdd_client_permission(boolean add_client_permission) {
        this.add_client_permission = add_client_permission;
    }

    private String chargebee_status;
    private int chargebee_plans_count;
//    private List<Clients> clients;
    private boolean add_client_permission;

}
