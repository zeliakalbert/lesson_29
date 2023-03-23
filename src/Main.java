public class Main {
    public static void main(String[] args) {
        int x = 2;
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");

        for (int i = 1; i<11; i++){
            System.out.println(i*3);

        }

        while (x<5){
            System.out.println("you are the best!");
            x= x+2;

        }
        int result = 0;
        for(int k = 2; k<=10; k= k+2){

            result = result+k;

        }
        System.out.println("sum from 1 till 10 = " + result);
        int result_2 = 0;
        for(int k = 1; k<=10; k++){
            if (k%2==0)

                result_2 = result_2+k;

            }
            System.out.println("sum from 1 till 10 = " + result_2);

        int y = 8;
        do {
            System.out.println(y);
            y--;
        }while (y>12);

        String [] names = new String[]{"Rimma", "Armen", "Virmen"};
        String name1 = "Rimma";
        String name2 = "Armen";
        String name3 = "Virmen";

        System.out.println("Hello " + names[2]);

        for (int f = 0; f < names.length; f++){

            System.out.println(names[f] + ", You are the best");
        }


    }
}