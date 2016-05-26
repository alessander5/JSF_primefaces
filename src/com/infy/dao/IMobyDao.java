package com.infy.dao;

import com.infy.domein.Mobility;

import java.util.Collection;

/**
 * Created by Infy on 23.05.2016.
 */
public interface IMobyDao {
    void add(Mobility mobility);
    void remove(Mobility mobility);
    Collection<Mobility> getList();
}
