package cn.xing.xingye.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangxing on 15/12/23.
 */
public class Zhishu extends BaseModel {
    private static final Logger log = LoggerFactory.getLogger(Zhishu.class);

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}