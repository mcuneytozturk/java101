package javaCourse6;

public class pratikCokBoyutluDizilerBHarfiYazdiranProgram {
    static void bharfi(String[][] list){
        for (int i=0; i<list.length; i++){
            for (int j=0; j< list[i].length; j++){
                if (i==0 && j<list[i].length-1 || i==list.length-1 && j<list[i].length-1 || i==list.length/2){
                    list[i][j]=" * ";
                }else if (j==0 || j==list[i].length-1 && i>=((list.length-1)/2)/2 && i<=((list.length-1)/2)*2-1) {
                    list[i][j]=" * ";
                }else {
                    list[i][j]="   ";
                }
                System.out.print(list[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        String[][] list=new String[5][6];
        bharfi(list);

        System.out.println("-----------");

        String[][] list2=new String[9][12];
        bharfi(list2);

    }

}