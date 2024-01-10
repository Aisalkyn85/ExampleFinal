public class ReverseNumber {
    int number;
    ReverseNumber(int number){
this.number=number;
    }
    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber(455);
        //reverseNumber.ReverseNubmerMethod();
        //reverseNumber.ProductOfNumber();
        ReverseNumber palindrom = new ReverseNumber(5);
       // palindrom.ObjectPalindromNumber();
       // palindrom.ArmstrongNumber();
        palindrom.Factorial();
        
    }
    public void ReverseNubmerMethod(){
        int reverse = 0;
        int reminder=0;
        while(0<number){
            reminder=number%10;
            reverse=reverse*10+reminder;
            number/=10;
        }
        System.out.println(reverse);
    }
    public void ProductOfNumber(){
        int reminder = 0;
        int reversed = 1;
        while(0<number){
            reminder=number%10;
            reversed=reversed*reminder;
            number/=10;
        }
        System.out.println(reversed);
    }
    public void ObjectPalindromNumber(){
        int reminder = 0;
        int reversed = 0;
        int original = number;
        while(0<number){
            reminder=number%10;
            reversed=reversed*10+reminder;
            number/=10;
        }
        if(original==reversed){
            System.out.println("this is palindrom Number "+original);
        }else{
            System.out.println("this is not palindrom number");
        }
    }
    public void ArmstrongNumber(){
        int reminder = 0;
        int reversed = 0;
        while(0<number){
            reminder=number%10;
            reversed=reversed+reminder;
            number/=10;
        }
        System.out.println(reversed);
    }
    public void Factorial(){//5=1*2*3*4*5
        
        long reversed = 1;
        for(int i=1;i<=number;i++){
       
           reversed=reversed*i;
    }
    System.out.println(reversed);
    }
    
}
