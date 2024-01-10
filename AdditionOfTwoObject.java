public class AdditionOfTwoObject{
    int number;
    int number1;

    AdditionOfTwoObject(int number, int number1){
        this.number = number;
        this.number1 = number1;
    }
    public int AdditionMethod(){
        int add = number+number1;


        return add;
    }
    
    public static void main(String[] args) {
        AdditionOfTwoObject addition = new AdditionOfTwoObject(4, 5);
        System.out.println(addition.AdditionMethod());
        AdditionOfTwoObject addition1 = new AdditionOfTwoObject(10, 16);
        System.out.println(addition1.AdditionMethod());
        System.out.println(addition.AdditionMethod()+addition1.AdditionMethod());
        

    }
}