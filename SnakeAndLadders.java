import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;

public class SnakeAndLadders
{
    private static final int board=100;
    private static final HashMap<Integer,Integer> snakes =new HashMap<>();
    private static final HashMap<Integer,Integer> ladders =new HashMap<>();

    static {
        snakes.put(22,11);
        snakes.put(32,11);
        snakes.put(52,31);
        snakes.put(85,41);
        snakes.put(96,38);

        ladders.put(13,53);
        ladders.put(72,98);
        ladders.put(36,74);

    }

    private player[] players;
    private Random random;
    private Scanner scan;
    private int currentplayer;

    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the num of players:");
        int num=Integer.parseInt(scan.nextLine());
        if(num<2 || num>4)
        {
            System.out.println("invalid players:");
            scan.close();
            return;
        }
        String[] playernames= new String[num];
        System.out.println("enter player names:");
        for(int i=0;i<num;i++)
        {
            playernames[i]=scan.nextLine();
        }
        SnakeAndLadders obj1=new SnakeAndLadders(playernames);
        obj1.startgame();
        scan.close();

    }
        
    SnakeAndLadders(String playernames[])
    {
        players=new player[playernames.length];
        for(int i=0;i<playernames.length;i++)
        {
            players[i]=new player(playernames[i]);
        }
        currentplayer=0;
        scan=new Scanner(System.in);
        random= new Random();
    }
    private void startgame()
    {
        System.out.println("snakes"+snakes);
        System.out.println("game started!!");
        while(true)
        {
            playerturn();
            switchplayer();
        }

    }
    private void switchplayer()
    {
        currentplayer = (currentplayer+1)%players.length;
    }
    private void playerturn()
    {
        player current_player=players[currentplayer];
        System.out.println(current_player.getname()+"'s turn");
        int diece=diece();
        scan.nextLine();
        int new_position=current_player.getposition()+diece;
        if(new_position>100)
        {
            System.out.println("need exactnumber");
            return ;
        }
        current_player.setposition(new_position);
        System.out.println(current_player.getname()+"goes upto "+new_position);
        if(snakes.containsKey(new_position))
        {
            int tail=snakes.get(new_position);
            current_player.setposition(tail);
            System.out.println("snake byted"+tail);
        }
        if(ladders.containsKey(new_position))
        {
            int top=ladders.get(new_position);
            current_player.setposition(top);
            System.out.println("ladders used"+top);
        }
        if(current_player.getposition()==board)
        {
            System.out.println(current_player.getname()+"wins");
            System.exit(0);
        }
    }
    private int diece()
    {
        return random.nextInt(6)+1;
    }

}

class player{
    private String name;
    private int position=0;
    public player(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    public int getposition()
    {
        return position;
    }
    public void setposition(int position)
    {
        this.position=position;
    }

}
