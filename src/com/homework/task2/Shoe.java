package com.homework.task2;

public class Shoe extends Product implements Refundable{

    private double size;

    public Shoe(String name, int age) {
        super(name, age);
    }

    public Shoe(String name, double size, int age) {
        super(name, age);
        this.size = size;
    }

    @Override
    public boolean isRefundable() {
        return this.getAge() <= 50;
    }

    @Override
    public int refund() {
        if (isRefundable()){
            double res = (double) this.price() * (double) this.getAge() / 100;
            return this.price() - (int) res;
        }
        return 0;
    }

    @Override
    public int price() {
        return this.size > 40 ? 15000 : 14000;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
