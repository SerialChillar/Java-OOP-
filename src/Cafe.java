public class Cafe {
    private String name,sex,date;
    private int age, salary;


    public Cafe(String name, String sex, String date, int age, int salary) {
        this.name=name;
        this.sex=sex;
        this.date=date;
        this.age=age;
        this.salary=salary;
    }
    public void detailsPrint(String name, int age, String sex, String date, int salary){
        System.out.println(name+""+age+""+sex+""+date+""+salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
