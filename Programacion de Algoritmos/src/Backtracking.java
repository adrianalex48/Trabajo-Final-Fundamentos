
import java.util.ArrayList;
import java.util.List;

/*
Backtracking: dado un arreglo A de tamaño N, encontrar uno o varios subconjuntos 
cuya suma sea exactamente K (utilizando el ejemplo visto en clase).
 */
public class Backtracking {

    static ArrayList<List<Integer>> subconjuntosValidos = new ArrayList<>();
    final static int K = 20;

    public static void buscar(int[] A, int indice, int sumaActual, List<Integer> subconjunto) {
        if (sumaActual == K) {
            subconjuntosValidos.add(new ArrayList<>(subconjunto)); // guardar el array por un tema de referencias
            return; // se encuentra un subconjunto valido, se agrega
        }
        if (sumaActual > K || indice >= A.length) {
            return; // no se agrega, se poda (regresa el backtracking al último caso exitoso)
        }
        // divido en dos ramas, meter y no meter el numero actual (probar todas las combinaciones)
        // metiendo el numero:
        // empieza el backtracking, caso base añado un nuevo numero que quiero probar
        subconjunto.add(A[indice]);
        buscar(A, indice + 1, sumaActual + A[indice], subconjunto);
        subconjunto.remove(subconjunto.size() - 1); // se elimina el ultimo numero que agregue
        // no metiendo el numero: (se salta el numero en la suma)
        buscar(A, indice + 1, sumaActual, subconjunto);
    }

    public static void imprimirSubconjuntos() {
        System.out.println("Subconjuntos encontrados que en total den: " + K);
        for (List<Integer> sub : subconjuntosValidos) {
            System.out.println(sub);
        }
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 5, 7, 9, 11};
        buscar(A, 0, 0, new ArrayList<>());
        imprimirSubconjuntos();

    }
}
