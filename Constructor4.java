import java.util.*;

public class Constructor4 {
    String name;
    String city;
    String country;
   List<Map<String, String>> list = new ArrayList<>();

    Constructor4(String name, String city, String country){
        this.name=name;
        this.city=city;
        this.country=country;
    
    }
    public static void main(String[] args) {
        Constructor4 constructor = new Constructor4("Den", "Chicago", "India");
        constructor.AddDataInAMap();
        System.out.println(constructor.list);
        Constructor4 constructor4 = new Constructor4("Sam", "Puja", "Australia");
        constructor4.AddDataInAMap();
        System.out.println(constructor4.list);

    } 
    public void AddDataInAMap(){
        Map<String, String>map = new HashMap<>();
        map.put("city",city);
        map.put("country", country);
        map.put("name", name);
        list.add(map);

    }   
}
