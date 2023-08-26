package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompanyService {
    private List<Company> companies = new ArrayList<>();

    public boolean searchCompany(String name) {
        Iterator<Company> companyIterator = companies.stream()
                .filter(o -> o.getName().equals("%a%"))
                .iterator();
        while (companyIterator.hasNext()) {
            Company theComapny = companyIterator.next();
        }
        return false;

    }
}

