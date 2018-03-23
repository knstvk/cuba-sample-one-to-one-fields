package com.company.sample.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "SAMPLE_CUSTOMER_DETAILS")
@Entity(name = "sample$CustomerDetails")
public class CustomerDetails extends StandardEntity {
    private static final long serialVersionUID = -229993012177704711L;

    @Column(name = "ADDRESS")
    protected String address;

    @Column(name = "POSTCODE")
    protected String postcode;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPostcode() {
        return postcode;
    }


}