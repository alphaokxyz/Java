public class GetSum {
    public static void main(String args[]){
        int x = 1;
        int sum = 0;
        while (x <= 1000){
            sum = sum + x;
            x = x + 1;
        }
        System.out.println("sum = "+ sum);
    }
    
}
