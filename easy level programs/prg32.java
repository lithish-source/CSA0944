// 32. Simple Interest
class SimpleInterest {
    static double calc(double p, int y, boolean senior) {
        double r = senior ? 12 : 10;
        return (p * r * y) / 100;
    }

    public static void main(String[] args) {
        double p = 200000;
        int y = 3;
        boolean senior = false;

        System.out.println("Interest: " + calc(p, y, senior));
    }
}