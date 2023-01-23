public class Main {
    public static void main(String[] args) {
        // ТАПШЫРМА № 16
        // Animal деген класс тузунуз жана бир метод кошунуз.
        //Анын 3 наследнигин тузунуз.
        //
        //Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
        //Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин
        //кошунуз.
        //instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
        //чыгарыныз.
        //Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды
        //болуп оз озунун массивине салыныз.
        Animal[] animal = {
                new Eagle(),
                new Eagle(),
                new Eagle(),
                new Eagle(),
                new Eagle(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Shark()
        };

        for (Animal a : animal) {
            if (a instanceof Shark) {
                ((Shark) a).attack();

            }
            if (a instanceof Turtle) {
                ((Turtle) a).swim();
            }
            if (a instanceof Eagle) {
                ((Eagle) a).fly();
            }
        }

        for (Animal a : animal) {
            if (a.getClass().getName().equals("Shark")) {
                ((Shark) a).attack();
            } else if (a.getClass().getName().equals("Eagle")) {
                ((Eagle) a).fly();
            }
        }
    }
}