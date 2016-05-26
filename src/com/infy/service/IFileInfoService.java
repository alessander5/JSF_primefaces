package com.infy.service;

import com.infy.domein.FileInfo;

import java.util.List;

/**
 * Created by Infy on 23.05.2016.
 */
public interface IFileInfoService {
    void save(FileInfo fi);
    void remove(FileInfo fi);
    void removeById(int id);
    List<FileInfo> getList();
}
