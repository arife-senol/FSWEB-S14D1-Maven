package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
        this.setSalary(70000);
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper, int index)
    {
        if(juniorDevelopers != null)
        {
            if(juniorDevelopers.length-1>=index && index>=0) {
                if (juniorDevelopers[index] == null) {
                    juniorDevelopers[index] = juniorDeveloper;
                } else {
                    System.out.println("Bu alan dolu");
                }
            }
            else{
                System.out.println("Böyle bir index bulunmamaktadır");
            }

        }

    }

    public void addEmployee(MidDeveloper midDeveloper, int index)
    {
        if(midDevelopers != null)
        {
            if(midDevelopers.length-1>=index && index>=0) {
                if (midDevelopers[index] == null) {
                    midDevelopers[index] = midDeveloper;
                } else {
                    System.out.println("Bu alan dolu");
                }
            }
            else{
                System.out.println("Böyle bir index bulunmamaktadır");
            }

        }

    }

    public void addEmployee(SeniorDeveloper seniorDeveloper, int index)
    {
        if(seniorDevelopers != null)
        {
            if(seniorDevelopers.length-1>=index && index>=0) {
                if (seniorDevelopers[index] == null) {
                    seniorDevelopers[index] = seniorDeveloper;
                } else {
                    System.out.println("Bu alan dolu");
                }
            }
            else{
                System.out.println("Böyle bir index bulunmamaktadır");
            }

        }

    }

}
