package com.bridgelabz.empwagee;
import java.util.List;
public interface empWageBuilderInterface
{
    void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
    void computeEmpWage();
    List<empwage> getCompanyEmpWage();
}
