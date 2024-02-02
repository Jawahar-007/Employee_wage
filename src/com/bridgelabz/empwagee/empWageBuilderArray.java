package com.bridgelabz.empwagee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class empWageBuilderArray {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private List<empwage> companyEmpWageList;

    public empWageBuilderArray(){
        companyEmpWageList = new ArrayList<>();
    }

    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
        companyEmpWageList.add(new empwage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth));
    }

    public void computeEmpWage(){
        for(empwage companyEmpWage : companyEmpWageList){
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }

    private int computeEmpWage(empwage companyEmpWage) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }

    public List<empwage> getCompanyEmpWageList() {
        return companyEmpWageList;
    }

    public static void main(String[] args) {
        empWageBuilderArray empWageBuilder = new empWageBuilderArray();
        empWageBuilder.addCompanyEmpWage("Valeo", 20, 2, 10);
        empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
        empWageBuilder.computeEmpWage();
    }
}