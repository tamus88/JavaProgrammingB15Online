package day62;

import day61.Job;

import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {
    public static void main(String[] args) {

        SortedSet<Job> myJob = new TreeSet<>();
        myJob.add(new Job("Florida",145000,"Caribian cruise"));
        myJob.add(new Job("Atlanta",130000,"Verizon"));
        myJob.add(new Job("Los Angeles",140000,"Disney"));
        for (Job each :myJob) {
            System.out.println("each = " + each);
        }

    }


}
