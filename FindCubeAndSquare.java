public class FindCubeAndSquare {
    int number;
    FindCubeAndSquare(int number){
        this.number=number;
    }
    public static void main(String[] args) {
        FindCubeAndSquare findCubeAndSquare = new FindCubeAndSquare(6);
        findCubeAndSquare.Cube();
        findCubeAndSquare.square();
        

        
    }
    public void Cube(){
        int sumOfCube=0;
        sumOfCube=sumOfCube+(number*number*number);
        System.out.println(sumOfCube);
    }
    public void square(){
        int sumOfSquare = 0;
        sumOfSquare=sumOfSquare+(number*number);
        System.out.println(sumOfSquare);
    }
    
    
}
