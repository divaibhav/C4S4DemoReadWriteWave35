package com.example.jap.operation;

import com.example.jap.data.Learner;

import java.io.*;

public class ReadWriteFile {
    public int countLines(String fileName) throws FileNotFoundException, IOException {
        FileReader fileReader;
        BufferedReader bufferedReader;
        int countLines = 0;
        fileReader = new FileReader(fileName);
        bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine()) != null){
            countLines++;
        }

        return countLines - 1;
    }
    //read the file and store it in learner array
    public Learner[] readData(String fileName) throws IOException {
        int noOfLearner = countLines(fileName);
        Learner[] learnerList = new Learner[noOfLearner];
        int index = 0;
        //start reading
        // file reader
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();// skipping header
        while ((line = bufferedReader.readLine()) != null){
            String[] split = line.split(",");
            int sno = Integer.parseInt(split[0]);
            String name = split[1];
            int totalAttendance = Integer.parseInt(split[2]);
            // object of Learner
            Learner learner = new Learner(sno, name, totalAttendance);
            //assign to array index
            learnerList[index] = learner;
            index++;
        }
        return learnerList;
    }
    public void writeData(Learner learner, String fileName) throws IOException{
        boolean isAppend = true;
        FileWriter fileWriter = new FileWriter(fileName, isAppend);
        String data = "\n" + learner.getSno() + "," + learner.getName() + "," + learner.getTotalAttendance();
        fileWriter.write(data);
        fileWriter.flush();
    }
}
