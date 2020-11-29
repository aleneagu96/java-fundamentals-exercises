public class DuplicateArray {
    static int counter = 0;

    public static void main(String[] args) {

        int[] myArray = {1, 7, 3, 7, 10, 1, 9, };
        int[][] aparitii = new int[myArray.length][2];

        for (int i = 0; i < myArray.length; i++) {
            createApparitions(myArray[i], aparitii);
        }
        for (int l = 0; l < aparitii.length; l++) {
            if (aparitii[l][1] > 1) {
                System.out.println(" Elementul: " + aparitii[l][0] + " apare de " + aparitii[l][1] + " ori");
            }
        }
        System.out.println();
    }

    /**
     * cauta aparitiile duplicate
     * creeaza o matrice cu val si aparitii, pe prima coloana apare elem si a doua nr de aparitii
     * la fiecare iteratie verificam daca elementul exista deja in prima coloana,
     * daca lam gasit vom incrementa aparitia pe a 2 coloana,
     * altfel vom adauga un rand nou in matrice cu val elementului si cu 1 pe coloana ca lam gasit odata
     * @param element
     * @param aparitii
     */
    private static void createApparitions(int element, int[][] aparitii) {
//        checks already existing elem and increases apparitions
        for ( int k = 0 ; k < aparitii.length; k++) {
            if( element == aparitii[k][0]) {
                aparitii[k][1]++;
            }
        }
        aparitii[counter][0] = element;
        aparitii[counter][1]++;
        counter++;
    }
}

