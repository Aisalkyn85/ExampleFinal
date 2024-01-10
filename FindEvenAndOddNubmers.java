import java.util.ArrayList;
import java.util.*;

public class FindEvenAndOddNubmers {
    List<Integer>list = new ArrayList<>();
    List<Integer>even = new ArrayList<>();
    List<Integer>odd = new ArrayList<>();

    public void EvenOrOdd(){
        for(Integer EvenOrOddNumber: list){
            if(EvenOrOddNumber%2==0){
                even.add(EvenOrOddNumber);
            }else{
                odd.add(EvenOrOddNumber);
            }
        }
    }
   
    FindEvenAndOddNubmers(List<Integer> number){
       this.list = number;
    }
    public static void main(String[] args) {
        List<Integer>numbers = Arrays.asList(23,45,65,78,56,54);
        FindEvenAndOddNubmers EvenOrOddNumbers1 = new FindEvenAndOddNubmers(numbers);
        EvenOrOddNumbers1.EvenOrOdd();
        System.out.println(EvenOrOddNumbers1.even);
        System.out.println(EvenOrOddNumbers1.odd);
        
    }
    
}
