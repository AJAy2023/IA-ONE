class DivideByZeroException extends Exception
{
      public  DivideByZeroException(String message)
       {
               super(message);
         }
 }
           class dze
             {
              public static void main(String args[])
               {
                   int numerator = 5;
                   int denominator = 0;
                  try
                   {
                      if(denominator == 0){
                    throw new  DivideByZeroException("Error:cannot divide a number by zero.");
                    }
                        int answer = numerator / denominator;
                       System.out.println("Result : " + answer);
                      }
                         catch( DivideByZeroException ex)
                          {
                             System.out.println(ex.getMessage());
                           }
                 }
             }