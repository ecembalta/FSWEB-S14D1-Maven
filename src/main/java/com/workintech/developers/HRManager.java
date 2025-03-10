package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDeveloper = new JuniorDeveloper[5];
    private MidDeveloper[] midDeveloper = new MidDeveloper[5];
    private SeniorDeveloper[] seniorDeveloper = new SeniorDeveloper[5];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }


    @Override
    public void work(){
        System.out.println(getName() + " starts to working");
        setSalary(getSalary());
    }

    public void addEmployee(JuniorDeveloper junior){
        for(int i = 0; i < juniorDeveloper.length; i++){
            if (juniorDeveloper[i] == null){
                juniorDeveloper[i] = junior;
                System.out.println(junior.getName() + " added to Juniors.");
                return;
            }
        }
        System.out.println("Junior is full.");
    }

    public void addEmployee(MidDeveloper mid){
        for(int i = 0; i < midDeveloper.length; i++){
            if (midDeveloper[i] == null){
                midDeveloper[i] = mid;
                System.out.println(mid.getName() + " added to Mids.");
                return;
            }
        }
        System.out.println("Mid is full.");
    }

    public void addEmployee(SeniorDeveloper senior){
        for(int i = 0; i < seniorDeveloper.length; i++){
            if (seniorDeveloper[i] == null){
                seniorDeveloper[i] = senior;
                System.out.println(senior.getName() + " added to Seniors.");
                return;
            }
        }
        System.out.println("Senior is full.");
    }
}
