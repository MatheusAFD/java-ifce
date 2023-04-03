
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class SomaDosDigitos
{
    public static void main(String[] args) {
        System.out.println("A soma dos dígitos  é " + digitSum(7901) + ".");
    }
    
    public static int digitSum(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + digitSum(n / 10);
        }
    }
}
