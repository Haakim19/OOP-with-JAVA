

public class Test_20240526172623{
    public static void main(String[] args) {
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
  