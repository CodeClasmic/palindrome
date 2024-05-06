class palinrome
{
    public static void main(String[] args) {
        int x=121;
        int t=x,c=0;
        System.out.println();
        while (x!=0)
        {
            int d=x%10;
            c=c*10+d;
            x=x/10;
        } 
        System.out.println(c);
        if (t==c) {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}