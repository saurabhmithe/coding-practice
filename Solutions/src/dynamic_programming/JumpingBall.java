package dynamic_programming;

public class JumpingBall {

    // You’re given a flat runway with a bunch of spikes in it. The runway is represented by a boolean array which
    // indicates if a particular (discrete) spot is clear of spikes. It is True for clear and False for not clear.

    // You’re given a starting speed S. S is a non-negative integer at any given point and it
    // indicates how much you will move forward with the next jump.

    // Every time you land on a spot, you can adjust your speed by up to 1 unit before the next jump.

    // You want to safely stop anywhere along the runway (does not need to be at the end of the array).
    // You stop when your speed becomes 0. However, if you land on a spike at any point,
    // your crazy bouncing ball bursts and it’s a game over.
    // The output of your function should be a boolean indicating
    // whether we can safely stop anywhere along the runway.

    public static void main(String[] args) {
        JumpingBall jumpingBall = new JumpingBall();
        boolean[] a = {true, false, true, true, true, false, true, true, false, true, true, true,
                false, true, true, true, false, true, true, false, true, true};
        System.out.println(jumpingBall.canStop(a, 10, 0));
    }

    public boolean canStop(boolean[] a, int s, int p) {
        if (p >= a.length) return s == 0;
        if (a[p] == false) return false;
        if (s == 0) return true;

        return canStop(a, s, p + s) || canStop(a, s - 1, p + s - 1) || canStop(a, s + 1, p + s + 1);

    }
}
