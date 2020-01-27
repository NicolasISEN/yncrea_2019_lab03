package yncrea.lab03.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab03.core.dao.CompanyRepository;
import yncrea.lab03.core.entity.Company;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class CompanyService {

    CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public void deleteAll() {
        companyRepository.deleteAll();
    }


    public void save(final Company company) {
        companyRepository.save(company);
    }


    public long countAll() {
        return companyRepository.count();
    }


    public Map<String, Integer> getAllWithProjectCount() {
        Map<String, Integer> allWithProjectCount = new HashMap<>();
        final Iterable<Company> companies = companyRepository.findAll();

        for (Company company : companies){
            final int nbProject = company.getProjects().size();
            allWithProjectCount.put(company.getName(), nbProject);
        }



        return  allWithProjectCount;
    }
}
