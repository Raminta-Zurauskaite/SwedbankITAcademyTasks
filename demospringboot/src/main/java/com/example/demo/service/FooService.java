package com.example.demo.service;

import com.example.demo.util.Formatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FooService {

    private Formatter formatter;

    @Autowired
    public FooService(@Qualifier("barFormatter") Formatter formatter) {
        this.formatter = formatter;
    }

    /*@Autowired
    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    } */

    public String fetchFoo() {
        return formatter.format();
    }
}
