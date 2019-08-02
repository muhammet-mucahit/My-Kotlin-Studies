/**
 * Created by mucahit on 29.07.2017.
 */
public class Main {

    public static void main(String[] args){

        //int max_num = TestKt.max(10, 15);
        int max_num = KotlinFile.max(10, 15);

        System.out.println("We are in Java " + max_num);

        int totalCost = KotlinFile.totalCost(55, 55);
        System.out.println("We are in Java " + totalCost);

        // This usage is wrong.
        //int totalCost2 = KotlinFile.totalCost(55);

    }
}
