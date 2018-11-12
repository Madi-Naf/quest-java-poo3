public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public String sing() {
        return "Screech Screech!";
    }
    
    public void setFlying(boolean flying) {
    	this.flying = flying ;
    }

    //  Comportement de l'interface Fly
    
    
    public void takeOff(){
    	this.setFlying(true);
    }

    public void land(){

    }
 
    public void glide(){
    	if (this.isFlying() && this.altitude > 0) {
    		
            System.out.println(this.getName() +  " It glides into the air.");
    	}
        
    }
    

    public int ascend(int meters){
    	if (this.isFlying()) {
            this.altitude = Math.min(this.altitude + meters, 14);
            System.out.println(this.getName() +  " always fly higher : " + this.altitude);
        }
        return this.altitude;
    }

    public int descend(int meters){
    	if (this.isFlying()) {
            this.altitude = Math.min(this.altitude + meters, 3800);
            System.out.println(this.getName() + " fly lower : " + this.altitude);
        }
        return this.altitude;
    }
}
