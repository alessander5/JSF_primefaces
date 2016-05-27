package com.infy.service;

import com.infy.dao.IFileInfoDao;
import com.infy.domain.FileInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Infy on 23.05.2016.
 */
public class FileInfoServiceImpl implements IFileInfoService{

    @Autowired
    private IFileInfoDao fileDao;


    public void save(FileInfo fi) {
        fileDao.save(fi);
    }


    public void remove(FileInfo fi) {
        fileDao.remove(fi);
    }


    public void removeById(int id) {
        fileDao.removeById(id);
    }


    public List<?> getList() {
        return fileDao.getList();
    }

    public FileInfo findById(int id) {
        return fileDao.findById(id);
    }
}
