package org.gecko.component.order.queue;

import java.util.concurrent.Delayed;
import org.gecko.component.AbstractDelayQueue;
import org.gecko.component.enums.DelayQueueTypeEnum;

public class OrderDelayQueue<T extends Delayed> extends AbstractDelayQueue<T> {


    public OrderDelayQueue( ) {
        this.delayQueueType = DelayQueueTypeEnum.OrderDelayQueue.getCode() ;
    }


}
