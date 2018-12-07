package threads;

public class Test {

    public void setI(int i) {
        this.i = i;
    }

    public int i;

    private static int ii = 2;

    Test(int i) {
//        this.i = i;
        setI(i);
    }


    @Override
    public boolean equals(Object obj) {

        return this.i == ((Test) obj).i;
    }

    @Override
    public int hashCode() {
        return i;
    }
}
