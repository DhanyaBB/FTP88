import java.util.Objects;
class Agent
{
    int agentID;
    String name;
    String City;

public Agent(){

}

public Agent(int argAgentID,String argName,String argCity)
{
    this.agentID=argAgentID;
    this.name=argName;
    this.City=argCity;
}
@Override
public final boolean equals(Object ob)
    {
        if(ob == null) {
            return false;
        }
        if(ob.getClass()!=getClass()){
            return false;
        }
        
        Agent a = (Agent)ob;
        if(a.agentID==agentID && a.name==name && a.City==City)
        {
            return true;
        }
        else
        {
            return false;
        }
    
    }
 @Override
public final int hashCode()
{
    return Objects.hash(agentID,name,City);
}
@Override
public final String toString()
{
    return "AgentId  "+agentID+ "Name "+name+"City  " + City;  
}

public static void main(String[] args)
{
    Agent c1=new Agent(1,"drt","gvgf");

    Employ e=new Employ();
    

    Agent c2=new Agent(2,"sdh","cue");
    
    Agent c3=new Agent(2,"sdh","cue");
  
    System.out.println(c2.equals(c3)); 

   

    System.out.println(c1.equals(c3));
     System.out.println("Conflicts " + e.equals(c3));

    System.out.println(c1.equals(c2));
    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
    System.out.println(c3.hashCode());
 
    Agent a1 = null; 

    System.out.println("Null res " + c1.equals(a1));
}
}