package com.example.bar_demo_app.dac.condition;

import lombok.Setter;
import lombok.experimental.Accessors;

import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.boot.autoconfigure.AutoConfiguration;

import lombok.Data;
import lombok.Getter;

@Getter
@Setter
@Data
@Accessors(chain = true)
@AutoConfiguration
@ConfigAutowireable
public class DemoCondition {
    
    private Long id;
    
}
