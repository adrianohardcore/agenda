package repository;

import model.Dusr;

public interface LoginRepository {

	Dusr autenticar(Short usuario, String senha);

}