package es.alns;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10;i++){
            //System.out.print("0 ");
            for (int j = 0; j < 10 ; j++) {
                if (i == 0 || j == 0 || i == 9 || j == 9) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}


