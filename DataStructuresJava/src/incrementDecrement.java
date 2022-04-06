public class incrementDecrement {
    public static void main(String[] args) {
        int lives =5;
        lives =lives -1;

        System.out.println(lives);
        lives --;
        System.out.println(lives);
        lives ++;
        System.out.println(lives);

        int gift = 100;

        //prefijo
        //gana una vida   gana  un  un regalo

        gift = gift  +lives++;
        System.out.println(gift);

    }
}
