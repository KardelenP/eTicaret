package eTicaret.core.abstracts;

import eTicaret.entities.concretes.User;

public interface VerifyingService {

	 void sendVerifyingLink(User user);
	 boolean CheckIfVerified(User user);
}
