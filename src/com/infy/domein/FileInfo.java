package com.infy.domein;

import com.infy.util.MyDate;

/**
 * Created by Infy on 23.05.2016.
 */

public class FileInfo {

    private int id;

    private String type;

    private String tadig;

    private String file_name;

    private MyDate created_on;

    private int updated_by;

    public FileInfo() {
    }

    public FileInfo(String type, String tadig, String file_name, MyDate created_on, int user) {
        this.type = type;
        this.tadig = tadig;
        this.file_name = file_name;
        this.created_on = created_on;
        this.updated_by = user;
    }

    public FileInfo(int id, String type, String tadig, String file_name, MyDate created_on, int user) {
        this.id = id;
        this.type = type;
        this.tadig = tadig;
        this.file_name = file_name;
        this.created_on = created_on;
        this.updated_by = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTadig() {
        return tadig;
    }

    public void setTadig(String tadig) {
        this.tadig = tadig;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public MyDate getCreated_on() {
        return created_on;
    }

    public void setCreated_on(MyDate created_on) {
        this.created_on = created_on;
    }

    public int getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(int updated_by) {
        this.updated_by = updated_by;
    }
}
