
class RollDie {
    public static void main(String[] args) {
        int SIDES = 6;
        int roll = (int) (Math.random() * SIDES) + 1;
        System.out.println("The number die rolled getting: "+ roll);

    }
}
