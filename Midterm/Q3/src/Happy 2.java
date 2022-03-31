public class Happy extends Moody{
    //returns string indicating happy
    public String getMood() {
        return "I feel happy today!";
    }

    //print laughter string “heeehee....hahahah...HAHAHA!!”
    public void expressFeelings() {
        System.out.println("heeehee...hahahah...HAHAHA!!");
    }
    //returns message about self: “Subject laughs a lot”
    public String toString() {
        return "Observation: Subject laughs a lot";
    }

    @Override
    void queryMood() {

    }
}
