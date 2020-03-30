package Practicing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CapitalOne {

    public static void main(String[] args) {

        Testers s1 = new Testers("Tamara","Automation",120000);
       // s1.employeeInfo();
        Testers s2= new Testers("Guvanch","Automation",130000);
        Developers s3 = new Developers("Malika","Mobile Developer",120000);
       Developers s4 = new Developers("Zumrat","Developer",120000);
        List<Testers> t1 =Arrays.asList(s1,s2);
       List<Developers> d1 = Arrays.asList(s3,s4);
        List<ScrumTeam> scr = Arrays.asList(s1,s2,s3,s4);

        for (ScrumTeam each :scr) {
            each.employeeInfo();
        }



    }


}
