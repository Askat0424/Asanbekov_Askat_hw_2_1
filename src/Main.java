public class Main {
    public static void main(String[] args) {
        House house = new House( " Auezova " , " 5 " , " 7");
        Father father = new Father(" Mairambek " , " Teacher " , house , HabitEnum.SCREAM);
        Son son = new Son( " Argen " , " Teacher " , house , HabitEnum.WILL_HIT);
        Son son1 = new Son( " Askat " , " Students " , house , HabitEnum.TEL_GOKES);
        System.out.println( father.getInfo());
        father.makeVoice();
        father.makeVoice(" Бить ");
        System.out.println(son.getInfo());
        System.out.println(son1.getInfo());


    }

     }
