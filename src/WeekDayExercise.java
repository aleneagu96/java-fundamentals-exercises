public class WeekDayExercise {
    public static void main(String[] args) {
        String weekDays = " Friday ";
        switch(weekDays){
            case " Monday ":
                System.out.println(" Monday is an ugly day");
                break;
            case " Tuesday ":
                System.out.println(" Tuesday sucks less than Monday ");
                break;
            case " Thursday ":
                System.out.println(" Thursday is the middle of the week");
                break;
            case " Wendesday ":
                System.out.println(" Almost Friday");
                break;
            case " Friday ":
                System.out.println(" Hello Weekend ");
                break;
            case " Saturday ":
                System.out.println(" Yay weekend");
                break;
            case " Sunday ":
                System.out.println(" Yay party");
                break;
            default:
                System.out.println(" Not a week day");
                break;
        }

    }
}
