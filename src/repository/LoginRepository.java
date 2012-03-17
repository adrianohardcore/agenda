package repository;

import model.Dusr;

public interface LoginRepository {

	Dusr autenticar(Integer usuario, String senha);

}