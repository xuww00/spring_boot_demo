package com.xuww.springbootdemo.util.study.DesignMode.Delegat;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 13:36 2019/2/15.
 * @Modifide BY
 * @Version: 1.0
 */
public class Leader {
    private Map<String, ITarget> targetMap = new HashMap<String, ITarget>();

    public Leader(){
        targetMap.put("加密", new TargetA());
        targetMap.put("销售", new TargetB());
    }

    public void dispatch(String command){
        targetMap.get(command).doing(command);
    }
}
