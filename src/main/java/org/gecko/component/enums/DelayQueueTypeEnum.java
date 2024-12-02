package org.gecko.component.enums;

import java.util.Objects;

public enum DelayQueueTypeEnum implements CodeEnum{

    OrderDelayQueue(1,"订单延迟队列"),
    productDelayQueue(2,"商品延迟队列");

    private Integer code ;
    private String msg ;

    DelayQueueTypeEnum(Integer code, String msg) {
        this.code =code;
        this.msg = msg;
    }


    @Override
    public String getMsg(Integer code) {
        for (DelayQueueTypeEnum enumObject : DelayQueueTypeEnum.values() ) {
            if(Objects.equals(enumObject.getCode(), code)){
                return enumObject.msg;
            }
        }
        return "";
    }
    @Override
    public Integer getCode() {
        return this.code;
    }

}
