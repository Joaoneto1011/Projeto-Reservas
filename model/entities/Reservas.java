package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservas {
	
	private Integer numeroQuarto;
	private Date chegada;
	private Date saida;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Reservas() {
		
	}
	
	public Reservas(Integer numeroQuarto, Date chegada, Date saida) {
		
        if (!saida.after(chegada)) {
			
			throw new DomainException("Erro na reserva: a data de saida deve ser posterior à data de chegada");
		}
        
		this.numeroQuarto = numeroQuarto;
		this.chegada = chegada;
		this.saida = saida;
	}
	
	public Integer getNumeroQuarto() {
		
		return numeroQuarto;
	}
	
	public void setNumeroQuarto(Integer numeroQuarto) {
		
		this.numeroQuarto = numeroQuarto;
	}
	
	public Date getChegada() {
		
		return chegada;
	}

	
	public Date getSaida() {
		
		return saida;
	}
	
	public long duracao() {
		
		long diff = saida.getTime() - chegada.getTime();
		
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void atualizarDatas(Date chegada, Date saida) {
		
		Date agora = new Date();
		
		if (chegada.before(agora) || saida.before(agora)) {
			
			throw new DomainException("Erro na reserva: as datas de reserva para atualização devem ser datas futuras");
		}
		
		if (!saida.after(chegada)) {
			
			throw new DomainException("Erro na reserva: a data de saida deve ser posterior à data de chegada");
		}
		
		this.chegada = chegada;
		this.saida = saida;
	}
	
	@Override
	
	public String toString() {
		
		return "Quarto "
				+ numeroQuarto
				+ ", chegada: "
		        + sdf.format(chegada)
		        + ", saida: " 
		        + sdf.format(saida) 
		        + ", "
		        + duracao()
		        + " noites";
	}

	
}
