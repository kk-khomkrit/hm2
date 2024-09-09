import java.util.*;


public class month {
    public static void main(String[] args) {
        Scanner month_key=new Scanner(System.in);
        System.out.print("ระบุเดือน(ตัวเลข): ");
        int month=month_key.nextInt();

        switch (month) {
            case 1:
                System.out.println("มกราคม");
                break;
        
            case 2:
                System.out.println("กุมภาพันธ์");
                break;
            case 3:
            System.out.println("มีนาคม");
            break;
            case 4:
            System.out.println("เมษายน");
            break;
            case 5:
            System.out.println("พฤษภาคม");
            break;
            case 6:
            System.out.println("มิถุนายน");
            break;
            case 7:
            System.out.println("กรกฎาคม");
            break;
            case 8:
            System.out.println("สิงหาคม");
            break;
            case 9:
            System.out.println("กันยายน");
            break;
            case 10:
            System.out.println("ตุลาคม");
            break;
            case 11:
            System.out.println("พฤศจิกายน");
            break;
            case 12:
            System.out.println("ธันวาคม");
            break;
            default:
            System.out.println("ไม่มีเดือนนี้ค่ะพี่");
                break;
        }
    }
}
