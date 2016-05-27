package com.infy.domain;

/**
 * Created by Infy on 23.05.2016.
 */

public class TopTable {

    private int id;

    private String name;

    private String description;

    public TopTable() {
    }

    public TopTable(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
