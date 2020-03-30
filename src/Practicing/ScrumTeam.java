package Practicing;

public abstract class ScrumTeam {

    String employeeName;
    String jobTitle;
    double salary;

    public ScrumTeam(String employeeName, String jobTitle, double salary) {
        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public abstract void Demo();

    public abstract void DailyStandUp();
    public void employeeInfo(){
        System.out.println("Employee name is:" + employeeName + " Job title: " + jobTitle +
                 " Employee salary: " + salary);




    }



}
