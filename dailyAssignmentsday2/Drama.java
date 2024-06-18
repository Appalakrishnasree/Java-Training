package com.java.dailyAssignmentsday2;

class Drama extends Movie {
    // Constructor
    public Drama(String title, int idNumber, String mpaaRating) {
        super(title, idNumber, mpaaRating);
    }

    // Overriding calcLateFees method
    @Override
    public double calcLateFees(int daysLate) {
        return daysLate * 2.0;
    }
}