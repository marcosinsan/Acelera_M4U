package revisaogeral;

public class Fibonacci {

    static long fibo (int n) {

        if (n < 2) {
            return n;
        } else {
            return fibo(n -1) + fibo(n -2);
        }
    }

    public static void main(String[] args) {

        //Teste

        for(int i = 0; i < 20; i++) {
            System.out.println("(" + i + "): " + Fibonacci.fibo(i) + "\t");
        }
    }
}
