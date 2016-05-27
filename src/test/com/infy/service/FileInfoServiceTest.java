package com.infy.service;

import com.infy.dao.IFileInfoDao;
import com.infy.domain.FileInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Infy on 27.05.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:WEB-INF/applicationConfig.xml"})
public class FileInfoServiceTest {

    @Autowired
    private IFileInfoDao fileInfoDao;

    @Autowired
    private IFileInfoService fileInfoService;

    @Test
    public void appropriateData(){
        FileInfo daoFI = fileInfoDao.findById(1);
        Object serviceFI = fileInfoService.findById(1);
        assertEquals(daoFI,serviceFI);
    }
}
