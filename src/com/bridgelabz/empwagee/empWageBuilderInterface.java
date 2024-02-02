package com.bridgelabz.empwagee;
public interface empWageBuilderInterface
{
    void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
    void computeEmpWage();
}
