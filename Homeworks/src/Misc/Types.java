package Misc;

import java.util.OptionalInt;

public class Types {

    private static int anInt;
    private static final int x = 5;

    public static void main(String[] args) {
//        String s = "aaa";
        anInt = 5;
        byte b = 5;
        short sh = 1;
        char ch = 'A';
        long l = 3;
        float f = 0.1f;
        // x.fori
        for (int i = 0; i < anInt; i++) {

        }
        // x.arg
        smth(anInt);
        // x.sout
        System.out.println(anInt);
        // x.soutv
        System.out.println("x = " + x);
        // x.cast
        double y = ((double) anInt);
        // x.castvar
        double r = (double) anInt;
        // x.forr
        for (int i = x; i > 0; i--) {

        }
        // x.lambda
//        () -> x
        // x.opt
        OptionalInt.of(x);
        // x.par
//        (x)
        // x.return
//        return x;
        // x.serr
        System.err.println(x);
        // x.souf
        System.out.printf("", x);
        // x.switch
        switch (x) {

        }
        // x.try
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        // x.val
//        lombok.val x = Types.x;
        // x.var
        int x = Types.x;
        // x.
//        lombok.var x1 = x;


    }

    private static void smth(int x){
        System.out.println(x);
    }
}
