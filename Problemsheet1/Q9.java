class Q9{
    public static void main(String[] args) {
        System.out.println("A B POW(A,B)");
        for(int i=1;i<=7;i++)
        {
            int j = i+1;
            int val = (int)Math.pow(i,j);
            System.out.println(i +" "+ j + " " + val);
        }
    }
}
