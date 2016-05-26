package com.infy.beans;

import com.infy.domein.FileInfo;
import com.infy.service.FileInfoServiceImpl;
import com.infy.service.IFileInfoService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by Infy on 23.05.2016.
 */
@ManagedBean(name = "filesBean")
@SessionScoped
public class FilesBean implements Serializable{

    private IFileInfoService fileService = new FileInfoServiceImpl();

    Collection<FileInfo> filesInfo;

    {
        filesInfo = fileService.getList();
    }

    public Collection<FileInfo> getFilesInfo() {
        return filesInfo;
    }

    public void setFilesInfo(Collection<FileInfo> filesInfo) {
        this.filesInfo = filesInfo;
    }
}
