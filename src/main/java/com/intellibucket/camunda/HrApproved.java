package com.intellibucket.camunda;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.stereotype.Component;

@Component
public class HrApproved {

    @JobWorker(name = "hr-approved")
    public void hrApproved(){
        System.out.println("HR approved");
    }
}

