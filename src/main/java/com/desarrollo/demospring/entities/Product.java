package com.desarrollo.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import java.math.BigDecimal;

/**
 * Product entity.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private String productId;
    public Product() {
		super();
	}
    
    public String getProductId() {
		return productId;
	}
	public Integer getId() {
		return id;
	}
	public Integer getVersion() {
		return version;
	}
	public String getName() {
		return name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	private Integer id;

    @Version
    private Integer version;

    
	private String name;
    private BigDecimal price;
}
