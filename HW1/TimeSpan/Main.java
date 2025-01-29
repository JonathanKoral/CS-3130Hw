package org.example.HW1.TimeSpan;

public class Main {
    public static void main(String[] args) {
        TimeSpan ts1 = new TimeSpan(90);
        TimeSpan ts2 = new TimeSpan(120);
        TimeSpan ts3 = new TimeSpan(165);

        System.out.println(ts1);
        System.out.println(ts2);
        System.out.println(ts3);

        System.out.println();

        System.out.println(ts1.getMinutes());

        System.out.println(ts1.compareTo(ts2));

        System.out.println(ts1.plus(ts2));
    }
}
