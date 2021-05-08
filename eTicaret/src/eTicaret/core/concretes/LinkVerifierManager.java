package eTicaret.core.concretes;

import eTicaret.core.abstracts.LinkVerifierService;
import eTicaret.entities.concretes.User;

public class LinkVerifierManager implements LinkVerifierService{

	@Override
	public boolean clickToVerify(User user) {
		return false;
	}

}
