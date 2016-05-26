package com.infy.dao;

import com.infy.domein.FileInfo;
import com.infy.util.MyDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Infy on 26.05.2016.
 */
public class MockFileInfoDaoImpl implements IFileInfoDao{

    List<FileInfo> mockModel = new ArrayList<FileInfo>();

    {
        mockModel.add(new FileInfo(1,"IR.21", "", "IR21.xml", new MyDate(), 1));
        mockModel.add(new FileInfo(2,"IR.22", "", "IR22.xml", new MyDate(), 1));
        mockModel.add(new FileInfo(3,"IR.23", "", "IR23.xml", new MyDate(), 1));
        mockModel.add(new FileInfo(4,"IR.24", "", "IR24.xml", new MyDate(), 1));
        mockModel.add(new FileInfo(5,"IR.25", "", "IR25.xml", new MyDate(), 1));

    }

    @Override
    public void save(FileInfo fi) {
        mockModel.add(fi);
    }

    @Override
    public void remove(FileInfo fi) {
        mockModel.remove(fi);
    }

    @Override
    public void removeById(int id) {
        mockModel.remove(id);
    }

    @Override
    public List<FileInfo> getList() {
        return mockModel;
    }
}
