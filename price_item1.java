import java.util.*;

/**
 * price_item
 */
public class price_item1 {

    public static void main(String[] args) {
        Scanner item_cal=new Scanner(System.in);
        System.out.print("ระบุราคาสินค้า: ");
        int item_price=item_cal.nextInt();
        System.out.print("ระบุ % ความเสื่อมต่อปี: ");
        float percent=item_cal.nextFloat();

        int year=1;

        for(year=1;year<6;year++){
            float lost=percent*year;
            float cal=item_price*lost/100;
            float value=item_price-cal;
            System.out.println("ปี:"+year+" ราคา: "+item_price+" ค่าเสื่อม: "+lost+"% มูลค่า: "+value);
        }
    }
}