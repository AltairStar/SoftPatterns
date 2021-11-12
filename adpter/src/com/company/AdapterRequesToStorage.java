package com.company;

public class AdapterRequesToStorage extends Request implements Storage{


    @Override
    public void fillIn() {
        applyOrder();
    }

    @Override
    public void pullOut() {
        sendThings();
    }
}
