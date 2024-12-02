package org.gecko.component;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class AbstractDelayQueue<T extends Delayed> extends DelayQueue<T> {

    protected Integer delayQueueType;

}
