public class FrogRunner{
    public static void main(String[] args) {
        FrogSimulation frog = new FrogSimulation(24, 5);
        boolean result = frog.simulate();
        if(result){
            System.out.println("The frog reached the goal!");
        }else{
            System.out.println("The frog did not reach the goal.");
        }
    }
}