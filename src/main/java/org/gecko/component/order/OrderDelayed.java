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
     * 延时时间
     */
    private long  delayTime ;
    /**
     * 过期时间 =  当前时间+延时时间
     */
    private final long  expireTime ;

    /**
     * 处理数据的类， 该类需为 实现指定接口及方法
     */
    private Class<?> warpClass ;
    /**
     * 需处理的数据，每个处理类的该字段值不相同
     */
    private Object data ; // 数据；


    public OrderDelayed( long delayTime ,   Object data ) {
        this.delayTime=delayTime;
        this.warpClass= null;
        this.data =data;
        expireTime = System.currentTimeMillis()+ delayTime;
    }

    public OrderDelayed( long delayTime , Class<?> warpClass , Object data ) {
        this.delayTime=delayTime;
        this.warpClass= warpClass;
        this.data =data;
        expireTime = System.currentTimeMillis()+ delayTime;
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
