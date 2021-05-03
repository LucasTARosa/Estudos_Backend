package AulaArray;

public class Teste2 {
    public static void main(String[] args){
        int[][] arrayMulti = {{1,3,5,7,9},{0,2,4,6,8}};
        for (int i = 0; i < arrayMulti.length; ++i){
            for (int j = 0; j < arrayMulti[i].length; ++j){
                System.out.println(arrayMulti[i][j]);
            }
        }

    }
}
