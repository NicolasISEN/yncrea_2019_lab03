package yncrea.lab03.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab03.core.dao.CompanyRepository;
import yncrea.lab03.core.entity.Company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CompanyService {
    //TODO inject a DAO
    private CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public void deleteAll() {
        //TODO implement
        companyRepository.deleteAll();
    }


    public void save(final Company company) {
        //TODO implement
        companyRepository.save(company);
    }


    public long countAll() {
        //TODO implement
        return companyRepository.count();
    }


    public Map<String, Integer> getAllWithProjectCount() {
        //TODO return a map with the name of the company for the key and the count in the value
        Map<String,Integer> projectCount = new HashMap<>();
        List<Company> companies = (List<Company>) companyRepository.findAll();
        companies.forEach(company->{
            projectCount.put(company.getName(),company.getProjects().size());
        });


        return projectCount;
    }
}
