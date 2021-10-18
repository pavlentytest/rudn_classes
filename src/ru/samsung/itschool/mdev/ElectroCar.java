package ru.samsung.itschool.mdev;

public class ElectroCar extends Car {
    private double batteryCapacity;

    ElectroCar() {

    }

    public ElectroCar(String name, int weight, String color, double power, double batteryCapacity) {
        super(name, weight, color, power);
        this.batteryCapacity = batteryCapacity;
    }

    @Override // аннотация - переопределяется
    public void doBeep() {
        this.power
        System.out.println("Beeeeeeeeeeeeeep!!!");
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
