public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        System.out.println(h.hp + h.name);
        h.attack();

        /* 参照された型の方を優先 メソッドはオーバーライドされる */
        Hero h1 = new SuperHero();
        System.out.println(h1.hp + h1.name);
        h1.attack();

        SuperHero h2 = new SuperHero();
        System.out.println(h2.hp + h2.name);
        h2.attack();
    }
}