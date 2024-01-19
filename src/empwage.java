public class empwage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        // Varibles
        int empHrs = 0;
        int empWage = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case IS_PART_TIME:
                empHrs = 4;
                empWage = empHrs * EMP_RATE_PER_HOUR;
                System.out.println("Emp Wage:" + empWage);
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                empWage = empHrs * EMP_RATE_PER_HOUR;
                System.out.println("Emp Wage:" + empWage);
                break;

            default:
                empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage:" + empWage);
    }


}
//Emp Wage:160
//Emp Wage:160