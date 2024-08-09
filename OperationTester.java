public class OperationTester {
    public static void main(String[] args) {
    int length=Operation.getLength();
    System.out.println("array length is:"+length);
    Operation.save("abhishek");
    Operation.save("virat");

    Operation.save("kohli");

    Operation.save("run");

    String result1=Operation.save("machine");
    System.out.println(result1);



    String[] name= Operation.read();
    for(String n:name){
        System.out.println(n);
    }
    boolean yes=Operation.match("abhishek");
    System.out.println(yes);
    Operation.update("abhishek","abhishek");
    
    }

}
