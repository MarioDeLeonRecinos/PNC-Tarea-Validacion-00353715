package com.mario.capas.tarea4.domain;


import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {

	@Pattern(regexp = "[0-9]{12}", message = "Tiene que tener un numero de 12 digitos sin letras")
	String productCode;

	@Size(min = 1, max = 100, message = "El campo nombre del producto necesita por lo menos un caracter")
	String productName;

	@Size(min = 1, max = 100, message = "El campo Marca del producto necesita por lo menos un producto")
	String productMark;

	@Size(min = 1, max = 500, message = "El campo Descripcion del producto necesita por lo menos un caracter")
	String productDescription;

	@Pattern(regexp = "^\\d+$", message = "El campo Existencias necesita un numero")
	String productExistence;

	@Pattern(regexp = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", message = "La fecha debe ser de formato dd/mm/yyyy")
	String productIDate;

	public String getproductCode() {
		return productCode;
	}

	public void setproductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getproductName() {
		return productName;
	}

	public void setproductName(String productName) {
		this.productName = productName;
	}

	public String getproductMark() {
		return productMark;
	}

	public void setproductMark(String productMark) {
		this.productMark = productMark;
	}

	public String getproductDescription() {
		return productDescription;
	}

	public void setproductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getproductExistence() {
		return productExistence;
	}

	public void setproductExistence(String productExistence) {
		this.productExistence = productExistence;
	}

	public String getproductIDate() {
		return productIDate;
	}

	public void setproductIDate(String productIDate) {
		this.productIDate = productIDate;
	}

}
