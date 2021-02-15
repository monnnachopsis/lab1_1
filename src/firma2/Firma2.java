package firma2;
import java.util.Scanner;

class Sotrudnik{
    String fam,im,otch,doljnost;
    int kolDet;
    Rebenok []reb=null;
}

class Rebenok{
    String imR;
    int ageR;
}
public class Firma2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in,"cp1251");

        System.out.println("Введите количество сотрудников => ");
        int kol=sc.nextInt();
        sc.nextLine();

        firma2.Sotrudnik[]sotr=new firma2.Sotrudnik[kol];

        System.out.println("Введите информацию о каждом сотруднике: ");
        for (int i=0; i<sotr.length; i++){
            sotr[i]=new firma2.Sotrudnik();

            System.out.print("Введите фамилию "+(i+1)+" сотрудника => ");
            sotr[i].fam=sc.nextLine();

            System.out.print("Введите его имя => ");
            sotr[i].im=sc.nextLine();

            System.out.print("Введите его отчество => ");
            sotr[i].otch=sc.nextLine();

            System.out.print("Введите его должность => ");
            sotr[i].doljnost=sc.nextLine();

            System.out.print("Введите количество детей сотрудника => ");
            sotr[i].kolDet=sc.nextInt();
            sc.nextLine();

            if(sotr[i].kolDet!=0){
                sotr[i].reb=new Rebenok[sotr[i].kolDet];
                System.out.println("Дети => ");
                for (int j=0; j<sotr[i].reb.length;j++){
                    sotr[i].reb[j]=new Rebenok();
                    System.out.print("Введите имя "+(i+1)+" ребенка => ");
                    sotr[i].reb[j].imR = sc.nextLine();

                    System.out.print("Введите его возраст => ");
                    sotr[i].reb[j].ageR = sc.nextInt();
                    sc.nextLine();
                }
            }
        }

        System.out.println("\n Сотрудники фирмы: \n фам \t имя \t отч + \t должность \t Оклад");
        for (Sotrudnik s : sotr) {
            System.out.print(s.fam+ "\t"+s.im + "\t" + s.otch + "\t "+ s.doljnost);
            System.out.println("\n Дети: ");
            for (Rebenok r : s.reb)
                System.out.println("\t\t\t"+ r.imR+ "\t\t"+ r.ageR);
            System.out.println("");
        }
    }
}
