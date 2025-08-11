package org.example;

// Abstract class
abstract class Appliance {
    abstract void turnOn();
    abstract void turnOff();
}

// Subclass 1
class WashingMachine extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Washing Machine is now ON.");
    }

    @Override
    void turnOff() {
        System.out.println("Washing Machine is now OFF.");
    }
}

// Subclass 2
class Refrigerator extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Refrigerator is now ON.");
    }
    @Override
    void turnOff() {
        System.out.println("Refrigerator is now OFF.");
    }
}
public class MainAppliance {
    public static void main(String[] args) {
        Appliance wm = new WashingMachine();
        wm.turnOn();
        wm.turnOff();
        Appliance fridge = new Refrigerator();
        fridge.turnOn();
        fridge.turnOff();
    }
}
