package com.infy.beans;

import com.infy.service.ITopTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by Infy on 26.05.2016.
 */

@ManagedBean(name = "topTableBean")
@SessionScoped
@Component
public class TopTableBean implements Serializable{

    @Autowired
    private ITopTableService topTableService;

    public Collection<?> getItems() {
        return topTableService.getList();
    }

}
