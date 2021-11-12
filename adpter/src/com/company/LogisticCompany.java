package com.company;

public class LogisticCompany {
    public static void main(String[] args) {
        Storage storage =  new AdapterRequesToStorage();

        storage.fillIn();
        storage.pullOut();
    }
}
