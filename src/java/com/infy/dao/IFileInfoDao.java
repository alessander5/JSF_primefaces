package com.infy.dao;

import com.infy.domain.FileInfo;

import java.util.List;

/**
 * Created by Infy on 23.05.2016.
 */
public interface IFileInfoDao {
        void save(FileInfo fi);
        void remove(FileInfo fi);
        FileInfo findById(int id);
        void removeById(int id);
        List<?> getList();

}
