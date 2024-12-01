package com.techprimers.lazy;

import org.springframework.stereotype.Service;

//@Lazy
@Service
public class ActiveService {

    public ActiveService() {
        System.out.println("Active Service:: Constructor loaded");
    }

    public String hello() {
        return "hello youtube";
    }
    public String activehello() {
        return "active hello youtube changes of 01 dec";
    }
}
