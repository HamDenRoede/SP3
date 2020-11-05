import java.util.Scanner;


public class Console
{
    public void console()
    {

        Scanner sc = new Scanner (System.in);
        boolean running = true;

        while (running)
        {
            System.out.println("Mario's Pizzabar");
            System.out.println("----------------");
            System.out.println("1) Show Menu");
            System.out.println("2) Create order");
            System.out.println("3) Status / Finish order / Cancel");
            System.out.println("4) Show: End of day");
            System.out.println("5) Exit");
            System.out.println("----------------");
            System.out.println("(Please choose an option 1-5)");

        }
            //This command prints a full list of the restaurant's menu.
            //Done.
            String cmd = sc.nextLine();
            if (cmd.equals("1"))
            {
                System.out.println(" 1.  Vesuvio:      tomatsauce, ost, skinke og oregano                             -  57,-\n" +
                                   " 2.  Amerikaner:   tomatsauce, ost, oksefars og oregano                           -  53,-\n" +
                                   " 3.  Cacciatora:   tomatsauce, ost, pepperoni og oregano                          -  57,-\n" +
                                   " 4.  Carbona:      tomatsauce, ost, kødsauce, spghetti, coktailpølser og oregano  -  63,-\n" +
                                   " 5.  Dennis:       tomatsauce, ost, bacon og oregano                              -  65,-\n" +
                                   " 6.  Bertil:       tomatsauce, ost, bacon og oregano                              -  57,-\n" +
                                   " 7.  Silvia:       tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano  -  61,-\n" +
                                   " 8.  Victoria:     tomatsauce, ost, skinke, ananas, champignon, løg og oregano    -  61,-\n" +
                                   " 9.  Toronfo:      tomatsauce, ost, skinke, bacon, kebab, chili og oregano        -  61,-\n" +
                                   " 10. Capricciosa:  tomatsauce, ost, skinke, champignon og oregano                 -  61,-\n" +
                                   " 11. Hawai:        tomatsauce, ost, skinke, ananas og oregano                     -  61,-\n" +
                                   " 12. Le Blissola:  tomatsauce, ost, skinke, rejer og oregano                      -  61,-\n" +
                                   " 13. Venezia:      tomatsauce, ost, skinke, bacon og oregano                      -  61,-\n" +
                                   " 14. Mafia:        tomatsauce, ost, pepperoni, bacon, løg og oregano              -  61,-");
            ]


            //This command allows the user to create an order. An order can contain both a singular or multiple pizzas.
            //Work in progress
            if(cmd.equals("2"))
            {
                System.out.println("");
            }

            //This command allows the user to monitor the status of the pizzas being made, finish up or cancel an order.
            //Work in progress
            if(cmd.equals("3"))
            {
                System.out.println("");
            }

            //This command allows the user to see a full list of orders made that day. It is sorted by (military)time.
            //Work in progress
            if(cmd.equals("4"))
            {
                System.out.println("");
            }

            //This command stops running the "Menu" program.
            //Done.
            else if (cmd.equals("5"))
            {
                running = false;
            }
        }
}