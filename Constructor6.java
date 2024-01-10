
public class Constructor6 {
    //create constructor, initialize string, create method, write reversed string
    //logic, create an object, call the method
    String name;
    
    Constructor6(String name){
        this.name=name;

    }
    public  void ReversedMethod(){
       String empty = "";
       char ch = ' ';
        for(int i=0;i<name.length()-1;i++){
            ch = name.charAt(i);
            empty = empty+ch;


        }
        System.out.println(empty);
        

    }
    public static void main(String[] args) {
        Constructor6 constructor6 = new Constructor6("Apple");
        constructor6.ReversedMethod();
        
    }
    
}
