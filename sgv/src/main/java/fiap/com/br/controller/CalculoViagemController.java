package fiap.com.br.controller;
import fiap.com.br.model.*;

public class CalculoViagemController {
	
	private ViagemModel Viagem;
	private double TempoViagem;

	public double getTempoViagem() {
		return TempoViagem;
	}

	public void setTempoViagem(double tempoViagem) {
		TempoViagem = tempoViagem;
	}

	public ViagemModel getViagem() {
		return Viagem;
	}

	public void setViagem(ViagemModel Viagem) {
		this.Viagem = Viagem;
	}

	public CalculoViagemController(ViagemModel Viagem) {
		this.Viagem = Viagem;
	}
	
	public ViagemModel CalculoTempoViagem(ViagemModel Viagem) {
		
		double DistanciaViagem = Viagem.getDistanciaViagem();	
		Double VelocidadeMedia = Viagem.getVelocidadeMedia();
		TempoViagem = (DistanciaViagem/VelocidadeMedia);
		
		int horas = (int) Math.floor(DistanciaViagem);
		int minutos = (int) Math.floor((DistanciaViagem - horas) *60);
		
		Viagem.setViagemEmHoras(horas);
		Viagem.setViagemEmMinutos(minutos);
		
		return Viagem;
	}
}
