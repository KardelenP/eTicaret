package eTicaret.core.concretes;

import eTicaret.core.abstracts.LinkVerifierService;
import eTicaret.core.abstracts.VerifyingService;
import eTicaret.entities.concretes.User;

public class EmailVerifyingManager implements VerifyingService{

	LinkVerifierService verifier;

    public EmailVerifyingManager(LinkVerifierService verifier){
        this.verifier = verifier;
    }
	@Override
	public void sendVerifyingLink(User user) {
		System.out.println("Doðrulama linki gönderildi");
		
	}

	@Override
	public boolean CheckIfVerified(User user) {
		if(!verifier.clickToVerify(user)){
            return false;
        }
        return true;
		
		
	}

}
