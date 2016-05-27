package com.infy.service;

import com.infy.dao.ITopTableDao;
import com.infy.domain.TopTable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * Created by Infy on 23.05.2016.
 */
public class TopTableServiceImpl implements ITopTableService {

    @Autowired
    ITopTableDao mobyDao;
    {
        System.out.print("test");
    }

    public void save(TopTable topTable) {
        mobyDao.add(topTable);
    }

    public void remove(TopTable topTable) {
        mobyDao.remove(topTable);
    }

    public Collection<TopTable> getList() {
        return mobyDao.getList();
    }


}
