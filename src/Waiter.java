public class Waiter extends Cafe {
    private double hsc;

    public Waiter(String name, int age, String sex, String date,int salary, double hsc){
        super(name,sex,date,age,salary);
        this.hsc=hsc;
    }
    public void detailsPrint(String name,int age,String sex, String date,int salary , double hsc){
        System.out.println(""+name+""+age+""+sex+""+date+""+salary+""+hsc);
    }

    public double getHsc() {
        return hsc;
    }

    public void setHsc(double hsc) {
        this.hsc = hsc;
    }
}
