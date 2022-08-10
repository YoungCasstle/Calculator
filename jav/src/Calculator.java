public class Calculator {
    public static int sum(int a, int b) {
        bolsheTen(a,b);
        return a + b;
    }

    public static int min(int a, int b) {
        bolsheTen(a,b);
        return a - b;
    }

    public static int mul(int a, int b) {
        bolsheTen(a,b);
        return a * b;
    }

    public static int div(int a, int b) {
        bolsheTen(a,b);
        return a / b;
    }

    public static void bolsheTen(int c,int h){
        if(c<=0||c>10||h<=0||h>10){
            throw new NumberFormatException("Vvedeni nevernie dannie");
        }
    }
}

