import java.util.Scanner;
public class Part2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String cont = "N";
		int cardNum = 0;
		TwoDice td;
		do
		{
			//Start by getting player card number			
			System.out.print("Player, Please enter card number: ");
			cardNum = in.nextInt();			
			td = new TwoDice(cardNum);
			System.out.println("Your card point: " + td.Deal());
			
			//Get dealer card number;
			System.out.print("Dealer enter card number: ");
			cardNum = in.nextInt();
			Dice d = new Dice(cardNum);
			System.out.println("Dealer card point: " + d.Deal());
			
			/*if(d.GetCardPonit() > td.CardPoint())
				System.out.println("Dealer wins!!");
			else if(d.GetCardPonit() < td.CardPoint())
				System.out.println("Palyer wins!!");
			else if(d.GetCardPonit() == td.CardPoint())
				System.out.println("Deuce!!!");*/
			System.out.print(td.toString());
			
			System.out.println("Do you want to play again? ");
			cont = in.next();
		}while(cont.equalsIgnoreCase("Y"));

		
		//td.toString();
		//GameHistory history = new GameHistory();
		//history.toString();
		in.close();
	}
}
