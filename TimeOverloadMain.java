import java.sql.Time;

public class TimeOverloadMain {

    public static void main(String args[]) {
        TimeOverload t1 = new TimeOverload(); // 00:00:00
        TimeOverload t2 = new TimeOverload(2);// 02:00:00
        TimeOverload t3 = new TimeOverload(21, 34);// 21:34:00
        TimeOverload t4 = new TimeOverload(12, 25, 42);// 12:25:42
        TimeOverload t5 = new TimeOverload(27, 74, 99);// 00:00:00
        TimeOverload t6 = new TimeOverload(t4);// 12:25:42
        Date d1 = new Date(7, 7, 2022);

        System.out.println("Constructed with:");
        System.out.println("Object t1: all arguments defaulted");
        System.out.printf("      %s\n", t1.toUniversalString());
        System.out.printf("      %s\n", t1.toString());

        System.out.println("Object t2: hour was entered");
        System.out.printf("      %s\n", t2.toUniversalString());
        System.out.printf("      %s\n", t2.toString());

        System.out.println("Object t3: hour and minute was entered");
        System.out.printf("      %s\n", t3.toUniversalString());
        System.out.printf("      %s\n", t3.toString());

        System.out.println("Object t4: hour and minute and second was entered");
        System.out.printf("      %s\n", t4.toUniversalString());
        System.out.printf("      %s\n", t4.toString());

        System.out.println("Object t5: hour and minute and second was entered but all values invalid");
        System.out.printf("      %s\n", t5.toUniversalString());
        System.out.printf("      %s\n", t5.toString());

        System.out.println("Object t6: passing in an Object of the TimeOverload class as a parameter");
        System.out.printf("      %s\n", t6.toUniversalString());
        System.out.printf("      %s\n", t6.toString());

        System.out.println("Object d1: Date class test");
        System.out.printf("Today's date      %s\n", d1.toString());
    }

}
