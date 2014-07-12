package br.com.blogdofornias.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(value=XmlAccessType.FIELD)
public class ErroDTO implements Serializable {

	private static final long serialVersionUID = -6057820737419323540L;

	private Integer codigoErro;
	private String mensagemErro;

	public ErroDTO() {
	}

	public ErroDTO(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}

	public ErroDTO(Integer codigoErro, String message) {
		this.setCodigoErro(codigoErro);
		this.mensagemErro = message;
	}

	public String getMensagemErro() {
		return mensagemErro;
	}

	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}

	public Integer getCodigoErro() {
		return codigoErro;
	}

	public void setCodigoErro(Integer codigoErro) {
		this.codigoErro = codigoErro;
	}

}
