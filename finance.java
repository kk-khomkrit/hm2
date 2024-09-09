import java.util.*;

/**
 * finance
 */
public class finance {

    public static void main(String[] args) {
        Scanner finance_cal=new Scanner(System.in);
        int i=0;

        for(i=0; i<5; i++) {
        System.out.println();
        System.out.print("ระบุราคาของรถ: ");
        int car_price=finance_cal.nextInt();
        System.out.print("ระบุเงินดาวน์(%): ");
        float down_price=finance_cal.nextFloat();
        float cal=car_price*down_price/100;
        float finance=car_price-cal;
        System.out.print("ระบุจำนวนเดือน: ");
        int month=finance_cal.nextInt();
        System.out.print("ระบุดอกเบี้ย(%): ");
        float interest=finance_cal.nextFloat();
        

        float month_pay=finance/month;
        float interest1=month_pay*interest/100;
        float total=month_pay+interest1;

        System.out.println();
        System.out.println("----- สรุป -----");
        System.out.println("เงินดาวน์: "+cal);
        System.out.println("ไฟแนนซ์: "+finance);
        System.out.println("เป็นเวลา: "+month+" เดือน");
        System.out.println("รายจ่ายต่อเดือน: "+month_pay);
        System.out.println("ดอกเบี้ย: "+interest1);
        System.out.println("รายจ่ายต่อเดือนรวมดอก: "+total);
    }
}
}