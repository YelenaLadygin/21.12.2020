//Task17:
       Random r = new Random() ;
        int agrala;
        do {
             agrala = r.nextInt(20) + 10;
            System.out.println(agrala);
        }
        while (agrala!=15);
        System.out.println( "Goodbye... ");

        
   //Task14: 
      Scanner s = new Scanner(System.in);
      System.out.println(" Enter 2 int numbers :");
      int a = s.nextInt();
      int b = s.nextInt();
        if (a < b)
            System.out.printf(" %d ,% d", a, b);
        else
          System.out.printf(" %d ,% d", b,a);
          
   //Task 18: 
       Scanner s = new Scanner(System.in);
      System.out.println(" Enter  int numbers :");
      int num = s.nextInt();
      switch (num) {
          case 1:
              System.out.println("One");
              break;
          case 2:
              System.out.println("Two");
              break;
          case 3:
              System.out.println("Three");
              break;
          default:
              System.out.println("unknown number");
           }
          System.out.println( "Goodbye... ");
        
  //Task 19: 
         Scanner s = new Scanner(System.in);
        int num ,sum =0 ;
         while(true) {
            System.out.println("Enter the number: ");
            num = s.nextInt();
            sum += num;
            if (num == 0)
            break;
           }
        System.out.println(sum);
        
   //Task 13: 
       System.out.print( "Enter 3 int numbers: ");
       int a = s.nextInt();
       int b = s.nextInt();
       int c = s.nextInt();
        if (a > b && a < c || a < b && a > c)
            System.out.println("The number is:"+ " " + a);
        else if (b > a && b < c || b < a && b > c )
            System.out.println("The number is:"+ " " + b);
        else
           System.out.println("The number is:"+ " " + c);
        System.out.println( "Goodbye... ");
        
// Task 20 : 
       System.out.print( "Enter number from 100 - 999: ");
       int a = s.nextInt();
       if ( a >=100 && a <= 999)
            System.out.println("The number = "+ " " + a/100);
       else
           System.out.println("The wrong number" );
           System.out.println( "Goodbye... ");
           
 // Task 21: 
        Scanner s = new Scanner(System.in);
        int grade = 0;
        int sum =0;
        int count=0;
         while  (grade!=-1) {
            System.out.println(" enter grade :");
            grade = s.nextInt();
            if ( grade==-1)
            break;
            sum += grade;
            count ++;
        }
        System.out.println(" overage is  " + sum / count);
        System.out.println("Goodbye... ");

 // Task22: 
         Scanner in = new Scanner(System.in);
         System.out.println(" Enter the number:");
         int num = in.nextInt();
         int result = 1;
            for (int i = 1; i <= num; i++) {
                result = result * i;
               }
             System.out.println(" Factorial is:" + result);
             
     //Task 25:
         Scanner in = new Scanner(System.in);
          int temperature = 0;
          int a  = 0;
          int b = 0;
         while (temperature!= -1) {
             System.out.println(" Enter the temperature:");
             temperature = in.nextInt();
             if (temperature == -1)
                 break;
             if (temperature <= 37) {
                 System.out.println(" Welcome");
                 a++;
             }
             else {
                 System.out.println("Sorry, you can not enter");
                 b++;
             }
         }
       System.out.println(String.format(" Allowed to enter : %d  clients  ", a));
       System.out.println(String.format(" Not allowed to enter : %d  clients  ", b));
       
  //Task 23: 
       Scanner s = new Scanner(System.in);
       System.out.println(" enter the number");
       int t = s.nextInt();
       for (int i = 0; i <= 10; i ++) {
            int q = s.nextInt();
            if (q < 0)
                break;
            if (q > t) {
                t = q;
            }
        }
        System.out.println(String.format(" MAX number is : %d  ", t));
        
  // Task 26: 
        Scanner s = new Scanner(System.in);
        System.out.println(" enter 3  int numbers 1-100 :");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        Random r = new Random();
        int agrala1 = r.nextInt(100);
        int agrala2 = r.nextInt(100);
        int agrala3 = r.nextInt(100);
        int i = 0;
            if ( a==agrala1|| a==agrala2||a==agrala3)
                i++;
            else i=0;
             if (b==agrala1|| b==agrala2|| b==agrala3)
                i++;
             else i= i+0;
           if (c==agrala1||c==agrala2||c==agrala3)
                i++;
           else i= i+0;
           if (i==0)
               System.out.println(" sorry, you lost ");
           else if (i==1)
               System.out.println(" You won 100 NIS");
           else if (i==2)
               System.out.println (" You won 100,000 NIS ");
           else
               System.out.println(" You won 1,000,000 NIS");
             System.out.println(String.format(" The numbers of agrala : %d,%d,%d", agrala1, agrala2, agrala3));
               
   // Task 24: 
        Scanner s = new Scanner(System.in);
        System.out.println(" enter  the length:");
        int a = s.nextInt();
        while ( a > 0 ) {
            System.out.print("-");
            a--;
        }



        
