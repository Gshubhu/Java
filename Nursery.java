import java.util.Scanner;
import java.util.ArrayList;
public class Nursery 
{
    ArrayList<String> Pname=new ArrayList<String>();
    ArrayList<String> Pcode=new ArrayList<String>();
    ArrayList<Double> Price=new ArrayList<Double>();
    ArrayList<Integer> Quantity=new ArrayList<Integer>();
    ArrayList<Double> Total_Price=new ArrayList<Double>();
    double Total_bill=0.0;
    Scanner sc = new Scanner(System.in);
    static Nursery obj= new Nursery();
    void Welcome()
    {
        System.out.println("***************************************************************************");
        System.out.println("*--------------------WELCOME TO OUR NURSERY-------------------------------*");
        System.out.println("*                                                                         *");
        System.out.println("*                YOUR STEP HELPS TO SAVE WORLD                            *"); 
        System.out.println("***************************************************************************");
        System.out.println();
        System.out.println("                     Plz press 1 to continue                               ");
        int i=sc.nextInt();
        if(i==1)
        {
            obj.meth1();
        }
        else
        {
            System.out.println();
            System.out.println("Choose Correct Option");
            System.out.println();
        }
    } 
    double bill(double Total_bill)
    {
        double dis=0.0;
        if(Total_bill>=1000)
        {
            dis =0.05*Total_bill;
        }
        return dis;
    }
    void billing(double total, String PN, String PC, Double P, int Q)
    {
        System.out.println("1. Continue Shopping");
        System.out.println("2. Get Bill");
        System.out.println("3. Exit");
        int press= sc.nextInt();
        if(press==1)
        {
            Total_bill=Total_bill+total;
            obj. CallAll(PN,PC,P,Q,total);
            obj.meth1();
        } 
        else if(press==2)
        {
            Total_bill=Total_bill+total;
            obj. CallAll(PN,PC,P,Q,total);
            System.out.println("Enter your name:");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.println("Enter your Address:");
            String Add=sc.nextLine();
            String ph="";
            int i=1;
            while(i==1)
            {
                System.out.println("Enter your contact number:");
                String phone=sc.next();
                if(phone.length()==10)
                {
                    ph=ph+phone;
                    i=0;
                }
                else
                {
                    System.out.println("Plz enter valid phone number:");
                    i=1;
                }
                System.out.println();
            }
            obj.meth4(name, Add, ph);
        }
        else if(press==3) 
        {
            System.out.println();
            obj.meth3(5);
        }
        else
        {
            System.out.println();
            System.out.println("Invalid option Choose correct Option:");
            System.out.println();
            obj.billing(total, PN, PC, P, Q);
        }
        
    }
    void meth1()
    {
        System.out.println();
        System.out.println("1) flower plants");
        System.out.println("2) fruit plants");
        System.out.println("3) vegetables plants");
        System.out.println("4) Show");
        System.out.println("5) Gradning tools");
        System.out.println("6) Exit");
        System.out.println("Plz Choose your option:");
        int option=sc.nextInt();
        obj.meth2(option);
    }
    void meth2(int option)
    {
        if(option<=6)
        {
            int yes = sc.nextInt();
            if(yes==1)
            {
                obj.meth3(option);
            }
            else if(yes==2)
            {
                obj.meth1();
            }
            else
            {
                System.out.println();
                System.out.println("Invalid option Choose Valid Option:");
                System.out.println();
            }
        }
        else
        {
            System.out.println();
            System.out.println("Invalid option Choose valid Option:");
            System.out.println();
            obj.meth1();
        }
    }
    void meth3(int option)
    {
        switch(option)
        {
            case 1:
                System.out.println("101) Daisy");
                System.out.println("102) Lotus");
                System.out.println("103) Rose");
                System.out.println("104) Jasmine");
                System.out.println("105) Zinnia");
                System.out.println();
                System.out.println("Enter option which you want :");
                int fl=sc.nextInt();
                if(fl==101)
                {
                    obj.Daisy(option);
                }
                else if(fl==102)
                {
                    obj.Lotus(option);
                }
                else if(fl==103)
                {
                    obj.Rose(option);
                }
                else if(fl==104)
                {
                    obj.Jasmine(option);
                }
                else if(fl==105)
                {
                    obj.Zinnia(option);
                }
                else 
                {
                    System.out.println();
                    System.out.println("Invalid option Choose valid Option:");
                    System.out.println();
                    obj.meth3(option);
                }
            break;
            case 2:
                System.out.println("201) Mango");
                System.out.println("202) Avocado");
                System.out.println("203) Orange");
                System.out.println("204) Chikoo");
                System.out.println("205) Apple");
                System.out.println();
                System.out.println("Enter option which you want :");
                int fr=sc.nextInt();
                if(fr==201)
                {
                    obj.Mango(option);
                }
                else if(fr==202)
                {
                    obj.Avacado(option);
                }
                else if(fr==203)
                {
                    obj.Orange(option);
                }
                else if(fr==204)
                {
                    obj.Chikoo(option);
                }
                else if(fr==205)
                {
                    obj.Apple(option);
                }
                else 
                {
                    System.out.println();
                    System.out.println("Invalid option Choose Correct Option:");
                    System.out.println();
                    obj.meth3(option);
                }
            break;
            case 3:
                System.out.println("301) Tomato");
                System.out.println("302) Chili");
                System.out.println("303) Celery");
                System.out.println("304) Cluster bean");
                System.out.println("305) Brinjal");
                System.out.println();
                System.out.println("Enter option which you want :");
                int vg=sc.nextInt();
                if(vg==301)
                {
                    obj.Mango(option);
                }
                else if(vg==302)
                {
                    obj.Avacado(option);
                }
                else if(vg==303)
                {
                    obj.Orange(option);
                }
                else if(vg==304)
                {
                    obj.Chikoo(option);
                }
                else if(vg==305)
                {
                    obj.Apple(option);
                }
                else 
                {
                    System.out.println();
                    System.out.println("Invalid option Choose Correct Option:");
                    System.out.println();
                    obj.meth3(option);
                }
            break;
            case 4:
                System.out.println("401) Mini Succulent");
                System.out.println("402) Lucky bamboo");
                System.out.println("403) Golden Shower");
                System.out.println("404) Royel palm");
                System.out.println("405) Green snake");
                System.out.println();
                System.out.println("Enter option which you want :");
                int sh=sc.nextInt();
                if(sh==401)
                {
                    obj.Mini_Succulent(option);
                }
                else if(sh==402)
                {
                    obj.Lucky_bamboo(option);
                }
                else if(sh==403)
                {
                    obj.Golden_Shower(option);
                }
                else if(sh==404)
                {
                    obj.Royel_palm(option);
                }
                else if(sh==405)
                {
                    obj.Green_snake(option);
                }
                else 
                {
                    System.out.println();
                    System.out.println("Invalid option Choose Correct Option:");
                    System.out.println();
                    obj.meth3(option);
                }
            break;
            case 5:
                System.out.println("501) pots");
                System.out.println("502) cutter");
                System.out.println("503) Cultivator");
                System.out.println("504) Stands");
                System.out.println("505) artificial water pots");
                System.out.println();
                System.out.println("Enter option which you want :");
                int gr=sc.nextInt();
                if(gr==501)
                {
                    obj.pots(option);
                }
                else if(gr==502)
                {
                    obj.cutter(option);
                }
                else if(gr==503)
                {
                    obj.cultivator(option);
                }
                else if(gr==504)
                {
                    obj.stands(option);
                }
                else if(gr==505)
                {
                    obj.artificial_water_pots(option);
                }
                else 
                {
                    System.out.println();
                    System.out.println("Invalid option Choose Correct Option:");
                    System.out.println();
                    obj.meth3(option);
                }
            break;
            case 6:
                Total_bill=0.0;
                System.out.println();
                System.out.println("Sucessfully Exited");
                System.out.println();
                obj.Welcome();
        }
    }
    void Daisy(int option)
    {
        int s=sc.nextInt();
        String PN="Daisy";
        String PC="101";
        double P=250;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*40;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Daisy(option);
        }
    }
    void Lotus(int option)
    {
        int s=sc.nextInt();
        String PN="Lotus";
        String PC="102";
        double P=20;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*80;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Lotus(option);
        }
    }
    void Rose(int option)
    {
        int s=sc.nextInt();
        String PN="Rose";
        String PC="103";
        double P=203;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*50;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Rose(option);
        }
    }
    void Jasmine(int option)
    {
        int s=sc.nextInt();
        String PN="Jasmine";
        String PC="104";
        double P=270;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*70;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Jasmine(option);
        }
    }
    void Zinnia(int option)
    {
        int s=sc.nextInt();
        String PN="Zinnia";
        String PC="105";
        double P=29;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*30;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Zinnia(option);
        }
    }
    void Mango(int option)
    {
        int s=sc.nextInt();
        String PN="Mango";
        String PC="201";
        double P=500;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*100;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Mango(option);
        }
    }
    void Avacado(int option)
    {
        int s=sc.nextInt();
        String PN="Daisy";
        String PC="202";
        double P=10;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*350;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Avacado(option);
        }
    }
    void Orange(int option)
    {
        int s=sc.nextInt();
        String PN="Daisy";
        String PC="203";
        double P=100;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*200;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Orange(option);
        }
    }
    void Chikoo(int option)
    {
        int s=sc.nextInt();
        String PN="chikoo";
        String PC="204";
        double P=30;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*250;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Chikoo(option);
        }
    }
    void Apple(int option)
    {
        int s=sc.nextInt();
        String PN="Apple";
        String PC="205";
        double P=90;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*120;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Apple(option);
        }
    }
    void Tomato(int option)
    {
        int s=sc.nextInt();
        String PN="tomato";
        String PC="301";
        double P=80;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*110;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Tomato(option);
        }
    }
    void Chili(int option)
    {
        int s=sc.nextInt();
        String PN="chilli";
        String PC="302";
        double P=70;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*120;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Chili(option);
        }
    }
    void Celery(int option)
    {
        int s=sc.nextInt();
        String PN="Celery";
        String PC="303";
        double P=280;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*130;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Celery(option);
        }
    }
    void Cluster(int option)
    {
        int s=sc.nextInt();
        String PN="Cluster";
        String PC="304";
        double P=600;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*140;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Cluster(option);
        }
    }
    void Brinjal(int option)
    {
        int s=sc.nextInt();
        String PN="Brinjal";
        String PC="305";
        double P=650;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*150;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Brinjal(option);
        }
    }
    void Mini_Succulent(int option)
    {
        int s=sc.nextInt();
        String PN="mini succulent";
        String PC="401";
        double P=330;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*250;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Mini_Succulent(option);
        }
    }
    void Lucky_bamboo(int option)
    {
        int s=sc.nextInt();
        String PN="lucky bamboo";
        String PC="402";
        double P=190;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*150;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Lucky_bamboo(option);
        }
    }
    void Golden_Shower(int option)
    {
        int s=sc.nextInt();
        String PN="Golden shower";
        String PC="403";
        double P=450;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*300;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Golden_Shower(option);
        }
    }
    void Royel_palm(int option)
    {
        int s=sc.nextInt();
        String PN="Royel plam";
        String PC="404";
        double P=540;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*270;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Royel_palm(option);
        }
    }
    void Green_snake(int option)
    {
        int s=sc.nextInt();
        String PN="Green snake";
        String PC="405";
        double P=780;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*120;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.Green_snake(option);
        }
    }
    void pots(int option)
    {
        int s=sc.nextInt();
        String PN="pots";
        String PC="501";
        double P=960;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*80;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.pots(option);
        }
    }
    void cutter(int option)
    {
        int s=sc.nextInt();
        String PN="cutter";
        String PC="502";
        double P=330;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*250;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.cutter(option);
        }
    }
    void cultivator(int option)
    {
        int s=sc.nextInt();
        String PN="cultivator";
        String PC="503";
        double P=260;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*800;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.cultivator(option);
        }
    }
    void stands(int option)
    {
        int s=sc.nextInt();
        String PN="stand";
        String PC="504";
        double P=200;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*1500;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.stands(option);
        }
    }
    void artificial_water_pots(int option)
    {
        int s=sc.nextInt();
        String PN="A.W.pots";
        String PC="505";
        double P=200;
        if(s==1)
        {
            System.out.println("how much you have:");
            int Q=sc.nextInt();
            double total=Q*5000;
            obj.billing(total, PN, PC, null, Q);
        }
        else if(s==2)
        {
            obj.meth3(option);
        }
        else if(s==3)
        {
            obj.meth1();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid number");
            System.out.println();
            obj.artificial_water_pots(option);
        }
    }
    void meth4(String name, String Add, String phone)
    {
        System.out.println();
        System.out.println("*************************************************************************************************");
        System.out.println("*                                     Welcome to Nursary                                        *");
        System.out.println("*************************************************************************************************");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Sr. No.      Product Name                   Product Code              Quantity            Price  ");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println();
        for(int i=0;i<Pname.size();i++)
        {
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("  "+(i+1)+"    "+(Pname.get(i))+"         "+Pcode.get(i)+"          "+Quantity+"        "+Price+"    ");
            System.out.println("-------------------------------------------------------------------------------------------------");
        }
        System.out.println();
        System.out.println("Total bill of purchesed items:  " +Total_bill);
        double discount=obj.bill(Total_bill);
        if(discount>0.0)
        {
            System.out.println("hey"+name+"Congrats you recived discount of 5%"+discount);
        }
        else
        {
            System.out.println("Sorry"+name+" you not recived discount");
        }
        System.out.println("Your finial bill:" +(Total_bill-discount));
        System.out.println("Costumer Detail");
        System.out.println("-------------------------");
        System.out.println("name:"+name);
        System.out.println("address:"+Add);
        System.out.println("phone:"+phone);
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("                                        THANK YOU                                                    ");
        System.out.println("                                IF YOU WANT TO DO SHOPPING AGAIN                                     ");
        System.out.println("---------------------------------------------------------------------------------------------------- ");
        System.out.println();
        obj.meth5();
    }
    void meth5()
    {
        System.out.println("press 1 for continue shopping");
        System.out.println("press 2 for get Bill");
        int press=sc.nextInt();
        if(press==1)
        {
            obj.meth1();
        }
        else if(press==2)
        {
            System.out.println();
            System.out.println("---------------------------------------------------------------------------------------------------- ");
            System.out.println("####################################################################################################");
            System.out.println("                              ONCE AGAIN THANK YOU FOR VISITING                                     ");
            System.out.println("####################################################################################################");
            System.out.println("---------------------------------------------------------------------------------------------------- ");
            System.out.println();
        }
        else 
        {
            System.out.println();
            System.out.println("Enter valid option");
            System.out.println();
            obj.meth5();
        }
        sc.close();
    }
    void CallAll(String PN, String PC, double P, int Q, double total)
    {
        Pname.add(PN);
        Pcode.add(PC);
        Price.add(P);
        Quantity.add(Q);
        Total_Price.add(total);
    }
    public static void main(String[] args) 
    {
        obj.Welcome();    
    }  
}
