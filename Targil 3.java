  //Task 27: 
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter hours : ");
        int hours = s.nextInt();
        System.out.println(" Enter tarif : ");
        int tarif = s.nextInt();
        int salary = tarif*hours;
        if (salary < 1000) {
            System.out.println(" Salary is : " + salary * 0.98 + " NIS" );
        }
           else if (salary > 1000 && salary < 5000) {
                System.out.println(" Salary is : " + salary * 0.9 + " NIS");
            } else
                System.out.println(" Salary is : " + salary * 0.8 + " NIS");
        }
