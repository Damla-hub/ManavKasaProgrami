import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        float armut=2.14f,elma=3.67f,domates=1.11f,muz=0.95f,patlican=5;
        double resulta,resulte,resultd,resultm,resultp,result,
                aKg,eKg,dKg,mKg,pKg;
        Scanner veri=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        aKg=veri.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        eKg=veri.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        dKg=veri.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        mKg=veri.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        pKg=veri.nextDouble();
        resulta=aKg*armut;
        resulte=eKg*elma;
        resultd=dKg*domates;
        resultm=mKg*muz;
        resultp=pKg*patlican;
        result=resulta+resulte+resultd+resultm+resultp;
        System.out.print("Toplam Tutar : "+result);


    }
}
