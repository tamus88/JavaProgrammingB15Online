package Practicing;

public class Testers extends ScrumTeam {


    public Testers(String employeeName, String jobTitle, double salary) {
        super(employeeName, jobTitle, salary);
    }

    @Override
    public void Demo() {
        System.out.println("Tester "+ employeeName + "starting Demo meeting");
    }

    @Override
    public void DailyStandUp() {
        System.out.println("Tester" + employeeName + "has every day stand up meeting ");
    }
    public void foundBug(){
        System.out.println(employeeName + "found bugs and fix them and than store them to developer");
    }
}
