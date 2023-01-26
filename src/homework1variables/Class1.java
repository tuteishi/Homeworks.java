package homework1variables;

public class Class1 {

    // объявление глобальных примитивных переменных
    private byte a1;
    private short b1;
    private int c1;
    private long d1;
    private float e1;
    private double f1;
    private char g1;
    private boolean h1;

    // объявление глобальных переменных со сслылочными типами данных
    String text1;
    Byte aa1;
    Short bb1;
    Integer cc1;
    Long dd1;
    Float ee1;
    Double ff1;
    Character gg1;
    Boolean hh1;

    public static void main(String[] args) {

        // объявление локальных примитивных переменных
        byte a2 = 33;
        short b2 = -32154;
        int c2 = 16484;
        long d2 = 1648944L;
        float e2 = 1.2F;
        double f2 = 23.55;
        char g2 = 0015;
        boolean h2 = true;

        // объявление локальных переменных со сслылочными типами данных
        String text2;
        Byte aa2;
        Short bb2;
        Integer cc2;
        Long dd2;
        Float ee2;
        Double ff2;
        Character gg2;
        Boolean hh2;

        // приведение к типам локальных переменных другого класса
        Class2 per = new Class2(); // взял экземпляр класса class2 с названием per

        per.setA((byte)(12));// присвоил значение и перевел в тип byte
        System.out.println(per.getA());

        per.setB((short)(1235));
        System.out.println(per.getB());

        per.setD(1564848);
        System.out.println(per.getD());

        per.setE((float)(123.55));
        System.out.println(per.getE());

        per.setF(1583.55);
        System.out.println(per.getF());

        per.setG((char)(1475));
        System.out.println(per.getG());

        per.setH(true);
        System.out.println(per.isH());

        // приведение к типам оберток
        per.setAa((byte)(127));
        System.out.println(per.getAa());

        per.setBb((short)(758));
        System.out.println(per.getBb());

        per.setCc(654654);
        System.out.println(per.getCc());

        per.setDd(15151553L);
        System.out.println(per.getDd());

        per.setFf(125.5);
        System.out.println(per.getFf());

        per.setGg((char)(005F));
        System.out.println(per.getGg());

        per.setHh(true);
        System.out.println(per.getHh());

        // присвоение переменных друг в друга

        per.setB(a2);
        System.out.println("1.Результат перевода из byte в short: " + per.getB());

        per.setC(b2);
        System.out.println("2.Результат перевода из short в int (по умолчанию): " + per.getC());

        per.setC(g2);
        System.out.println("3.Результат перевода из char в int: " + per.getC());

        per.setE(c2);
        System.out.println("4.Результат перевода из int в float: " + per.getE());

        per.setD(c2);
        System.out.println("5.Результат перевода из int в long: " + per.getD());

        per.setF(c2);
        System.out.println("6.Результат перевода из int в double: " + per.getF());

        per.setF(d2);
        System.out.println("7.Результат перевода из long в double: " + per.getF());

        per.setE(d2);
        System.out.println("8.Результат перевода из long в float: " + per.getE());
        /*  per.setA(c2);
        System.out.println(" Ошибочный результат перевода из short в byte : " + per.getA()); */

    }
}

