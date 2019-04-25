package p1;

import java.util.List; 
import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;
 
@Path("/UserService") 

public class UserService {  
   UserReceiverXml userDao = new UserReceiverXml();
   UserReceiverRest userDaocsv = new UserReceiverRest();
   UserReceiverJson userDaoJson= new UserReceiverJson();
//   long start = System.currentTimeMillis();
   UserReceiverRest userDaoCsv = new UserReceiverRest();
   @GET 
   @Path("/users") 
   @Produces(MediaType.APPLICATION_JSON)
   public List<Employee> getUsers(){
//	   FileDetails fff = new FileDetails();
//	   System.out.println(fff.getContent());
//	   UserDao uu = new UserDao();
//	   
//	   List<Employee> al = uu.getAllUsers();
//	   long end = System.currentTimeMillis();
//	   System.out.println("Time taken :- " + (end - start));
	   int c =0;
	   while(true)
	   {
		   UDPReceiver2 u1 = new UDPReceiver2();
		  // u1.run();
		   System.out.println("Returned");
		   System.out.println("UserService : "+FileDetails.getExtension());
		   if(FileDetails.getExtension().equals(".xml"))
			   	return userDao.getAllUsers();
		   else if(FileDetails.getExtension().equals(".json"))
			   	return userDaoJson.getAllUsers();
		   else
			   	return userDaoCsv.getAllUsers();
		   
		   } 
	   
//	   return al;
//	   return userDaoCsv.getAllUsers();
   }  
}
