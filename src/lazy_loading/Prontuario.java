package lazy_loading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prontuario {

	private int id_pessoa;
	private Pessoa pessoa;
	private String medico;
	private String sintomas;
	private Date data_consulta;

	public Prontuario(int id_pessoa, String medico, String sintomas, Date data_consulta) {
		super();
		this.id_pessoa = id_pessoa;
		this.medico = medico;
		this.sintomas = sintomas;
		this.data_consulta = data_consulta;
	}

	public Pessoa getPessoa() {
		if (pessoa == null)
			pessoa = PessoaDao.getPessoa(id_pessoa);
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public Date getDataConsulta() {
		return data_consulta;
	}

	public void setDataConsulta(Date data_consulta) {
		this.data_consulta = data_consulta;
	}

	@Override
	public String toString() {
		return "Prontuario [id_pessoa=" + id_pessoa + ", pessoa=" + pessoa + ", medico=" + medico + ", sintomas="
				+ sintomas + ", data_consulta=" + new SimpleDateFormat("dd/MM/YYYY").format(data_consulta) + "]";
	}

}
