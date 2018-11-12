public class Agent4{
    public static void main(String[] args){
        Agent a1=new Agent(1 , " Dhanya ", " hubli ");
        Agent a2=new Agent(2 , " shree  ", " mumbai");
        Agent a3=new Agent(3 , " vaibhav "," pune");
        Agent a4=new Agent(4 , " kaushal "," blore");
        Agent a5=new Agent(5 , " lakshi  "," mlore");

        Agent[] AAgent = new Agent[] {a1,a2,a3,a4,a5};
 for(Agent a : AAgent){
     System.out.println(a);
 }
    }


}