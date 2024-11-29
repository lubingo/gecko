package org.gecko.controller;


import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;
import jdk.incubator.vector.VectorSpecies;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping(value = "/getBase")
    public String getBase(){

        DelayQueue<> delayQueue = new DelayQueue();
delayQueue.offer("", 10, TimeUnit.SECONDS);





        return "base";
    }





}
