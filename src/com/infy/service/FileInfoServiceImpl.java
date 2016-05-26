package com.infy.service;

import com.infy.dao.IFileInfoDao;
import com.infy.dao.MockFileInfoDaoImpl;
import com.infy.domein.FileInfo;

import java.util.List;

/**
 * Created by Infy on 23.05.2016.
 */
public class FileInfoServiceImpl implements IFileInfoService{

    private IFileInfoDao fileDao = new MockFileInfoDaoImpl();


    public void save(FileInfo fi) {
        fileDao.save(fi);
    }


    public void remove(FileInfo fi) {
        fileDao.remove(fi);
    }


    public void removeById(int id) {
        fileDao.removeById(id);
    }


    public List<FileInfo> getList() {
        return fileDao.getList();
    }
}
