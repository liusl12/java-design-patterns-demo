package com.liusl.builder;

/**
 * hero的盔甲
 * @author liusl12
 * @date 2018/7/2.
 */
public enum Armor {
    CLOTHES("clothes"),LEATHER("leather"),CHAIN_MAIL("chain_mail"),PLATE_MAIL("plate mail");
    private String title;
    Armor(String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return title;
    }
}
