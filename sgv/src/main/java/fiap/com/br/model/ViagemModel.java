package fiap.com.br.model;

public class ViagemModel {

	private double DistanciaViagem;
	private double VelocidadeMedia;
	private double TempoViagem;
	private int ViagemEmHoras;
	private int ViagemEmMinutos;



	
	public ViagemModel(double distanciaViagem, double velocidadeMedia, double tempoViagem, int viagemEmHoras,
			int viagemEmMinutos) {
		super();
		DistanciaViagem = distanciaViagem;
		VelocidadeMedia = velocidadeMedia;
		TempoViagem = tempoViagem;
		ViagemEmHoras = viagemEmHoras;
		ViagemEmMinutos = viagemEmMinutos;
	}

	public int getViagemEmHoras() {
		return ViagemEmHoras;
	}

	public void setViagemEmHoras(int viagemEmHoras) {
		ViagemEmHoras = viagemEmHoras;
	}

	public int getViagemEmMinutos() {
		return ViagemEmMinutos;
	}

	public void setViagemEmMinutos(int viagemEmMinutos) {
		ViagemEmMinutos = viagemEmMinutos;
	}

	public ViagemModel() {
		super();
	}

	public double getDistanciaViagem() {
		return DistanciaViagem;
	}

	public void setDistanciaViagem(double distanciaViagem) {
		DistanciaViagem = distanciaViagem;
	}

	public double getVelocidadeMedia() {
		return VelocidadeMedia;
	}

	public void setVelocidadeMedia(double velocidadeMedia) {
		VelocidadeMedia = velocidadeMedia;
	}
	
	public double getTempoViagem() {
		return TempoViagem;
	}

	public void setTempoViagem(double tempoViagem) {
		TempoViagem = tempoViagem;
	}
	
}

