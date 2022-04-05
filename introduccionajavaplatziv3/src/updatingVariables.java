public class updatingVariables {
    public static void main(String[] args) {
        int  salary = 1000;

        //bono 200
        salary = salary +200;

        System.out.println(salary);
        //le  quitamos  50 pesos  de pension

        salary= salary - 50;

        System.out.println(salary);

        //bono de   2  horas  30 pesos  cada  una y  ademas  tiene  un cupon  de comida que   vale 45 pesos

        salary = salary+( 30*2) -45;

        System.out.println(salary);
    }
}
