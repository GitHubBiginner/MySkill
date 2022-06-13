import java.util.Random;

public class Main{
    public static void main(String[] args) {
        System.out.println("1~10の数字を繰り返す");
        System.out.println("");
        /* 1~10までの繰り返し */
        for(int i = 0; i < 10; i++) {
            System.out.println(i+1);
        }
        /* 1~10と表示される */

        System.out.println("");
        System.out.println("1~20までの数字で10以上の奇数のみを取り出す");
        System.out.println("");
        /* 1~20までの数字で10以上の奇数のみを取り出す */
        int a = 20;
        while(a >= 10) {
            if(!(a%2 == 0)) {
                System.out.println(a);
            }
            a--;
        }
        /* 1~20までの数字で10以上の奇数のみを取り出せる */

        System.out.println("");
        /* ランダムな1~100の数値を取得 */
        Random r = new Random();
        int random = r.nextInt(100) + 1;
        if(random >= 75) {
            System.out.println(random + "は75以上の数値");
        } if(random >= 50 && random <= 75) {
            System.out.println(random + "は50以上75以下の数値");
        } if(random <= 50) {
            System.out.println(random + "は50以下の数値");
        }

        System.out.println("");
        /* 配列を作成 */
        String[] array = {"山田", "田中", "坂本", "中野", "後藤", "本田"};
        /* 配列の中身の取り出し */
        for(String s : array) {
            System.out.println(s);
        }
        /* 「本」と「田」を含むものを除く */
        System.out.println("");

        /* 「本」と「田」を含むものを除いて取り出す */
        for(String s : array) {
            boolean b1 = s.contains("本");
            boolean b2 = s.contains("田");
            if(!b1 && !b2) {
                System.out.println(s);
            }
        }
    }
}