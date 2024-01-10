public class Constructor1 {
    String holiday;
    String food;
    String happyness;
    String gift;

    Constructor1(String holiday, String food){
        this.holiday = holiday;
        this.food = food;
    }
    public static void main(String[] args) {
        Constructor1 constructor = new Constructor1("New Year", "Olivie");
        constructor.gift = "car";
        constructor.happyness = "very happy";
        System.out.println(constructor.food+ " "+constructor.holiday+ " "+constructor.happyness+
        " "+ constructor.gift);
        

    }
    
}
