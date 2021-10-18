package ru.samsung.itschool.mdev;

public class Main {

    public static void main(String[] args) {

        Car opel = new Car();
        opel.setPower(56);
        opel.setColor("Red");

        System.out.println(opel.getWeight());

        Car bmw = new Car();
        bmw.setName("BMW");
        bmw.setColor("Blue");

        Car audi = new Car("A6",1500,"White",250);
        System.out.println(audi.getWeight());

        ElectroCar tesla = new ElectroCar();
        tesla.doBeep();


        Car smart = new ElectroCar();

    }
}
