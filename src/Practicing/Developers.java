package Practicing;

public class Developers extends ScrumTeam {

    public Developers(String employeeName, String jobTitle, double salary) {
        super(employeeName, jobTitle, salary);
    }

    @Override
    public void Demo() {
    }
    @Override
    public void DailyStandUp() {

    }
    public void fixingBug(){
        System.out.println("Developer" + employeeName + "fixing bug");
}



}
