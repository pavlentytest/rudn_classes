package ru.samsung.itschool.mdev;

public class Car {
    // поля - характеристики класса
    private String name; // ""
    private int weight;   // 0
    private String color;  // ""
    protected double power;  // 0.0

    public void doBeep() {
        System.out.println("Beep!");
    }

    public Car() {
        this.name = "";
        this.weight = 0;
        this.color = "";
        this.power = 0;
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int weight, String color, double power) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}

