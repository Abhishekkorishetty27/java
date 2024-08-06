public class Event {
    public static void main(String[] args) {
        int count=0;
        for(int i=0;i<=args.length-1;i++){
            System.out.println(args[i]);
            if(args[i].equals ("abhi")){
                count++;
            }
           
        }
        System.out.println("name is present"+count);
    }
}
