package com.hand.hap.fruit.service.impl;

import com.hand.hap.fruit.mapper.FruitMapper;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hand.hap.fruit.dto.Fruit;
import com.hand.hap.fruit.service.IFruitService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FruitServiceImpl extends BaseServiceImpl<Fruit> implements IFruitService{

    @Autowired
    private FruitMapper fruitMapper;
    @Override
    public int updateList(List<Fruit> fruitList) {
        fruitList.forEach(fruit -> checkOvn(fruitMapper.myUpdate(fruit),fruit));
        return 0;
    }
}