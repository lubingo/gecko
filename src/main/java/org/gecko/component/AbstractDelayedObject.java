package org.gecko.component;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class AbstractDelayedObject  extends AbstractFrameWork implements AbstractDelayed{

    @Override
    public long getDelay(TimeUnit timeUnit) {
        return 0;
    }

    @Override
    public int compareTo(Delayed delayed) {
        return 0;
    }
}
