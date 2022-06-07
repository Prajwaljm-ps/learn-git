package Basics;

public class variables_datatype_and_operators {
    public static void main(String[] args){
        int a = 9, b = 9;
        String word = "Mango";
        char letter = 's';
        double c = 7.8, d = 8.3;
        int e = a+(int)c; //typecasting
        boolean truth = false;
        float f = 0xf;

        System.out.println("a+b = "+(a+b));
        System.out.println("a+c = "+(a+c));
        System.out.println("e = "+e);
        System.out.println("word = "+word);
        System.out.println(word+letter);
        word += letter; //compound operator
        System.out.println("new word = "+word);
        System.out.println(truth);
        System.out.println("f="+f);

        int r1 = a/b; //expect r1 = 1
        int r2 = ++a; //expect r2=10 and a=10
        int r3 = a++ + a; //expect r3 = 21 and a=11
        int r4 = b&(3^2); //expected 1
        a++;
        boolean r5 = d>=c && (a&1)==0; //expected r5 = true

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

        int ter = a>=b ? 1 : 0;
        System.out.println(ter);

    }
}
