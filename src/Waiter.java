public class Waiter {
    private String name, sex, date;
    private int age;
    private double salary, hsc;

    public Waiter(String name, String sex, String date, int age,double salary,double hsc) {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.age = age;
        this.salary = salary;
        this.hsc = hsc;
    }

    public void detailsPrint(String name, int age, String sex, String date, double salary, double hsc) {
        System.out.println(name + "" + age + "" + sex + "" + date + "" + salary + "" + hsc);
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getHsc() {
        return hsc;
    }

    public void setHsc(double hsc) {
        this.hsc = hsc;
    }
}