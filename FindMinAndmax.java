import java.util.*;

public class FindMinAndmax {
    int number;
List<Integer>list = new ArrayList<>();

FindMinAndmax(List<Integer>list){
this.list = list;
}
public void MinValue(){
    int min=1000;
    for(int i=0;i<=list.size()-1;i++){
if(list.get(i)<min){
    min=list.get(i);
}

    
}
System.out.println(min);
}
    public void Max(){
        int max = 0;
        for(int i=0;i<=list.size()-1;i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
            
        }
System.out.println(max);
    }
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(34,54,23,12,98);
        FindMinAndmax findMinAndmax = new FindMinAndmax(list);
        findMinAndmax.Max();
        findMinAndmax.MinValue();
    }

    
}
