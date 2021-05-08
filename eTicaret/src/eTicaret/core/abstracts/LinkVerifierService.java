package eTicaret.core.abstracts;

import eTicaret.entities.concretes.User;

public interface LinkVerifierService {
	boolean clickToVerify(User user);

}
