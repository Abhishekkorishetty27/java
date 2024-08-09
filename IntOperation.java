public class IntOperation {
    public static int listOfNames[]={0,0,0,0,0};
    public static int index=0;
    public static int getLength(){
        return listOfNames.length;
    }   
    public static int[] read(){
        return listOfNames;

    }
    public static String save(int string){
        if(index<getLength()){
            //System.out.println(index);
            listOfNames[index]=string;
            //System.out.println(value);
            index+=1;
            return "saved successfully";
        }else{
            return "not saved";
        }
    }
    public static boolean match(int searchValue){
    for(int number:listOfNames){
        if(number==searchValue){
            return true;


        }else{
            return false;
        }

    }
    return false;
    }
    public static boolean update(int oldNumber,int newNumber){
        for(int index=0;index<listOfNames.length;){
            System.out.println(listOfNames[index]);
            if(listOfNames[index]==oldNumber){
                listOfNames[index]=newNumber;
                return true;

            }else{
                return false;
            }
            }
        return false;
        }
        
    
}
