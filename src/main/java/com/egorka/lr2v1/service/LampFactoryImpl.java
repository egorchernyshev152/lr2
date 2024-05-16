package com.egorka.lr2v1.service;


import com.egorka.lr2v1.model.Lamp;

public class LampFactoryImpl implements LampFactory {
    @Override
    public Lamp createLamp(int x, int y, String color) {
        return new Lamp(x, y, color);
    }

    private static LampFactory instance;

    private LampFactoryImpl() {
    }

    public static LampFactory getInstance() {
        if (instance == null) {
            instance = new LampFactoryImpl();
        }
        return instance;
    }
}
