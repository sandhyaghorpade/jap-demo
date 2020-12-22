package com.cg.training.pl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.cg.training.entity.User;



public class UserTester {

	public static void main(String[] args) throws IOException {
		EntityManager em=null;
		try {
			em=Persistence.createEntityManagerFactory("jap-demo")
					.createEntityManager();

	em.getTransaction().begin();
	User user=new User();
	user.setUserName("mike5");
	user.setPassword("password");
	// Setting Current Date
	user.setCreationTime(new Date());
	user.setDateofBirth(new Date());
	//On windows new File("img\\JBDFav300.png")
	File file = new File("img/books.jpeg");
	byte[] picInBytes = new byte[ (int) file.length()];
	FileInputStream fileInputStream = new FileInputStream(file);
	fileInputStream.read(picInBytes);
	fileInputStream.close();
	user.setProfilePic(picInBytes);
	    
	em.persist(user);
	em.getTransaction().commit();            
    System.out.println("1 customer added to table");
	System.out.println(user.getProfilePic());
		}catch(PersistenceException e) {
		e.printStackTrace();
		}finally {
            em.close();
        }
	}
	


}
