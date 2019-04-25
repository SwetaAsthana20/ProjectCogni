package p1;
import java.net.*;
 

public class UDPReceiver2
{
	String lineFin;
	static String line1="";
	String ext1;
	String type;
	
	

	public UDPReceiver2()
	{
		try
		{
			byte data[]= new byte[1024];
			DatagramSocket ds= new DatagramSocket(1096);
			DatagramPacket dp= new DatagramPacket(data,data.length);
			String line=null;
			while(true)
			{
				ds.receive(dp);
				line= new String(dp.getData(),0,dp.getLength());
				if(line.equals(".xml")||line.equals(".txt")||line.equals(".json")||line.equals(".csv")||line.equals("form"))
				{
					FileDetails.setExtension(line);
					System.out.println(FileDetails.getExtension());
					break;
				}
				else
				{
					FileDetails.setContent(line);
					System.out.println(FileDetails.getContent());
				}
				

			}
	
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	
	}

	
}