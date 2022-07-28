class Matrix{
    public static void main(String[] args) {
        int arr[][] = { {4,7,1,8},
                        {3,8,9,5},
                        {1,3,4,5},
                        {8,1,5,6},
                        {0,0,0,0}};
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println(rows + " " + cols);
        for(int i = 0;i < rows - 1;i++)
        {
            for(int j = 0;j < cols;j++)
            {
                arr[rows-1][i] += arr[j][i];
            }
        }
        for(int i = 0;i < rows;i++)
        {
            for(int j = 0;j < cols;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
