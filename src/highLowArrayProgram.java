public class highLowArrayProgram {
    public static void main(String[] args){
        Integer[] numberArray=new Integer[5];
        numberArray[0]=15;
        numberArray[1]=8;
        numberArray[2]=3;
        numberArray[3]=4;
        numberArray[4]=0;

        highLowMethod(numberArray, numberArray[0]);
    }

    private static void highLowMethod(Integer[] numberArray, Integer integer) {
        int champion=numberArray[0];
        int contender=numberArray[0];
        int smallest=numberArray[0];
        int contender2=numberArray[0];
        for (int i=0; i<numberArray.length; i++){
            contender=numberArray[i];
            if(contender>champion){
                contender=champion;
            }
        }
        System.out.println(champion);
        for (int x=0; x<numberArray.length; x++){
            contender2=numberArray[x];
            if(contender2<smallest){
                smallest=contender2;
            }
        }
        System.out.println(smallest);
        if(champion==integer){
            System.out.println("High Value");
        }else if(smallest==integer){
            System.out.println("Low value");
        }else{
            System.out.println("OK");
        }

    }
}
