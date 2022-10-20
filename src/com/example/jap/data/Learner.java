package com.example.jap.data;

import java.util.Objects;

public class Learner {
    private int sno;
    private String name;
    private int totalAttendance;

    public Learner() {
    }

    public Learner(int sno, String name, int totalAttendance) {
        this.sno = sno;
        this.name = name;
        this.totalAttendance = totalAttendance;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalAttendance() {
        return totalAttendance;
    }

    public void setTotalAttendance(int totalAttendance) {
        this.totalAttendance = totalAttendance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Learner learner = (Learner) o;
        return sno == learner.sno && totalAttendance == learner.totalAttendance && Objects.equals(name, learner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name, totalAttendance);
    }

    @Override
    public String toString() {
        return "Learner{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", totalAttendance=" + totalAttendance +
                '}';
    }
}
