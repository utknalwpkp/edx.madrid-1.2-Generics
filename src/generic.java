import java.util.ArrayList;
import java.lang.instrument.ClassDefinition;
import java.lang.Integer;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Scanner;


public class generic {

public class E{
    ArrayList lista = new ArrayList<Integer>();
    ArrayList listanr2 = new ArrayList<Double>();
    ArrayList listanr3 = new ArrayList<String>();


}
public class MyClass{
    ArrayList eArrayList = new ArrayList<Integer>();
}
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//do podawania z klawiatury



        ArrayList list1 = new ArrayList<String>();
        list1.add(100);
        list1.add(101);
        list1.add(102);
        list1.add(103);
        //for (int i=104; i<1000; i++){list1.add(i);}

        Integer value = (Integer) list1.get(0);

        ArrayList list2 = new ArrayList();
        list2.add(1500);
        Integer value2 = (Integer) list2.get(0);


        System.out.println("Lista nr 1  " + list1 );
        System.out.println("  Lista nr 2 " + list2);



        ArrayList list3 = new ArrayList<E>();
        list3.add(1.0);
        list3.add(2.0);
        list3.add(3.0);
        //list3.add(4.0);
        //list3.add("ciekawe");
        Object id = list3.get(0);
        ArrayList list5 = new ArrayList<E>();
        list5.add("ciekawe");
        list5.add("może");
        list5.add("tabelki można tworzyć");

        //list5.add(input.nextLine());
        //Object nazwa = list5.get(0);

        String akcept;
        System.out.println("Chcesz wprowadzić jakieśs dane t/n");
        akcept = input.next();
        if (akcept.equals("t")){
            short j;
            System.out.println("Ile danych chcesz wprowadzić");
            j=input.nextShort();
            for (short i=0; i==j; i++) {


                System.out.println("Wprowadź dodatkowy wiersz");
                list5.add(input.nextLine());
                //double d=5.0;
                list3.add(3+j);//tu cos jest nie tak!!
            }

        }

        else;// (akcept == 'n'){};


        //tutaj trzeba zrobić warunek z pytaniem czy chcemy więcej wprowadzić i jęsli tak to do pętli a w pętli dodatkowy list3 na double i list5 na input.nextLine()

        ArrayList list4 = new ArrayList<MyClass>();
        for (int j =0; j<11;j++) list4.add(j);
        for (int i =11; i<100;i+=7) list4.add(i);
        Object value4 = list4.get(0);

        for (int l=0; l<4; l++) System.out.println("  Lista nr 3 " + list3.get(l) + " " + list5.get(l));//.get(0) + " " + list3.get(1));
        System.out.println();
        System.out.println("  Lista nr 4 " + list4);

          System.gc();
    }
}