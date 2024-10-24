public class Nomor1{
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jam lembur): ");
        int jamLembur = scanner.nextInt();

        double  gaji=0;
        double honor= 0;


        if (jamLembur <= 16 ) {
            honor = 100000;
        } else if (jamLembur >= 16){
            honor = 15000;
        }

        System.out.println("Total honor: " + honor);
    }
}

    }
}
