package com.homework.task2;

public class Flower extends Product implements Maintainable {

    private int maintenanceCount;

    public Flower(String name, int age) {
        super(name, age);
        this.maintenanceCount = 0;
    }

    private int getMaintenanceCount() {
        return maintenanceCount;
    }

    private void setMaintenanceCount(int maintenanceCount) {
        this.maintenanceCount = maintenanceCount;
    }

    @Override
    public boolean isMaintainNecessary() {
        int asd = maintenanceCount * 156 - this.getAge();
        return Math.abs(maintenanceCount * 156 - this.getAge()) >= 156;
    }

    @Override
    public void maintain() {
        if (isMaintainNecessary()) {
            System.out.println("Irrigation");
            this.setMaintenanceCount(this.getMaintenanceCount() + 1);
        }
    }

    @Override
    public int price() {
        return 1000 + this.getAge() * 2;
    }
}
