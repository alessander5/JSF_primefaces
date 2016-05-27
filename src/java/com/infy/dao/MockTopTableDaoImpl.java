package com.infy.dao;

import com.infy.domain.TopTable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Infy on 26.05.2016.
 */
public class MockTopTableDaoImpl implements ITopTableDao {

    List<TopTable> mockModel = new ArrayList<TopTable>();

    {
        mockModel.add(new TopTable("CANBM", "Bell Mobility"));
        mockModel.add(new TopTable("CANDM", "Bell Mobility"));
        mockModel.add(new TopTable("CANBM1", "Bell Mobility"));
        mockModel.add(new TopTable("CANDM1", "Bell Mobility"));
        mockModel.add(new TopTable("CANBM2", "Bell Mobility"));
        mockModel.add(new TopTable("CANDM2", "Bell Mobility"));

    }

    @Override
    public void remove(TopTable topTable) {
        mockModel.remove(topTable);
    }

    @Override
    public List<?> getList() {
        return mockModel;
    }

    @Override
    public void add(TopTable topTable) {
        mockModel.add(topTable);
    }
}
