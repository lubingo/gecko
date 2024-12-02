package org.gecko.component.order;

import com.alibaba.fastjson.JSON;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import lombok.Getter;
import lombok.Setter;
import org.gecko.component.AbstractDelayed;

@Setter
@Getter
public class OrderDelayed extends AbstractDelayed {

    /**
     * 处理数据的类， 该类需为 实现指定接口及方法
     */
    private Class<?> warpClass ;

    public OrderDelayed( long delayTime ,   Object data ) {
        this.delayTime=delayTime;
        this.warpClass= null;
        this.data =data;
        this.expireTime = System.currentTimeMillis()+ delayTime;
    }

    public OrderDelayed( long delayTime , Class<?> warpClass , Object data ) {
        this.delayTime=delayTime;
        this.warpClass= warpClass;
        this.data =data;
        this.expireTime = System.currentTimeMillis()+ delayTime;
    }

    @Override
    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.expireTime - System.currentTimeMillis() , TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed delayed) {
        return (int) (this.getDelay(TimeUnit.MILLISECONDS) - delayed.getDelay(TimeUnit.MILLISECONDS));
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
