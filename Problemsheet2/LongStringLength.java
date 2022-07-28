/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20pt02
 */
public class LongStringLength 
{
    static int[] columnMax(String[][] a)
    {
        int cols = a[0].length;
        int rows = a.length;
        int arr[];
        arr = new int[cols];
        String word;
        for(int i = 0;i<cols;i++)
        {
            int maxLength = 0;
            for(int j = 0;j<rows;j++)
            {
                word = a[j][i];
                if(word.length() > maxLength)
                {
                    maxLength = word.length();
                }
            }
            arr[i] = maxLength;
        }
        return arr;
    }
    
    public static void main(String[] args)
    {
        String[][] a = 
        {{"help", "ok", "city lights","summer"},
         {"elvisLives", "hello", "punch-out","pretty"},
         {"hurrah", "humptydumpty", "123","brothers"}};
        int[] arr = columnMax(a);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
