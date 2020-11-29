public class HeadFirstJavaExercises {
        public static void main(String[] args) {
//        int x = 3;
//        String name = "Lovey";
//        x = x * 17;
//        System.out.println(" x is " + x );
//        double d = Math.random();
//        int x  = 15;
//        while ( x > 12 ) {
//            x = x - 1;
//            System.out.println(" x is " + x );
//        }

//        for (int x = 0; x < 10; x = x + 1) {
//            System.out.println(" x is now " + x);
//        }
//        int x = 2;
//        String name = " Lovely ";
//        if ( x == 10){
//            System.out.println(" x must be 10");
//        }else {
//            System.out.println(" x is def not 10");
//        }
//        if ((( x < 3) && name.equals( " Lovely "))){
//            System.out.println(" Gently");
//
//        }
//        System.out.println(" This line doens't do anything");

            int beerNum = 1;
            String word = " bottles";
            while ((beerNum > 0) && ( beerNum < 99)) {

                System.out.println(beerNum + " " + word + " of beer on the wall ");
                System.out.println( beerNum + " " + word + " of beer");
                System.out.println( " Take one down. ");
                System.out.println( " Pass it around. ");
                beerNum++;

            }  if (beerNum == 99) {
                System.out.println(beerNum + " " + word + " of beer on the wall ");
                System.out.println(" No more bottles of beer on the wall ");
            }

        }
    }


