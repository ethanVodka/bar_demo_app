package com.example.bar_demo_app.dac.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import com.example.bar_demo_app.dac.condition.DemoCondition;
import com.example.bar_demo_app.dac.entity.DemoConditionEntity;
import com.example.bar_demo_app.dac.entity.UserInformation;;

@Dao
@ConfigAutowireable
public interface DemoDao {
    @Select
    public DemoConditionEntity selectUserInfo(DemoCondition condition);

    @Insert
    public int insertNewUser(UserInformation entity);
}
