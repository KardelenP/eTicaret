package eTicaret.dataAccess.concretes;




import java.util.ArrayList;

import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class HiberUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + "adl� kullan�c� eklendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + "adl� kullan�c� silindi");
			
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + "adl� kullan�c� bilgleri g�ncellendi");
		
	}

	@Override
	public User get(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	



}
