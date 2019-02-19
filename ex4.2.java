class Player 
{
    String name;
    int age;

    Player(String n, int a) 
    {
        name = n;
        age = a;
    }

    public void show()
    {
        System.out.println("The Player Name is " + name);
        System.out.println("The Player Age is " + age);
    }
}

class Cricket_Player extends Player 
{
    String p_type;

    Cricket_Player(String n, String t, int a)
    {
        super(n, a);
        p_type = t;
    }

    public void show() 
    {
        super.show();
        System.out.println("The Player plays" + p_type);
    }
}

class Football_Player extends Player
{
    String p_type;

    Football_Player(String n, String t, int a) 
    {
        super(n, a);
        p_type = t;
    }

    public void show() 
    {
        super.show();
        System.out.println("The Player plays " + p_type);
    }
}

class Hockey_Player extends Player 
{
    String p_type;
    Hockey_Player(String n, String t, int a)
    {
        super(n, a);
        p_type = t;
    }

    public void show() 
    {
        super.show();
        System.out.println("The Player plays " + p_type);
    }
}

class PlayerDemo 
{
    public static void main(String[] args) 
    {
        Cricket_Player c = new Cricket_Player("Dhoni", "Cricket", 45);
        Football_Player f = new Football_Player("Robert", "Football", 34);
        Hockey_Player h = new Hockey_Player("Peter", "Hockey", 34);
        c.show();
        f.show();
        h.show();
    }
}