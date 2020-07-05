package com.example.demo.service.impl;

import com.example.demo.dao.CommodityDAO;
import com.example.demo.entity.Commodity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//测试库存管理服务
public class StockControlServiceTest {

    @Autowired
    private StockControlServiceimpl Scsi;
    private CommodityDAO Cdao;

    @Test
    public void getCommodityByIdTest(){
        assertNotNull(Scsi.getCommodityById(8848));
        assertEquals(null,Scsi.getCommodityById(0000));
    }

    @Test
    public void commodityPurchaseTest1(){
        //assertEquals(1,Scsi.commodityInsert());
    }

}
