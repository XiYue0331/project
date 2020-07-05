package com.example.demo.service.impl;

import com.example.demo.dao.CommodityDAO;
import com.example.demo.entity.Commodity;
import com.example.demo.service.StockControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockControlServiceimpl implements StockControlService {

    @Autowired
    private CommodityDAO Cdao;

    @Override
    public int commodityUpdate(Commodity goods) {
        return 0;
    }

    @Override
    public int commodityInsert(Commodity goods) {
        if(goods!=null) {
            Cdao.save(goods);
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public List<Commodity> getAllCommodity(Integer id) {
        return Cdao.findAll();
    }

    @Override
    public Commodity getCommodityById(Integer id) {
        return Cdao.findById(id).orElse(null);
    }

    @Override
    public int commodityDelete(Integer id) {
        if(getCommodityById(id)!=null) {
            Cdao.deleteById(id);
            return 1;
        }
        return 0;
    }

}