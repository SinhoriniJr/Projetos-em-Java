package Hospital;

public class Paciente {
	
	private String nome;
	private TipoAtendimento atendimento;
	private TipoClassificacao classificacao;
	
	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paciente(String nome, TipoAtendimento atendimento, TipoClassificacao classificacao) {
		super();
		this.nome = nome;
		this.atendimento = atendimento;
		this.classificacao = classificacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoAtendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(TipoAtendimento atendimento) {
		this.atendimento = atendimento;
	}

	public TipoClassificacao getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(TipoClassificacao classificacao) {
		this.classificacao = classificacao;
	}
	
}
