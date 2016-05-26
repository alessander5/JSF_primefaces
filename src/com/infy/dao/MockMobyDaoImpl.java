package com.infy.dao;

import com.infy.domein.FileInfo;
import com.infy.domein.Mobility;
import com.infy.util.MyDate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Infy on 26.05.2016.
 */
public class MockMobyDaoImpl implements IMobyDao {

    List<Mobility> mockModel = new ArrayList<Mobility>();

    {
        mockModel.add(new Mobility("CANBM", "Bell Mobility"));
        mockModel.add(new Mobility("CANDM", "Bell Mobility"));
        mockModel.add(new Mobility("CANBM1", "Bell Mobility"));
        mockModel.add(new Mobility("CANDM1", "Bell Mobility"));
        mockModel.add(new Mobility("CANBM2", "Bell Mobility"));
        mockModel.add(new Mobility("CANDM2", "Bell Mobility"));

    }

    @Override
    public void remove(Mobility mobility) {
        mockModel.remove(mobility);
    }

    @Override
    public Collection<Mobility> getList() {
        return mockModel;
    }

    @Override
    public void add(Mobility mobility) {
        mockModel.add(mobility);
    }
}
