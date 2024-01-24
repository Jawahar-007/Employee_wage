public class empwage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static int compEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
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
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage for Company " +company+ " is:" + totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args)
    {
        compEmpWage("Valeo",10, 3, 20);
        compEmpWage("Zoho",34, 4,65);
    }

}
//Emp Wage:160
//Emp Wage:160
// UC5 Emp Wag: 0
//Emp Wag: 80
//Emp Wag: 0
//Emp Wag: 80
//Emp Wag: 80
//Total Emp Wage : 240
//UC6 Day 1 Emp hr : 4
//Day 2 Emp hr : 4
//Day 3 Emp hr : 8
//Day 4 Emp hr : 0
//Day 5 Emp hr : 8
//Total Emp Wage :480