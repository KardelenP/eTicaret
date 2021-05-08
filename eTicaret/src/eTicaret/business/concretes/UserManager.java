package eTicaret.business.concretes;





import java.util.ArrayList;

import eTicaret.business.abstracts.UserService;
import eTicaret.core.abstracts.EmailValidatorService;
import eTicaret.core.abstracts.VerifyingService;
import eTicaret.core.concretes.EmailValidator;
import eTicaret.dataAccess.concretes.HiberUserDao;
import eTicaret.entities.concretes.User;

public class UserManager implements UserService{
	EmailValidatorService emailValidator;
	HiberUserDao userDao;
    VerifyingService verifyingService;
    ArrayList<User> users = new ArrayList<>();
    
   
    
    public UserManager(HiberUserDao userDao, EmailValidator emailValidator, VerifyingService verifyingService) {
        this.userDao = userDao;
        this.emailValidator = emailValidator;
        this.verifyingService = verifyingService;
		
    }

    
	@Override
    public void add(User user) {
        if (checkIfValidFirstAndLastName(user) && checkIfValidPassword(user) && checkIfValidEmail(user) && checkIfEmailExists(user)){
            verifyingService.sendVerifyingLink(user);
            if(verifyingService.CheckIfVerified(user)){
                userDao.add(user);
            }
            System.out.println("Kullanýcý eklendi: " + user.getFirstName());

        }else {
            System.out.println("Kayýt baþarýsýz: " + user.getFirstName());
        }
    }

	
	private boolean checkIfEmailExists(User user) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
    public void delete(User user) {

    }

	@Override
    public void update(User user) {

    }

    private boolean checkIfValidFirstAndLastName(User user){
        if(user.getFirstName().length()<2 && user.getLastName().length()<2){
            System.out.println("Kullanýcý ad ve soyadýnýz en az 2 karakterden oluþmalýdýr");
            return false;
        }
        return true;
    }

    private boolean checkIfValidPassword(User user){
        if(user.getPassword().length()<6){
            System.out.println("Kullanýcý parolanýz en az 6 karakterden oluþmalýdýr");
            return false;
        }
        return true;
    }

    private boolean checkIfValidEmail(User user){
        if(!emailValidator.isEmailValid(user.getEmail())){
            System.out.println("Geçersiz bir email adresi girdiniz");
            return false;
        }
        return true;
    }



}
