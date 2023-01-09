import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int lays =100;
        int cola = 60;
        int chocolate = 40;
        int coin=0;
        torgAvtomat(lays, cola, chocolate);
        money(lays, cola, chocolate, coin);
    }
    static void torgAvtomat(int lays, int cola, int chocolate){
        System.out.println("Product list");
        System.out.println("Lays: " + lays);
        System.out.println("Cola: " + cola);
        System.out.println("Chocolate: " + chocolate);

    }
    static void money(int lays, int cola, int chocolate, int coin) throws IOException {
        System.out.println("What do you want to do?");
        System.out.println("The machine accepts coins with a face value of 20");
        System.out.println("put a coin - 1");
        System.out.println("Exit - 0");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        if (s==1){
            product(lays, cola, chocolate, coin);
        }else if (s==0){
            System.out.println("Good bye");
        }
    }
    static void product(int lays, int cola, int chocolate, int coin) throws IOException {
        coin +=20;
        System.out.println("coin: "+ coin);
        if(coin == 40 && coin <60 ){
            System.out.println("to choose chocolate: 40 - 1");
            System.out.println("to choose cola: 60 - more coin - 2");
            System.out.println("to choose lays: 100 - more coin - 3");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int s = Integer.parseInt(br.readLine());
            if (s==1){
                System.out.println("Buy a chocolate: 40");
                coin -=40;
                System.out.println("coin: " + coin);
            }else {
                product(lays, cola, chocolate, coin);
            }
        }else if (coin ==60 && coin < 100){
            System.out.println("to choose chocolate: 40 - 1");
            System.out.println("to choose cola: 60 - 2");
            System.out.println("to choose lays: 100 - more coin - 3");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int s = Integer.parseInt(br.readLine());
            if (s==1){
                System.out.println("Buy chocolate: 40");
                coin -=40;
                System.out.println("coin: " + coin);
            }else if (s==2){
                System.out.println("Buy cola: 60");
                coin -=60;
                System.out.println("coin: " + coin);
            }else {
                product(lays, cola, chocolate, coin);
            }
        }else if (coin==100){
            System.out.println("to choose chocolate: 40 - 1");
            System.out.println("to choose cola: 60 - 2");
            System.out.println("to choose lays: 100 - 3");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int s = Integer.parseInt(br.readLine());
            if (s==1){
                System.out.println("Buy chocolate: 40");
                coin -=40;
                System.out.println("coin: " + coin);
            }else if (s==2){
                System.out.println("Buy cola: 60");
                coin -=60;
                System.out.println("coin: " + coin);
            }else if(s==3){
                System.out.println("Buy lays: 100");
                coin -=100;
                System.out.println("coin: " + coin);
            }else {
                System.out.println("try again");
            }
        }else if(coin < 40){
            System.out.println("more coin");
            product(lays, cola, chocolate, coin);
        }else {
            System.out.println("Try agin");
        }
    }
}