package com.hand.hap.fruit.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.hand.hap.fruit.dto.Fruit;

import java.util.List;

public interface FruitMapper extends Mapper<Fruit>{
    int myUpdate(Fruit fruit);
    List<Fruit> selectByDemo(Fruit fruit);
    int insertDemo(Fruit fruit);
    int deleteDemo(Fruit fruit);
}