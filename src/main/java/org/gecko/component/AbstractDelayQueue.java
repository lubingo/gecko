package org.gecko.component;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

public abstract  class AbstractDelayQueue<T extends Delayed>  extends DelayQueue<T> {

    private Integer  delayQueueType ;

}
