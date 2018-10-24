import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Example {
    public static void main(String[] args) throws IOException, InterruptedException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int lab = Integer.parseInt(bufferedReader.readLine());
        switch (lab) {
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
            case 6:
                break;
            case 7:
                System.out.print(lab7(bufferedReader.readLine()));
                break;
            case 8:
                System.out.print(lab8(bufferedReader.readLine(), bufferedReader.readLine()));
                break;
        }

    }

    public static String lab1() {
        double a = 9.8;
        int x = 1, v = 2, t = 3;
        double result = 1 + v * t + a * t * t / 2;
        return String.valueOf(result);
    }

    public static String lab2() {
        FooCorporation fooCorporation = new FooCorporation();
        String commonSallary = "";
        commonSallary += "Работник 1: " + fooCorporation.getSallary(250, 35) + "\n";
        commonSallary += "Работник 2: " + fooCorporation.getSallary(330, 55) + "\n";
        commonSallary += "Работник 3: " + fooCorporation.getSallary(400, 73) + "\n";
        return commonSallary;
    }

    // public class Foo

    public static String lab3() {
        ArrayList<Runner> runners = new ArrayList<>();
        runners.add(new Runner("Elena	", 341, 1));
        runners.add(new Runner("Thomas	", 273, 2));
        runners.add(new Runner("Hamilton", 278, 3));
        runners.add(new Runner("Suzie	", 329, 4));
        runners.add(new Runner("Phil	", 445, 5));
        runners.add(new Runner("Matt	", 402, 6));
        runners.add(new Runner("Alex	", 388, 7));
        runners.add(new Runner("Emma	", 275, 8));
        runners.add(new Runner("John	", 243, 9));
        runners.add(new Runner("James	", 334, 10));
        runners.add(new Runner("Jane	", 412, 11));
        runners.add(new Runner("Emily	", 393, 12));
        runners.add(new Runner("Daniel	", 299, 13));
        runners.add(new Runner("Neda	", 343, 14));
        runners.add(new Runner("Aaron	", 317, 15));
        runners.add(new Runner("Kate	", 265, 16));
        Collections.sort(runners);
        return runners.get(0).toString();
    }

    public static String lab4() {
        return "";
    }

    public static String lab5() {
        double[] dist = {1.2, 3.8, 1.7, 1.7};
        Tank tank = new Tank(dist);
        String result = "";
        for (int i = 0; i < tank.enemies(); i++) {
            result += tank.kill() + " \n";
        }
        return result;
    }

    public static String lab6() {
        return "";
    }

    public static String lab7(String data) {
        char[] formatedData = data.replaceAll("[^a-zA-Z]", "").toCharArray();
        boolean isPalyndrom = true;
        int backIndex = formatedData.length - 1;
        for (int i = 0; i < formatedData.length; i++) {
            if (!String.valueOf(formatedData[i]).equalsIgnoreCase(String.valueOf(formatedData[backIndex - i]))) {
                isPalyndrom = false;
                break;
            }
        }
        return isPalyndrom ? "true" : "false";
    }

    public static String lab8(String array1, String array2) {
        try {
            String[] array1Splited = array1.split("[^0-9]");
            String[] array2Splited = array2.split("[^0-9]");
            int[] array1Int = new int[array1Splited.length];
            int[] array2Int = new int[array2Splited.length];
            for (int i = 0; i < array1Splited.length; i++) {
                array1Int[i] = Integer.parseInt(array1Splited[i]);
            }
            for (int i = 0; i < array2Splited.length; i++) {
                array2Int[i] = Integer.parseInt(array2Splited[i]);
            }
            int array1Index = 0;
            int array2Index = 0;
            boolean isArray1Over = false;
            boolean isArray2Over = false;
            int[] finalaArray = new int[array1Int.length + array2Int.length];
            for (int i = 0; i < finalaArray.length; i++) {
                if (array1Index != array1Int.length && array2Index != array2Int.length) {
                    if (array1Int[array1Index] < array2Int[array2Index]) {
                        finalaArray[i] = array1Int[array1Index];
                        array1Index++;
                    } else {
                        finalaArray[i] = array2Int[array2Index];
                            array2Index++;
                    }
                } else if (array1Index == array1Int.length&&array2Index!=array2Int.length) {
                        finalaArray[i] = array2Int[array2Index];
                        array2Index++;
                } else if (array2Index == array2Int.length&&array1Index!=array1Int.length) {
                        finalaArray[i] = array1Int[array1Index];
                        array1Index++;
                }
            }
            String finalString = "";
            for (int i = 0; i < finalaArray.length; i++) {
                finalString += String.valueOf(finalaArray[i]) + " ";
            }
            return finalString;
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    public static class FooCorporation{
        public String getSallary(int baseSallary, int hours){
            if(baseSallary>0&&hours>0) {
                if (baseSallary < 300) {
                    return "Слишком маленькая ЗП";
                }
                if (hours > 60) {
                    return "Преработка";
                }
                int mainhours=40;
                int extraHouts=hours-mainhours;
                double sallary=0;
                sallary=baseSallary*mainhours;
                if(extraHouts>0){
                    sallary+=baseSallary*1.5d*extraHouts;
                }
                return "Зарплата "+String.valueOf(sallary);
            }else{
                return "Неверные входные данные";
            }
        }
    }

    public static class Runner implements Comparable{
        private String name;
        private int time;
        private int position;

        public Runner(String name, int time, int position){
            this.name = name;
            this.time = time;
            this.position = position;
        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public int compareTo(Object o) {
            return time-((Runner)o).time;
        }
    }

    public static class Tank {
        private double[] dist;
        int pos = 0;

        public void setDist(double[] dist) {
            this.dist = dist;
        }

        public Tank(double[] dist) {
            this.dist = dist;
            sort();
        }

        private void sort() {
            int temp;
            for (int i = dist.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (dist[j] < dist[j + 1]) {
                        double tmp = dist[j];
                        dist[j] = dist[j + 1];
                        dist[j + 1] = tmp;
                    }
                }
            }
        }

        public int enemies(){
            return dist.length+1;
        }

        public String kill() {
            if (pos < dist.length) {
                return String.valueOf(dist[pos++]);
            } else {
                return "Победа";
            }
        }
    }
}
