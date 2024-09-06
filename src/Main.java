public class Main {
    public static void main(String[] args) {

        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];

        for(double number: myList){
            System.out.println(number);
        }
//**********************************************************************************************************************
        for(double number: myList) {
            total += number;
            System.out.println(number);
        }
        System.out.println("Toplam : " + total);
//**********************************************************************************************************************

        for(double number: myList){
            if (number>max){
                max = number;
            }
        }
        System.out.println("En büyük sayı : "+max);
        
        }
}