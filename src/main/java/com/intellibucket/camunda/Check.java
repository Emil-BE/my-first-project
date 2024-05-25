package com.intellibucket.camunda;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.stereotype.Component;

@Component
public class Check {

    @JobWorker(name = "check")
    public void check(){
        System.out.println("Check");
    }
}
