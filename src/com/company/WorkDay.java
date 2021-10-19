package com.company;

public class WorkDay {
    private String weekDay;
    private int booksReleased;
    private int booksReturned;

    public WorkDay() {
    }

    public WorkDay(String weekDay, int booksReleased, int booksReturned) {
        this.weekDay = weekDay;
        this.booksReleased = booksReleased;
        this.booksReturned = booksReturned;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public int getBooksReleased() {
        return booksReleased;
    }

    public void setBooksReleased(int booksReleased) {
        this.booksReleased = booksReleased;
    }

    public int getBooksReturned() {
        return booksReturned;
    }

    public void setBooksReturned(int booksReturned) {
        this.booksReturned = booksReturned;
    }
}
