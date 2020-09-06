package tic.toe.game;

/**
 *
 * @author ahmed sameh
 */
    import java.util.Scanner;
public class TicToeGame {
    public static void main(String[] args) {
        char[][]arr={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        do {
                playing(arr); 
           }while(check(arr)==false);
    }
   
    public static void draw (char[][]arr)
    {
         System.out.println(" ____________________");
         System.out.println("|   "+arr[0][0]+"  |   "+arr[0][1]+"  |   "+arr[0][2]+"  |");
         System.out.println(" ____________________");
         System.out.println("|   "+arr[1][0]+"  |   "+arr[1][1]+"  |   "+arr[1][2]+"  |");
         System.out.println(" ____________________");
         System.out.println("|   "+arr[2][0]+"  |   "+arr[2][1]+"  |   "+arr[2][2]+"  |");
         System.out.println(" ____________________");
    }
    public static boolean check (char[][]arr)
    {
    for(int i=0;i<=2;i++)
    {
    if((arr[i][0]==arr[i][1])&&(arr[i][1]==arr[i][2]))
    {
       if(check_x_or_y(arr[i][0])==true)
           return true;
    }
    else if((arr[0][i]==arr[1][i])&&(arr[1][i]==arr[2][i]))
    {
       if(check_x_or_y(arr[0][i])==true)
           return true;
    }
    }
    if(arr[0][0]==arr[1][1]&&arr[1][1]==arr[2][2])
    {
        if(check_x_or_y(arr[0][0])==true)
           return true;
    }
    else if(arr[0][2]==arr[1][1]&&arr[1][1]==arr[2][0])
    {
        if(check_x_or_y(arr[0][2])==true)
           return true;
    }
    else if(arr[0][0]!='1'&&arr[0][1]!='2'&&arr[0][2]!='3'&&arr[1][0]!='4'
            &&arr[1][1]!='5'&&arr[1][2]!='6'&&arr[2][0]!='7'&&arr[2][1]!='8'
            &&arr[2][2]!='9')
    {
        System.out.println("its Draw");
        return true;
    }
    return false;
    
    }
public static boolean check_x_or_y(char temp)
{
        if(temp=='X')
        {
        System.out.println("Player X won");
        return true;
        }
        else if (temp=='O')
        {
        System.out.println("Player O won");
        return true;
        }
        else
        return false;
}
   public static void playing (char [][]arr)
   {
   System.out.println("choose the number of square you want to play in(1,2,.....,9)");
   draw(arr);
   System.out.print("player X : ");
   Scanner input =new Scanner(System.in);
   int x=input.nextInt();
   put(arr,x,'x');
   draw(arr);
   if(check(arr)==false)
   {
   System.out.print("player O : ");
   int y=input.nextInt();
   put(arr,y,'o');
   draw(arr);

   }
   }
public static void put (char[][]arr,int x,char p)
{
switch(x)
{
    case 1 :
        if(p=='x')
            arr[0][0]='X';
        else if(p=='o')
            arr[0][0]='O';
        break;
    case 2 :
        if(p=='x')
            arr[0][1]='X';
        else if(p=='o')
            arr[0][1]='O';
        break;
    case 3 :
        if(p=='x')
            arr[0][2]='X';
        else if(p=='o')
            arr[0][2]='O';
        break;
    case 4 :
        if(p=='x')
            arr[1][0]='X';
        else if(p=='o')
            arr[1][0]='O';
        break;
    case 5 :
        if(p=='x')
            arr[1][1]='X';
        else if(p=='o')
            arr[1][1]='O';
        break;
    case 6 :
        if(p=='x')
            arr[1][2]='X';
        else if(p=='o')
            arr[1][2]='O';
        break;
    case 7 :
        if(p=='x')
            arr[2][0]='X';
        else if(p=='o')
            arr[2][0]='O';
        break;
    case 8 :
        if(p=='x')
            arr[2][1]='X';
        else if(p=='o')
            arr[2][1]='O';
        break;
    case 9 :
        if(p=='x')
            arr[2][2]='X';
        else if(p=='o')
            arr[2][2]='O';
        break;
    default:
        break;
}
}

}
