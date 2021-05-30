package lazy_loading;

public class PessoaDao {

	public static Pessoa getPessoa(int id) {
		return new Pessoa(id, "Fulano", "12345678900");//em um projeto real seria substituido por método de busca em banco de dados
	}

}
