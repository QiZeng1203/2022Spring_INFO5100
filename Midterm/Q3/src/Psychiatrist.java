public class Psychiatrist {
    //asks moody object about its mood
    public void examine(Moody moody){
        System.out.println("How are you feeling today?");
        moody.queryMood();
    }
    //a moodyObject is observed to either laugh or cry
    public void observe(Moody moody) {
        System.out.println(moody.toString());
    }
    //returns message about self: “Subject laughs a lot”
    public String toString(){
        return "Subject laughs a lot";
    }
}
