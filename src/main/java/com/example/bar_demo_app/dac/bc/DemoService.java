package com.example.bar_demo_app.dac.bc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bar_demo_app.dac.condition.DemoCondition;
import com.example.bar_demo_app.dac.dao.DemoDao;
import com.example.bar_demo_app.dac.entity.DemoConditionEntity;
import com.example.bar_demo_app.dac.entity.UserInformation;
import com.example.bar_demo_app.ic.dto.InDto;

@Service
public class DemoService {

   @Autowired
   private DemoCondition condition;
   @Autowired
   private DemoDao dao;
   
    public String getUser(InDto dto){
        DemoConditionEntity entity = new DemoConditionEntity();
        
        condition.setId(dto.getId());
        entity =  dao.selectUserInfo(condition);

        return entity.getName();
    }

    public int insertUser(UserInformation entity){
        
        dao.insertNewUser(entity);
        
        return 0;      
    }

}
