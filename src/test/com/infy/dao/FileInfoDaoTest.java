package com.infy.dao;

import com.infy.domain.FileInfo;
import com.infy.util.MyDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Infy on 12.03.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:WEB-INF/applicationConfig.xml"})
public class FileInfoDaoTest {

    @Autowired
    private IFileInfoDao fileInfoDao;

    /*
    * Dao tests
    * */
    @Test
    public void addFileInfo() {
        int new_id = 1;

        FileInfo newFileInfo = new FileInfo(new_id, "test1","","",new MyDate(),1);
        fileInfoDao.save(newFileInfo);
        FileInfo findedFile = fileInfoDao.findById(new_id);

        assertNotNull(findedFile);
        assertEquals(findedFile, newFileInfo);
    }


    @Test
    public void deleteFileInfo() {
        FileInfo removed = fileInfoDao.findById(1);
        assertNotNull(removed);

        fileInfoDao.remove(removed);
        assertFalse(fileInfoDao.getList().contains(removed));
    }

    @Test
    public void editFileInfo() {
        FileInfo testOne = fileInfoDao.findById(1);
        assertNotNull(testOne);

        String testFileName = "test";
        assertNotEquals(testOne, testOne.getFile_name());

        testOne.setFile_name(testFileName);
        fileInfoDao.save(testOne);
        assertEquals(testFileName, fileInfoDao.findById(1).getFile_name());

    }
}