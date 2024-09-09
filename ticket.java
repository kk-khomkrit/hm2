import java.util.*;

/**
 * ticket
 */
public class ticket {

    public static void main(String[] args) {
        Scanner ticket_cal=new Scanner(System.in);
        int discount = 0;
        float total_discount =0;

        System.out.print("กรอกราคาตั๋ว: ");
        int ticket_price=ticket_cal.nextInt();

        System.out.print("กรอกจำนวนคน: ");
        int people_amount=ticket_cal.nextInt();

        if (people_amount>=8) {
            discount=ticket_price*people_amount*5/100;
            total_discount=ticket_price*people_amount-discount;

            System.out.println("ราคาเต็ม: "+ticket_price*people_amount);
            System.out.println("ส่วนลดที่ได้รับ: 5%");
            System.out.println("ลดเหลือ: "+total_discount+" คนละ: "+total_discount/people_amount);
        }
        else {
            System.out.println("ราคาเต็ม: "+ticket_price*people_amount);
            System.out.println("ไม่มีส่วนลด");
            System.out.println("คนละ: "+ticket_price*people_amount/people_amount);
        }
    }
}