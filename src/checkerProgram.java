import java.util.Scanner;

public class checkerProgram {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("How long is each row?");
        int length=scanner.nextInt();
        System.out.println("How many rows are there?");
        int rows=scanner.nextInt();
        checkerBoard(length, rows);
    }

    private static void checkerBoard(int length, int rows) {
        String row;
        for(int i=1; i<=rows; i++){
            if(i%2==0){
                row=(openSpaceRow(length));
                System.out.println(row);
            }else{
                row=(closedSpaceRow(length));
                System.out.println(row);
            }
        }
    }

    private static String closedSpaceRow(int length) {
        int i;
        String row="";
        for(i=0; i<=length; i++){
            if (i%2==0){
                row+="#";
            } else{
                row+=" ";
            }
        }
        return row;
    }

    private static String openSpaceRow(int length) {
        int i;
        String row="";
        for(i=0; i<=length; i++){
            if(i%2==0){
                row+=" ";
            }else{
                row+="#";
            }
        }
        return row;
    }
}
