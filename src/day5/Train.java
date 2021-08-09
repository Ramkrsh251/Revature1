package day5;
public class Train{
	
	public void printStatment(Railway[] stations) {
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duranto Express (12213)");
		System.out.println("-------------------------------------------");
		System.out.println("#  Code   Station           Arr.    Dep.");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < stations.length; i++) {
			stations[i].printTable(i+1);;
		}
		System.out.println("-------------------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Railway[] station = {new Railway("YPR", "Yashvantpur Jn", 00.00, 23.40), 
							 new Railway("GTL", "Guntakal Jn", 03.45, 03.50), 
							 new Railway("SC", "Secundrabad Jn", 08.55, 09.10), 
							 new Railway("BPQ", "Balharshah", 13.10, 13.35),
							 new Railway("HPJ", "Habibganj", 21.20, 21.25),
							 new Railway("JHS", "Jhansi Jn", 01.15, 01.20),
							 new Railway("DEE", "Delhi S Rohilla", 07.00, 00.00)};
		
		Train t = new Train();
		t.printStatment(station);
	}
}