package com.infy.beans;

import com.infy.service.IFileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by Infy on 23.05.2016.
 */
@ManagedBean(name = "filesBean")
@SessionScoped
@Component
public class FilesBean implements Serializable{
    @Autowired
    private IFileInfoService fileService;

    public Collection<?> getFilesInfo() {
        return fileService.getList();
    }

}
