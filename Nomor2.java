public class Nomor2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int biaya = 13000;
    
        System.out.println("Masukkan nama drive " + "beliau/mereka/kita");
       String drive = scanner.nextLine();

       System.out.println("lama trip (km)");
       int km = scanner.nextInt();
        drive += km;

       if (drive.equals("beliau")) {
         km= biaya * 4;
       }

       else if  (drive.equals("kita")) {
         km = biaya * 5;
       }

       else if (drive.equals("mereka")){
        km= biaya * 2;
       }

       System.out.println("total trip yang dilakukan driver= " + biaya);


    }
}

    }
}
