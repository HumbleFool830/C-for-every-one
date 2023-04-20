package project1.smallApplications;

public class student {

    public int rollNo;
    public String name;
    public String branch;
    public int age;
    
    public void student(int roll, String name, String branch, int age)
    {
        this.rollNo = roll;
        this.name = name ;
        this.branch = branch;
        this.age = age;
    }
    

    public void getStudnetDetails()
    {
        System.out.println(rollNo);
        System.out.println(branch);
        System.out.println(name);
        System.out.println(age);
    }
}
