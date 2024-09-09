import java.util.*;

/**
 * bonus
 */
public class bonus {

    public static void main(String[] args) {
        Scanner cash_bonus=new Scanner(System.in);
        System.out.print("ระบุเงินเดือน: ");
        int payment=cash_bonus.nextInt();
        System.out.print("ระบุระยะเวลาที่ทำ(ปี): ");
        int year=cash_bonus.nextInt();

        if(year>=1&&year<=5) {
            int percent = payment*10/100;
            int total=payment+percent;
            System.out.println("เงินที่ได้(+10%): "+total);
        }
        if (year>=6&&year<=15) {
            int percent = payment*20/100;
            int total = payment+percent;
            System.out.println("เงินที่ได้(+20%): "+total);
        }
        if (year>=16) {
            int percent=payment*40/100;
            int total=payment+percent;
            System.out.println("เงินที่ได้(+40%): "+total);
        }
    }
}