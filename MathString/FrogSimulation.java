public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }
    private  int hopDistance(){
        int hop = 0;
        hop = (int)(Math.random()*10)+1;
        if(Math.random()>0.9){
            hop = -hop;
        }
    

        return hop;
    }
    public boolean simulate(){
        boolean result = false;
        int distance = 0;
        for(int i = 0; i<maxHops; i++){
            distance += hopDistance();
            if(distance>=goalDistance){
                result = true;
                break;
            }
            else if(distance<0){
                break;
            }
           }   
        return result;} 

    public double runSimulations(int num){
        int successes = 0;
        for(int i = 0; i<num; i++){
            if(simulate()){
                successes++;
            }
        }
        double result = (double)successes/num;
        return result;
    }  
}
    
        
