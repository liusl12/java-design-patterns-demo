package com.liusl.factory.simple;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author liusl12
 * @date 2018/7/3.
 */
public class CarFactory {
    public static final int TYPE_1 = 1;
    public static final int TYPE_2 = 2;
    public static final int TYPE_3 = 3;

    public static Car createCar(int type){
        switch (type){
            case TYPE_1:
                return new Benz();
            case TYPE_2:
                return new BMW();
            case TYPE_3:
            default:
                return new Das();
        }
    }
}
