public class homework_27 {
    public static void main(String[] args) {
        for (int x = 1; x<=10; x++){
            System.out.println(x*3);
        }


        double result = 0;
        for (int y = 1; y<=100; y++) {
            result = result + y;
        }
        System.out.println("Среднее арифметическое суммы чисел от 1 до 100 = " + result / 100);



        int number = 400;
        int count = 0;
        while (number >= 50){
            number/=2;
            count++;
        }
        if (count>0){
            System.out.println("Получилось число: " + number);
            System.out.println("Количество итераций:" + count);
        }else{
            System.out.println("Вы ввели слишком маленькое число");
        }

    }

}
