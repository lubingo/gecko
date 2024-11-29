package org.gecko.controller;


import java.util.concurrent.DelayQueue;
import lombok.extern.slf4j.Slf4j;
import org.gecko.component.order.OrderDelayed;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BaseController {

    DelayQueue<OrderDelayed> delayQueue = new DelayQueue<>();

    @RequestMapping(value = "/setDelayQueue")
    public String setDelayQueue(){
        OrderDelayed orderDelayed= new OrderDelayed(30000L,new Object());
        delayQueue.add(orderDelayed);
        log.info("temp1------------》{} ",System.currentTimeMillis());
        return " setDelayQueue ";
    }

    @RequestMapping(value = "/getDelayQueue")
    public String getDelayQueue() throws InterruptedException {
        OrderDelayed orderDelayed = delayQueue.take();
        log.info("temp2------------》{} ",orderDelayed);
        return "getDelayQueue";
    }




}
