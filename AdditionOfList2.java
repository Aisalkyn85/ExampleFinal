import java.util.*;

public class AdditionOfList2 {
    String hobby;
    String dream;
    String achieve;
List<Map<String, String>>list=new ArrayList();

    AdditionOfList2(String hobby, String dream, String achieve){
        this.achieve=achieve;
        this.dream=dream;
        this.hobby=hobby;
        
        
    }
    public static void main(String[] args) {
        AdditionOfList2 additionOfList2 = new AdditionOfList2("sleep", "dance", "both");
        additionOfList2.AdditionMethod();
        System.out.println(additionOfList2.list);
        
    }
    public void AdditionMethod(){
        Map<String, String>map = new HashMap<>();
        map.put("hoppy",hobby);
        map.put("dream", dream);
        map.put("achieve", achieve);
        list.add(map);
    }
    
}
