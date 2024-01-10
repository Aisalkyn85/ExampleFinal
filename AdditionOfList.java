import java.util.*;

public class AdditionOfList {
    List<Integer>number = new ArrayList<>();

    AdditionOfList(List<Integer> listNubmer){
        
        this.number = listNubmer;
    }
    public int AdditionOfList(){
        int sum = 0;

        for(Integer additionsOfNumbers:number){
            sum = sum+additionsOfNumbers;
        }
        return sum;
    }
    public int Multiplication(){
        int sum = 1;
        for(Integer MultiplicaitonNumber:number){
            sum = sum*MultiplicaitonNumber;

        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(45,65,32,12,78);
        
        // through constructor we will pass 1 list of Integer. need to 
        //create 1 mothod and do some of all numbers of list and print sum
        AdditionOfList sumOfList = new AdditionOfList(list);
        int numbers = sumOfList.AdditionOfList();
        System.out.println(numbers);
        int multiplicaiton = sumOfList.Multiplication();
        System.out.println(multiplicaiton);
        

    }
}
