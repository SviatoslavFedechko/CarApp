package com.company.service;

public class LogServiceConsoleImpl implements LogService{

    public void logInfo(String msg) {
        System.out.println(msg);
    }

    public void logError(String msg) {
        System.out.println(msg);
    }

}
