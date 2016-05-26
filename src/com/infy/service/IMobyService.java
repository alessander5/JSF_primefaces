package com.infy.service;

import com.infy.domein.Mobility;

import java.util.Collection;

/**
 * Created by Infy on 23.05.2016.
 */
public interface IMobyService {
    void save(Mobility mobility);
    void remove(Mobility mobility);
    Collection<Mobility> getList();
}
