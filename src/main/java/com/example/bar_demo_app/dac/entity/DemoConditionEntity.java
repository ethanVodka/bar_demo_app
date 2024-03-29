package com.example.bar_demo_app.dac.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.jdbc.entity.NamingType;

@Getter
@Setter
@Accessors(chain = true)
@Entity(naming = NamingType.SNAKE_LOWER_CASE)
public class DemoConditionEntity {
    @Id
    private Long id;
    
    private String name;

    private String address;
}
