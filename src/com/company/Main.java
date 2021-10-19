package com.company;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        System.out.println("Середній рух книжок в понеділок: " + library.averageMovement(0));
        System.out.println("К-сть днів , коли було видано книг більше, ніж повернуто: " + library.dayCountBigRelease());
        System.out.println("Дні, коли видана парна кількість книг, а повернута - непарна: " + library.evenReleasedOddReturned());
    }
}
