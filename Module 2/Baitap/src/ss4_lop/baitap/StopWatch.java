package ss4_lop.baitap;

import javafx.fxml.LoadException;

import java.time.LocalTime;
import java.util.Scanner;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime(){
        return startTime;
    }

    public LocalTime getEndTime(){
        return endTime;
    }

    StopWatch(){
        startTime = LocalTime.now();
    }

    public void startTime(){
        this.startTime = LocalTime.now();
    }

    public void endTime(){
        this.endTime = LocalTime.now();
    }

    public void stopTime(){
        this.endTime = LocalTime.now();
    }

    public void getelapsedTime(){
        int elapsedTime = (startTime.toSecondOfDay() - endTime.toSecondOfDay() * 100);
        System.out.println("So mili giay dem duoc la : "+ elapsedTime);
    }

    public static void main(String[] args){
        StopWatch sw = new StopWatch();
        sw.startTime();
        int sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += i;
        }
        sw.stopTime();
        sw.getelapsedTime();
    }
}