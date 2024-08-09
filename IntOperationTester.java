public class IntOperationTester {
        public static void main(String[] args) {
        int length=IntOperation.getLength();
        System.out.println(" length is:"+length);
        IntOperation.save(3);
        IntOperation.save(3);
    
        IntOperation.save(2);
    
        IntOperation.save(1);
    
        String result1=IntOperation.save(4);
        System.out.println(result1);
    
    
    
        int[] name= IntOperation.read();
        for(int n:name){
            System.out.println(n);
        }
        boolean yes=IntOperation.match(0);
        System.out.println(yes);
        IntOperation.update(0,0);
        
        }
    
    }
    
    

