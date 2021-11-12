package com.company;

public class Main {

    public static void main(String[] args) {
        ITV tv = new SonyTV();
        LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
        tv.on();
        lrc.setChannelKeyboard(100);
        tv.off();

        tv = new SamsungTV();
        lrc = new LogitechRemoteControl(tv);
        tv.on();
        lrc.setChannelKeyboard(20);
        tv.off();

    }

}