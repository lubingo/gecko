package org.gecko.component;

import java.util.concurrent.Delayed;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public abstract class AbstractDelayed implements Delayed {

    /**
     * 延时时间
     */
    protected long delayTime;
    /**
     * 过期时间 =  当前时间+延时时间
     */
    protected long expireTime = 0;
    /**
     * 需处理的数据，每个处理类的该字段值不相同
     */
    protected Object data; // 数据；
}
