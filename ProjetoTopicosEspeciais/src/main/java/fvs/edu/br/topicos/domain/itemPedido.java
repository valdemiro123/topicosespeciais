package fvs.edu.br.topicos.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class itemPedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@EmbeddedId
	private itemPedidoPK id = new itemPedidoPK();

	private Double desconto;
	private Double preco;
	private Integer quantidade;
	
	
	public itemPedido() {
		
		
	}


	public itemPedido(Pedido pedido,Produto produto,Double desconto, Double preco, Integer quantidade) {
		super();
		id.setPedido(pedido);
		id.setProduto(produto);
		this.desconto = desconto;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	public Produto getProduto() {
		return id.getProduto();
	}
	
	@JsonIgnore
	public Pedido getpedido() {
		return id.getPedido();
	}
	
	public itemPedidoPK getId() {
		return id;
	}


	public void setId(itemPedidoPK id) {
		this.id = id;
	}


	public Double getDesconto() {
		return desconto;
	}


	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		itemPedido other = (itemPedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
