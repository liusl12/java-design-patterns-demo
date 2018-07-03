package com.liusl.factory.simple;

/**
 * @author liusl12
 * @date 2018/7/3.
 */
public class App {
    public static void main(String[] args){
        //生产Benz
        Car benz = CarFactory.createCar(1);
        benz.name();
        //生产BMW
        Car bmw = CarFactory.createCar(2);
        bmw.name();
        //生产Das
        Car das = CarFactory.createCar(3);
        das.name();
    }
}
