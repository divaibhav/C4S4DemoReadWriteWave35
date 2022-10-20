package com.example.jap.main;

import com.example.jap.data.Learner;
import com.example.jap.operation.ReadWriteFile;

import java.io.IOException;

public class ReadWriteImplementation {
    public static void main(String[] args) {
        ReadWriteFile readWriteFile = new ReadWriteFile();
        String fileName = "resource/attendance.csv";
        Learner[] learnerList = new Learner[0];
        try {
            learnerList = readWriteFile.readData(fileName);
        }catch (IOException e){
            e.printStackTrace();
        }
        for (Learner learner : learnerList) {
            System.out.println(learner);
        }
        Learner learner = new Learner(50,"Vaibhav Diwan", 14);
        try {
            readWriteFile.writeData(learner, fileName);
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
