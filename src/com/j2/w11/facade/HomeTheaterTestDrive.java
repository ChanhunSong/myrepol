package com.j2.w11.facade;

public class HomeTheaterTestDrive {
  public static void main(String[] args) {
    Amplifier amp = new Amplifier();
    Tuner tuner = new Tuner (amp);
    DvdPlayer dvd = new DvdPlayer(amp);
    Projector projector = new Projector(dvd);
 
    HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, projector);
    homeTheater.watchMovie("My Movie Watching...");
    homeTheater.endMovie();
  }
}