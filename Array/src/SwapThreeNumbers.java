public class SwapThreeNumbers {
    public static void main(String[] args) {
    	int a = 1;
    	int b = 2;
    	int c = 3;
    	
    	int[] temp = {a,b,c};
    	
    	a = temp[1];//2
    	b = temp[2];//3
    	c = temp[0];//1
    	
    	System.out.println("a: " +a);
    	System.out.println("b: " +b);
    	System.out.println("c: " +c);
    	
    }
}
