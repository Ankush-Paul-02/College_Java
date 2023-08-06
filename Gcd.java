class Find {
    private int x, y;

    Find(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int findGcd() {
        while(y != 0) {
            int temp = y;
            y = x%y;
            x = temp;
        }
        return x;
    }
}

public class Gcd {
    public static void main(String[] args) {
        Find find = new Find(27, 9);
        System.out.println("Gcd is: " + find.findGcd());
    }
}
