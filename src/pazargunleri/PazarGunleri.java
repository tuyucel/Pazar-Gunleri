package pazargunleri;

/**
 *
 * @author tuyucel
 *
 */
public class PazarGunleri {

    public static boolean artikYil(int yil) {
        return yil % 4 == 0 && yil % 100 != 0 || yil % 400 == 0 && yil % 4000 != 0;

    }

    public static void main(String[] args) {

        int gun = 1;
        int ilkYil = 1900, ikinciYil = 2000;
        int[] ayKacGun;
        ayKacGun = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int yil = ilkYil; yil <= ikinciYil; yil++) {
            if (artikYil(yil)) {
                ayKacGun[1] = 29;
            } else {
                ayKacGun[1] = 28;
            }
            int ay = 0;
            while (ay < ayKacGun.length) {

                gun += ayKacGun[ay];
                if (gun % 7 == 0 && ay == 11) {
                    System.out.println("01." + (ay - 10) + "." + (yil + 1) + " - Pazar");
                } else if (gun % 7 == 0) {
                    System.out.println("01." + (ay + 2) + "." + yil + " - Pazar");
                }
                ay++;
            }
        }
    }

}
