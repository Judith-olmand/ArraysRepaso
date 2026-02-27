public class MatrizCuadarada {
    public static void main(String[] args) {
        int[][] matrizCuadarada = {{8,2,3},{3,5,8},{1,2,3}};
        int suma = 0;

        for (int i = 0; i < matrizCuadarada.length; i++) {
            for (int j = 0; j < matrizCuadarada[i].length; j++) {
                if(i==j){
                    suma += matrizCuadarada[i][j];
                }
            }
        }
        System.out.println(suma);
    }
}
