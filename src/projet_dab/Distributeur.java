package projet_dab;

import java.util.Random;

public class Distributeur {
	
	private int Solde;
	
	public Distributeur(){
		this.setSolde();
	}
		
	public void setSolde(){
		Random r = new Random();
		int Low = 10;
		int High = 100;
		this.Solde = r.nextInt(High-Low) + Low;
	}
	
	public String GetSolde(){
		return String.valueOf(this.Solde);
	}
	
	public boolean Retrait(int somme){
		this.Solde = this.Solde - somme;
		if(this.Solde >= 0){
			return true;
		}
		else{
			this.Solde = 0;
			return false;
		}
		
	}
}
