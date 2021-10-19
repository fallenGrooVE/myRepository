package com.company;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    //addrres of library
    private String address;
    private List<WorkDay> workDays = new ArrayList<WorkDay>();

    public Library(String name, String address, ArrayList<WorkDay> workDays) {
        this.name = name;
        this.address = address;
        this.workDays = workDays;
    }
    ////asdasfdsfafgaregdfsfargerffvsdfs
    //    //sfdfasdfawergfvdfsdfs

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        fillWorkDays();
    }

    public Library() {
        fillWorkDays();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public WorkDay getWorkDays(int index) {
        return workDays.get(index);
    }

    public void setWorkDays(WorkDay workDay, int index) {
        this.workDays.set(index, workDay);

    }


    private void fillWorkDays(){

        for (int i = 0; i < 5; i++){
            WorkDay workDay = new WorkDay ("День тижня", 0, 0);
            switch (i){
                case 0:
                    this.workDays.add(i,  updateDay(workDay, "Понеділок", 8, 5));
                    break;
                case 1:
                    this.workDays.add(i, updateDay(workDay, "Вівторок", 11, 7));
                    break;
                case 2:
                    this.workDays.add(i, updateDay(workDay, "Середа", 7, 10));
                    break;
                case 3:
                    this.workDays.add(i, updateDay(workDay, "Четвер", 10, 5));
                    break;
                case 4:
                    this.workDays.add(i, updateDay(workDay, "П'ятниця", 9, 6));
                    break;
                default:
                    break;
            }
        }
    }

    private WorkDay updateDay(WorkDay workDay, String day, int i2, int i3) {
        workDay.setWeekDay(day);
        workDay.setBooksReleased(i2);
        workDay.setBooksReturned(i3);
        return workDay;
    }

    public int dayCountBigRelease(){
        int count = 0;
        for (int i = 0; i < workDays.size(); i++){
            if(workDays.get(i).getBooksReleased() > workDays.get(i).getBooksReturned())
                count++;
        }
        return count;
    }

    public String evenReleasedOddReturned(){
        String result = "";
        for (int i = 0; i < workDays.size(); i++){
            WorkDay workDay = workDays.get(i);
            if (workDay.getBooksReleased() % 2 == 0 &&
                    workDay.getBooksReturned() % 2 != 0)
                result += (workDay.getWeekDay() + "\t");
        }
        return result;
    }

    public int averageMovement(int i){
        return Math.round(((workDays.get(i).getBooksReleased() + workDays.get(i).getBooksReturned()) / 2));
    }

}
