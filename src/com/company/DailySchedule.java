package com.company;

import java.util.ArrayList;

public class DailySchedule {
    private ArrayList apptList;

    public DailySchedule() {
        apptList = new ArrayList();
    }

    public void clearConflicts (Appointment appt) {
        int i = 0;
        while (i < apptList.size())
        {
            if (appt.conflictsWith((Appointment)(apptList.get(i))))
            {
                apptList.remove(i);
            }
            else
            {
                i++;
            }
        }
    }

    public boolean addAppt (Appointment appt, boolean emergency) {

    }
}