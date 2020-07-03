package com.example.demo.service.impl;

import com.example.demo.dao.CommodityDAO;
import com.example.demo.entity.Commodity;

import java.util.List;

public class StockControlServiceimpl {
    private CommodityDAO Cdao;

    public int commodityPurchase(Commodity goods){          //购入新货品
        Commodity stock = Cdao.findCommodity(goods.getCid());
        if(stock==null){
            Cdao.insert(goods);
            return 1;
        }else{
            Cdao.updateQuantity(stock.getCid(),stock.getQuantity()+goods.getQuantity());
            return 2;
        }
    }

    public int commodityObsolete(Commodity goods){          //淘汰
        Commodity stock = Cdao.findCommodity(goods.getCid());
        if(stock==null){        //不存在该商品号的商品
            return 0;
        }else{                  //存在
            return Cdao.deleteCommodity(goods.getCid());
        }
    }

    public int commodityObsolete(int cid){                  //淘汰重载，指输入cid
        Commodity stock = Cdao.findCommodity(cid);
        if(stock==null){
            return 0;
        }else{
            return Cdao.deleteCommodity(cid);
        }
    }

    public List<Commodity> stockAnalyze(){
            return Cdao.findLowStocks(10);
    }
}
