package projet_dab;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class ClientDabSocket {
	
	private Socket dabSocket;
	private ObjectInputStream  in;
	private List<String> listeClientsRecu = new ArrayList<String>();
	private Object listeAmis = new Object();
	private String ClientId;
	public ClientDabSocket(){
		try {
			
		     this.dabSocket = new Socket(InetAddress.getLocalHost(),2008);
		     this.in = new ObjectInputStream(dabSocket.getInputStream());
		     this.ClientId = (String)in.readObject();
		     this.listeAmis= in.readObject();
		     this.listeClientsRecu = (List<String>) listeAmis;
		     System.out.println(this.listeClientsRecu);
             this.dabSocket.close();

		}catch (UnknownHostException e) {	
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public List<String> getisteAmis(){
		for(int i=0;i<this.listeClientsRecu.size();i++){
			if(this.listeClientsRecu.get(i)== this.ClientId){
				this.listeClientsRecu.remove(i);
			}
		}
		return this.listeClientsRecu;
	}
	
}
