public class Waiter {
    String name,sex,date;
    int age;
    double salary,hsc;
    public Waiter(String name, String sex, String date, int age,double salary,double hsc) {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.age = age;
        this.salary=salary;
        this.hsc=hsc;

    }

    public void detailsPrint(String name, int age, String sex, String date,double salary,double hsc){
        System.out.println(name+""+age+""+sex+""+date+""+salary+""+hsc);
    }

}
