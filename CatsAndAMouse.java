public class CatsAndAMouse {
    static String catAndMouse(int x, int y, int z) {
        int d1 = Math.abs(x-z);
        int d2 = Math.abs(y-z);
        if(d1 == d2)
            return "Mouse C";
        else if(d1 < d2)
            return "Cat A";
        else
            return "Cat B";

    }
}
