package com.infy.service;

import com.infy.dao.IMobyDao;
import com.infy.dao.MockMobyDaoImpl;
import com.infy.domein.Mobility;

import java.util.Collection;

/**
 * Created by Infy on 23.05.2016.
 */
public class MobyServiceImpl implements IMobyService {

    IMobyDao mobyDao = new MockMobyDaoImpl();

    public void save(Mobility mobility) {
        mobyDao.add(mobility);
    }

    public void remove(Mobility mobility) {
        mobyDao.remove(mobility);
    }

    @Override
    public Collection<Mobility> getList() {
        return mobyDao.getList();
    }


}
