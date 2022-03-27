public class Sad extends Moody{
    //returns string indicating sad
    @Override
    public String getMood(){
        return "I feel sad today";
    }
    //print crying string “‘waah’ ‘boo hoo’ ‘weep’ ‘sob’”
    @Override
    public void expressFeelings(){
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob’");
    }

    @Override
    void queryMood() {
        System.out.println(getMood());
        expressFeelings();
    }

    //returns message about self : “Subject cries a lot”
    public String toString() {
        return "Observation: Subject cries a lot";
    }

}
