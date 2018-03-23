package com.company.sample.web.customer;

import com.company.sample.entity.CustomerDetails;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.sample.entity.Customer;

import javax.inject.Inject;

public class CustomerEdit extends AbstractEditor<Customer> {

    @Inject
    private Metadata metadata;

    @Override
    protected void initNewItem(Customer item) {
        CustomerDetails customerDetails = metadata.create(CustomerDetails.class);
        item.setDetails(customerDetails);
    }
}