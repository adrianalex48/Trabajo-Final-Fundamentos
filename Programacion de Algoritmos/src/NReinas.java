
// ACLARACION: algoritmo ineficiente, meramente didáctico
// se podrían usar bitboards para no hacer tanto bucle revisando 1 por 1 y asi sólo una comparación
// lo dejo así porque para el ejemplo de un tablero 8x8 está muy sencillo de entender
public class NReinas {

    final int N = 8;

    // metódo para saber si no hay otra reina en el rango de la nueva
    //  básicamente comprobar cuadrado, diagonal y horizontal
    boolean cumpleReglasReina(int[][] tablero, int fila, int col) {
        for (int i = 0; i < fila; i++) {
            if (tablero[i][col] == 1) {
                return false;
            }
        } // recorre fila
        // for (int i = 0; i < col; i++) {
        //    if (tablero[fila][i] == 1) {
        //       return false;
        //    }
        // } recorre columna
        // viendolo como ajedrez es correcto, en la practica es rebundante porque vamos fila por fila de todos modos (1 intento por fila..)
        for (int i = fila, j = col; i >= 0 && j >= 0; i--, j--) {
            if (tablero[i][j] == 1) {
                return false;
            }
        } // recorre en diagonal de izquierda a derecha
        for (int i = fila, j = col; i >= 0 && j < N; i--, j++) {
            if (tablero[i][j] == 1) {
                return false;
            }
        } // recorre en diagonal de derecha a izquierda
        return true;
    }

    boolean resolver(int[][] tablero, int fila) {
        if (fila >= N) {
            return true;
            // caso base, cuando llega al final del tablero
        }
        for (int col = 0; col < N; col++) { // probar columna por columna
            if (cumpleReglasReina(tablero, fila, col)) {
                tablero[fila][col] = 1; // se pone una reina
                // esto no lo ponemos dentro del backtracking, basicamente porque es un algoritmo determinista
                // donde todo el algoritmo depende de la primera reina, esta primera reina
                // podría ir con una seed random
                if (resolver(tablero, fila + 1)) {
                    return true;
                }
                // aqui ocurre el backtracking, basicamente recorremos fila por fila colocando reinas
                // si llegamos a un caso donde no se puede resolver, retrocedemos hasta donde estaba bien
                // y quitamos esa reina, intentando ahora en otro lugar
                // como esta en un for, automaticamente prueba en la siguiente columna, asi hasta encontra una solucion
                // MUY POCO EFICIENTE
                tablero[fila][col] = 0;
            }
        }
        return false; // retrocede en esa rama
    }

    void imprimirTablero(int[][] tablero) {
        for (int i = 0; i < N; i++) {
            System.out.println();
            for (int j = 0; j < N; j++) {
                if (tablero[i][j] == 1) {
                    System.out.print(" R ");
                } else {
                    System.out.print(" - ");
                }
            }
        }
    }

    public static void main(String[] args) {
        NReinas nr = new NReinas();
        int[][] tablero = new int[nr.N][nr.N]; // se crea lleno de 0 automaticamente
        if (nr.resolver(tablero, 0)) {
            nr.imprimirTablero(tablero);
        } else {
            System.out.println("No existe solución");
        }
    }
}

/*
ejemplo de resultado (tablero de 8):
 R  -  -  -  -  -  -  - 
 -  -  -  -  R  -  -  - 
 -  -  -  -  -  -  -  R 
 -  -  -  -  -  R  -  - 
 -  -  R  -  -  -  -  - 
 -  -  -  -  -  -  R  - 
 -  R  -  -  -  -  -  - 
 -  -  -  R  -  -  -  - 
 */
