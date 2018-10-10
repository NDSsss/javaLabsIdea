import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Example {
    public static void main(String[] args) throws IOException, InterruptedException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int lab = Integer.parseInt(bufferedReader.readLine());
        switch (lab){
            case 1:
                System.out.print(lab1());
            break;
            case 2:
                System.out.print(lab2());
            break;
            case 3:
                System.out.print(lab3());
            break;
            case 4:
                System.out.print("is not done yet");
            break;
            case 5:
                System.out.print(lab5());
            break;
        }

    }

    public static String lab1(){
        double a = 9.8;
        int x=1,v=2,t=3;
        double result = 1+v*t+a*t*t/2;
        return String.valueOf(result);
    }

    public static String lab2(){
        FooCorporation fooCorporation = new FooCorporation();
        String commonSallary="";
        commonSallary += "Работник 1: "+fooCorporation.getSallary(250,35)+"\n";
        commonSallary += "Работник 2: "+fooCorporation.getSallary(330,55)+"\n";
        commonSallary += "Работник 3: "+fooCorporation.getSallary(400,73)+"\n";
        return commonSallary;
    }

   // public class Foo

    public static String lab3(){
        ArrayList<Runner> runners = new ArrayList<>();
        runners.add(new Runner("Elena	",341,1));
        runners.add(new Runner("Thomas	",273,2));
        runners.add(new Runner("Hamilton",278,3));
        runners.add(new Runner("Suzie	",329,4));
        runners.add(new Runner("Phil	",445,5));
        runners.add(new Runner("Matt	",402,6));
        runners.add(new Runner("Alex	",388,7));
        runners.add(new Runner("Emma	",275,8));
        runners.add(new Runner("John	",243,9));
        runners.add(new Runner("James	",334,10));
        runners.add(new Runner("Jane	",412,11));
        runners.add(new Runner("Emily	",393,12));
        runners.add(new Runner("Daniel	",299,13));
        runners.add(new Runner("Neda	",343,14));
        runners.add(new Runner("Aaron	",317,15));
        runners.add(new Runner("Kate	",265,16));
        Collections.sort(runners);
        return runners.get(0).toString();
    }

    public static String lab4(){
        return "";
    }
    public static String lab5(){
        double[] dist = {1.2, 3.8, 1.7, 1.7};
        Tank tank = new Tank(dist);
        String result = "";
        for(int i =0 ;i<tank.enemies();i++){
            result+=tank.kill()+" \n";
        }
        return result;
    }
    public static String lab6(){
        return "";
    }

}
