

public class Test_20240526171809{
    public static void main(String[] args) {
   /*  int a = 20 ;
    int b = 10 ;
    if (a > b)
    {
      System.out.println("a is grater than b");
    }
    else
    {
      System.out.println("b is grater then a");
    }
    int arr[] = {1 , 2 , 3 , 4 , 5};
    for (int i = 0 ; i < 5 ; i++)
    {
      for (int j = 0 ; j <= i ; j++)
      {
        System.out.print(arr[i]);
      }
      System.out.print("\n");
    }*/
    int [] [] x = new int [3] [3] ;
    int num = 1 ;
    for (int i = 0 ; i < 3 ; i++)
    {
      for (int j = 0 ; i < 3 ; j++)
      {
        x[i][j] = num;
        ++num;
      }
    }
    for (int i = 0 ; i < 3 ; i++)
    {
      for (int j = 0 ; j < 3 ; j++)
      {
        System.out.print(x[i][j]+ "");
      }
      System.out.println("");
    }
  }
}
  