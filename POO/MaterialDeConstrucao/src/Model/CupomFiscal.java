package Model;

import java.time.OffsetDateTime;


public class CupomFiscal {

	private String data;
	private String descricao;
	private int qt;
	private double valorTotal;

	public String getDate() {
		return data;
	}

	public void setDate() {
		this.data = OffsetDateTime.now().getDayOfMonth() + "/" + OffsetDateTime.now().getMonthValue() + "/" + OffsetDateTime.now().getYear();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQt() {
		return qt;
	}

	public void setQt(int qt) {
		this.qt = qt;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
