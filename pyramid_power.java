import java.util.Scanner;

public class pyramid_power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 8;
        int with_j;
        int with_e;
        int e = 0;
        int m;
        with_j = num;
        with_e = 0;
        int with_m;
        with_m = 0;

        for (int i = 0; i <= num; i++) {
            // (ลูปนอก ชั้นที่ 1 ถึง 8) (ได้ค่า i มาใช้ 9 ตัว)(0-8)
            for (int j = num - i; j > 0; j--) {
                // (บล๊อกนี้ จะได้ค่า i มาใช้ทั้ง 9 ตัวเช่นกัน)
                /*
                 * / (ทำให้ช่องว่างชั้นบนสุดมีความยาวที่สุด และลดลงในแต่ละบรรทัด
                 * อ้างอิงค่าจาก numที่มีถึง8 และลบออกด้วย i(0-8) ในแต่ละบรรทัด)/
                 */
                /*
                 * / เช่น บรรทัดแรก i = 0 ; j = 8-0 = 8
                 * บรรทัดถัดสอง i = 1 ; j = 8-1 = 7
                 * /
                 */
                System.out.print("     ");
            }
            for (int j = 0; j <= i; j++) {
                /* / เริ่มบรรทัดแรกที่ j = 0 เอาไปเทียบ i ทั้ง 9 ตัว จากนั้นเอามายกกำลัง 2/ */
                System.out.printf("%5d", (int) Math.pow(2, j));
                // ลูป 2 ยกกำลัง n
            }

            for (int j = i - 1; j >= 0; j--) {
                //
                System.out.printf("%5d", (int) Math.pow(2, j));
            }
            System.out.println("");

        }

    }
}
