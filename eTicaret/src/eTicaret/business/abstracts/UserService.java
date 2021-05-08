package eTicaret.business.abstracts;

import eTicaret.entities.concretes.User;

public interface UserService {

	void delete(User user);

	void update(User user);

	void add(User user);

}
