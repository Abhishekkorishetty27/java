public class Operation {
    public static  String listOfNames[]={null,null,null,null};
    public static int index=0;
    public static int getLength(){
        return listOfNames.length;
    }   
    public static String[] read(){
        return listOfNames;

    }
    public static String save(String value){
        if(index<getLength()){
            //System.out.println(index);
            listOfNames[index]=value;
            //System.out.println(value);
            index+=1;
            return "saved successfully";
        }else{
            return "not saved";
        }
    }
    public static boolean match(String i){
    for(String names:listOfNames){
        if(names==i){
            return true;


        }else{
            return false;
        }

    }
    return false;
    }
    public static boolean update(String oldName,String newName){
        for(int index=0;index<listOfNames.length;index++){
            System.out.println(listOfNames[index]);
            if(listOfNames[index]==oldName){
                listOfNames[index]=newName;
                return true;

            }else{
                return false;
            }
            }
        return false;
        }
        
        }


