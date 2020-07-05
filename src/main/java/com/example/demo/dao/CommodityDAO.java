package com.example.demo.dao;

import com.example.demo.entity.Commodity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

@Mapper
public interface CommodityDAO extends JpaRepository<Commodity,Integer> {
}
