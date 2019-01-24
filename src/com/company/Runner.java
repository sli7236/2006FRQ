package com.company;

public class Runner {

    public static void main(String[] args) {
        TimeInterval t1 = new TimeInterval(100,200);
        TimeInterval t2 = new TimeInterval(200,300);
        TimeInterval t3 = new TimeInterval(300,400);
        TimeInterval t4 = new TimeInterval(400,500);
        TimeInterval t5 = new TimeInterval(500,600);

        Appointment a1 = new Appointment(t1);
        Appointment a2 = new Appointment(t2);
        Appointment a3 = new Appointment(t3);
        Appointment a4 = new Appointment(t4);
        Appointment a5 = new Appointment(t5);
        Appointment a6 = new Appointment(t1);
        Appointment a7 = new Appointment(t2);
        Appointment a8 = new Appointment(t3);
        Appointment a9 = new Appointment(t4);
        Appointment a10 = new Appointment(t5);

        DailySchedule d = new DailySchedule();

        d.addAppt(a1,false);
        d.addAppt(a2,false);
        d.addAppt(a3,false);
        d.addAppt(a4,false);
        d.addAppt(a5,false);
        d.addAppt(a6,false);
        d.addAppt(a7,false);
        d.addAppt(a8,false);
        d.addAppt(a9,false);
        d.addAppt(a10,false);

        System.out.println(d.disp());
    }
}
