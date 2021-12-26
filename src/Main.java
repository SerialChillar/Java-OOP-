public class Main {
    public static void main(String[] args){
        Employee e1=new Bartendar();
        Employee e2=new Waiter();
        //C201045
        Summary es =new Summary();
        es.printEmployee(e1);
        es.printEmployee(e2);
    }
}
