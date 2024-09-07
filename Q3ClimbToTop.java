public class Q3ClimbToTop {
    public static int ClimbToTop(int top){
        if(top == 1 || top == 2){
            return top;
        }

        // int[] n = new int[top];
        // n[0] = 1;
        // n[1] = 2;

        // for(int i = 2; i < n.length; i++){
        //     n[i] = n[i-1] + n[i-2];
        // }
        // return n[top-1];

        int[] n = new int[top + 1];
        n[1] = 1;
        n[2] = 2;

        for(int i = 3; i < n.length; i++){
            n[i] = n[i-1] + n[i-2];
        }
        return n[top];
    }
    public static void main(String[] args) {
        System.out.println("" + ClimbToTop(4));
    }
}
