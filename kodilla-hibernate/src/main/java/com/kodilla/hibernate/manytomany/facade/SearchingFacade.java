package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchingFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    public List<Employee> findEmployeesByLastNameContaining(String word) throws SearchingServiceException {
        List<Employee> employees = employeeDao.findEmploysByLastNameContainingWord(word);
        if (employees.size() > 0) {
            LOGGER.info("Founded: " + employees.size());
            return employees;
        }
        else {
            LOGGER.error(SearchingServiceException.ERR_EMPLOYEE_NOT_FOUND);
            throw new SearchingServiceException(SearchingServiceException.ERR_EMPLOYEE_NOT_FOUND);
        }
    }

    public List<Company> findComapniesByNameContaining(String word) throws SearchingServiceException {
         List<Company> companies = companyDao.findCompaniesWithNamesContainingWord(word);
         if (companies.size() > 0) {
            LOGGER.info("Founded: " + companies.size());
            return companies;
        }
         else {
            LOGGER.error(SearchingServiceException.ERR_COMPANY_NOT_FOUND);
            throw new SearchingServiceException(SearchingServiceException.ERR_COMPANY_NOT_FOUND);
        }
    }
}
