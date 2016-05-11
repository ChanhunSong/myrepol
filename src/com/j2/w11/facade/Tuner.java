package com.j2.w11.facade;

public class Tuner {
    Amplifier amplifier;
    double frequency;
    public Tuner(Amplifier amplifier) {
    }
    public void on() {
        System.out.println("Tuner" + " on");
    }
    public void off() {
        System.out.println("Tuner" + " off");
    }
    public void setFrequency(double frequency) {
        System.out.println("Tuner" + " setting frequency to " + frequency);
        this.frequency = frequency;
    }
}