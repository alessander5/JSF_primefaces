package com.infy.service;

import com.infy.domain.FileInfo;

import java.util.List;

/**
 * Created by Infy on 23.05.2016.
 */
public interface IFileInfoService {
    void save(FileInfo fi);
    void remove(FileInfo fi);
    void removeById(int id);
    List<?> getList();
    FileInfo findById(int id);
}
