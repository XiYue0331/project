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
/*
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//测试库存管理服务
public class StockControlServiceTest {

    private StockControlServiceimpl Scsi;
    private CommodityDAO Cdao;

    @Test
    public void commodityPurchaseTest1(){assertEquals(1,Scsi.commodityPurchase(new Commodity()));}

    @Test
    public void commodityPurchaseTest2(){assertEquals(2,Scsi.commodityPurchase(Cdao.findCommodity(8848)));};

    @Test
    public void commodityObsoleteTest1(){assertEquals(1,Scsi.commodityObsolete(8848));}

    @Test
    public void commodityObsoleteTest0(){assertEquals(0,Scsi.commodityObsolete(0000));}

    @Test
    public void stockAnalyzeTest1(){
        List<Commodity> list =  Scsi.stockAnalyze(30);
        Iterator<Commodity> iterator = list.iterator();
        String result = "";
        while(iterator.hasNext()){
            result += iterator.next().getCid();
        }
        assertEquals(4399,result);
    }

    @Test
    public void stockAnalyzeTest2(){
        List<Commodity> list =  Scsi.stockAnalyze(100);
        Iterator<Commodity> iterator = list.iterator();
        String result = "";
        while(iterator.hasNext()){
            result += iterator.next().getCid();
        }
        assertEquals("884843991422",result);
    }
}*/
