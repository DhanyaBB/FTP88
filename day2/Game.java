class Game
{
    static int score;


static {
    score=0;
}

public void sum(int x)
{
    score=score+x;

}
public static void main(String[] args){
    game a=new game();
    a.sum(20);
    game b=new game();
    b.sum(22);
    game c=new game();
    System.out.println("total score  "+game.score);

}
}