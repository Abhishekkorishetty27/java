public class Even {
    public static void evenOrOdd(){
        int num=2;
        if(num%2==0){
            System.out.println("the number is even ");
        
        }
        else{
            System.out.println("the number is odd");
        }

    } 
    public static void swap(){
        int number1=30;
        int number2=40;
        
        int temp;
        temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("number after swapping"+number1);
        System.out.println("number after swapping"+number2);
    }
    public static void swappingWithout(){
        int a=40;
        int b=30;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void multiple(){
        int num=6;
        if(num%3==0){
            System.out.println("number is multiple of 3");
        
        }
        else{
            System.out.println("number is not multiple of 3");
        }
    }
    public static void leap(){
        int year=2001;
        if(year%4==0 || year%100==0){
            System.out.println("year is leap year");
        }
        else{
            System.out.println("year is not a leap year");
        }
    }
    public static void prime(){
        int c=10;
        if(c%1==0 || c%c==0){
            System.out.println("it is prime");
        }
        else{
            System.out.println("it is not a prime number");
        }
    }
    public static void loop(){
        for(int i=10;i>=0;i--){
            if(i%2==0){
                System.out.println("number is even");
            }else{
                System.out.println("number is not even");
            }
        }
    }
    public static void sum(){
        int sum=0;
        for(int i=0;i<=100;i++){
            sum=sum+i; 
        }
        System.out.println(sum);
    }
    public static void count(){
        int countodd=0;
        int counteven=0;
        for(int i=1;i<=100;i++){
            System.out.println(i);
            if(i%2==0){
                counteven++;
            }
            else{
                countodd++;
            }
        } 
        System.out.println("total count of even and odd");
        System.out.println(counteven+" "+countodd);
        System.out.println("==");
    }
    public static void primeNumber(){
        int count=0;
        int n=10;
        if(n<2){
            System.out.println("the given number is "+n+"is not prime number");

        }
        for(int i=1;i<=n;i++)
        {
            if(n%i==0){
                count++;
            }
            
        }
        if(count>2){
            System.out.println("the given number is "+n+"is not prime");
        }
        else{
            System.out.println("the given number is "+n+"is prime");
        }
    }
}
