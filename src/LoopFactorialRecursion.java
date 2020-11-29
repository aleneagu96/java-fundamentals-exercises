public class LoopFactorialRecursion {
    public static void main(String[] args) {
        factNum(5);
    }

        private static void factNum( int n) {
            StringBuilder paranteze = new StringBuilder("(");
            int fact = 1;
            for (int i = 1; i <= n ; i++) {
                fact = fact * i;
                paranteze.append(i).append("*");
            }
            System.out.print(fact);
            String detail = paranteze.substring(0, paranteze.length() - 1);
            System.out.println(detail + ")");
        }



//        private static int fact(int n) {
//            int output;
//            nume.append(n).append("*");
//            if (n == 1) {
//                return 1;
//            }
//            //Recursion: Function calling itself!!
//            output = fact(n - 1) * n;
//            return output;
//        }
    }

