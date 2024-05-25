package com.intellibucket.camunda;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.stereotype.Component;

@Component
public class UserApproved {

    @JobWorker(name = "user-approved")
    public void userApprove(){
        System.out.println("user approve");
    }
}
