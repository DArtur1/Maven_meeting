package ru.netology.javaqa;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 150;
        int actual = service.calxBonus(5000, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 50;
        actual = service.calxBonus(5000, false);
        System.out.println("2. " + expected + " == ? == " + actual);

        }
    }