class Prime{
    
    static boolean checkPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for range:");
        System.out.print("r1:");
        int r1 = sc.nextInt();
        System.out.print("r2:");
        int r2 = sc.nextInt();
        System.out.println("The prime numbers between " + r1 + " and "+ r2 + " are:");
        for(int i = r1; i<= r2 ; i++)
        {
            if(checkPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        
    }
}
