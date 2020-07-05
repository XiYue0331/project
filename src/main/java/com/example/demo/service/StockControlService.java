package com.example.demo.service;

import com.example.demo.entity.Commodity;

import java.util.List;

public interface StockControlService {
    public int commodityUpdate(Commodity goods);
    public int commodityDelete(Integer id);
    public int commodityInsert(Commodity goods);
    public List<Commodity> getAllCommodity(Integer id);
    public Commodity getCommodityById(Integer id);
}
