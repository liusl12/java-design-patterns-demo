package com.liusl.builder;

/**
 * @author liusl12
 * @date 2018/7/2.
 */
public class App {
    public static void main(String[] args) {
        Hero hero1 = new Hero.Builder(Profession.MAGE, "liusl12").build();
        System.out.println("--------------------------------------");
        System.out.println(hero1);
        System.out.println("--------------------------------------");
        Hero hero2 = new Hero
                .Builder(Profession.PRIEST,"lixin40")
                .withArmor(Armor.CLOTHES)
                .withHairType(HairType.CURLY)
                .withHairColor(HairColor.BLOND)
                .withWeapon(Weapon.AXE).build();
        System.out.println(hero2);
    }
}
