package com.company;

public class Appointment {
    public TimeInterval getTime() {

    }
    public boolean conflictsWith(Appointment other)
    {
        return getTime().overlapsWith(other.getTime());
    }

}