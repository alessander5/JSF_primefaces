package com.infy.service;

import com.infy.domain.TopTable;

import java.util.Collection;

/**
 * Created by Infy on 23.05.2016.
 */
public interface ITopTableService {
    void save(TopTable topTable);
    void remove(TopTable topTable);
    Collection<?> getList();
}
