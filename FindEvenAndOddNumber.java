public class FindEvenAndOddNumber {
    int number;

    FindEvenAndOddNumber(int number){
        this.number = number;

    }
    public void EvenOrOdd(){
        if(number%2==0){
            System.out.println("this is even number");
        }else{
            System.out.println("This is odd number");
        }
    }
    
    public static void main(String[] args) {
        FindEvenAndOddNumber evenOrOdd = new FindEvenAndOddNumber(35);
        evenOrOdd.EvenOrOdd();
       
        
    }
}
