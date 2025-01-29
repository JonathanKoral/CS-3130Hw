package org.example.HW1.TimeSpan;

import java.util.Objects;

public class TimeSpan implements Comparable<TimeSpan>{
    private int minutes;

    TimeSpan(int minutes) {
        this.minutes = minutes;
    }

    public static TimeSpan ofHours(int hours) {
        if(hours >= 0) {
            return new TimeSpan(hours * 60);
        } else {
            throw new IllegalArgumentException("Hours cannot be negative");
        }
    }

    public static TimeSpan ofMinutes(int minutes) {
        if(minutes >= 0) {
            return new TimeSpan(minutes);
        } else {
            throw new IllegalArgumentException("Minutes cannot be negative");
        }
    }

    public static TimeSpan ofHoursAndMinutes(int hours, int minutes) {
        if(hours >= 0 && minutes >= 0) {
            return new TimeSpan( (hours * 60) + minutes );
        } else {
            throw new IllegalArgumentException("Minutes or Hours cannot be negative");
        }
    }

    public int getHours() {
        return minutes / 60;
    }

    public int getMinutes() {
        return minutes % 60;
    }

    public int getTotalMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        return getHours() + "h" + getMinutes() + "m";
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof TimeSpan) {
            TimeSpan other = (TimeSpan) o;
            return this.minutes == other.minutes;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int results = Objects.hashCode(minutes);
        return results;
    }

    @Override
    public int compareTo(TimeSpan o) {
        if(this.minutes > o.minutes) {
            return 1;
        } else if (this.minutes < o.minutes) {
            return -1;
        } else {
            return 0;
        }
    }

    public TimeSpan plus(TimeSpan o) {
        return new TimeSpan(this.minutes + o.minutes);
    }

    public TimeSpan plusHours(int hours) {
        if(hours >= 0) {
            return new TimeSpan(this.minutes + (hours *60) );
        } else {
            throw new IllegalArgumentException("Hours cannot be negative");
        }
    }

    public TimeSpan plusMinutes(int minutes) {
        if(minutes >= 0) {
            return new TimeSpan(this.minutes + minutes);
        } else {
            throw new IllegalArgumentException("Minutes cannot be negative");
        }
    }

    public TimeSpan plusHoursAndMinutes(int hours, int minutes) {
        if(hours >=0 && minutes >= 0) {
            return new TimeSpan(this.minutes + (hours * 60) + (minutes) );
        } else {
            throw new IllegalArgumentException("Minutes or Hours cannot be negative");
        }
    }
}
