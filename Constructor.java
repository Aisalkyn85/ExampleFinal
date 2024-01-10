public class Constructor {
    String name;
    String diet;
    String workplace;

    Constructor(String name, String diet, String workplace){
        this.name= name;
        this.diet = diet;
        this.workplace = workplace;
    }
    public static void main(String[] args) {
        Constructor constructor = new Constructor("Den", "vegan", "Chicago");
        System.out.println(constructor.diet+" "+constructor.name+" "+constructor.workplace);
    }
    
}
