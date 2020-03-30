package day61;

public class Job implements Comparable<Job>{

    private String location;
   private int salary;
   private String companyName;

    public Job(String location, int salary, String companyName) {
        this.location = location;
        this.salary = salary;
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public int compareTo(Job other) {
   //  return (this.location.compareTo(other.location)==0) ? Integer.compare(this.location,other.location)

       if(this.salary>other.salary){
           return 1;
       }else if(this.salary<other.salary){
           return -1;
       }else{
           return 0;
       }

    }

    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
