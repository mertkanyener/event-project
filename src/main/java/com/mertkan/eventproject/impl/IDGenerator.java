package com.mertkan.eventproject.impl;

public class IDGenerator {

    private static final Long LIMIT = 10000000000L;
    private static Long last = 0L;

    public IDGenerator() {
    }

    public Long generate() {
        Long id = System.currentTimeMillis() % LIMIT;
        if ( id <= last ) {
            id = (last + 1) % LIMIT;
        }
        last = id;
        return id;
    }



}
