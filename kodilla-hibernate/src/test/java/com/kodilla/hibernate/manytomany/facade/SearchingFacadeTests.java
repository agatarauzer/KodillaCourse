package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchingFacadeTests {
    @Autowired
    SearchingFacade searchingFacade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;


    @Test
    public void searchEmployeesByLastNameContainingWord_shouldReturnList() throws SearchingServiceException  {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaSmithsy = new Employee("Linda", "Smithsy");
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaSmithsy);

        //When
        List<Employee> employees = searchingFacade.findEmployeesByLastNameContaining("mith");

        //Then
        Assert.assertEquals(2, employees.size());

        //Clean-up
        employeeDao.delete(johnSmith.getId());
        employeeDao.delete(stephanieClarckson.getId());
        employeeDao.delete(lindaSmithsy.getId());
    }

    @Test(expected = SearchingServiceException.class)
    public void searchEmployeeByLastNameContainingWord_shouldThrowAnException() throws SearchingServiceException {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);

        //When
        List<Employee> employees = searchingFacade.findEmployeesByLastNameContaining("ooooo");

        //Clean-up
        employeeDao.delete(johnSmith.getId());
    }

    @Test
    public void searchCompaniesByLastNameContainingWord_shouldReturnList() throws SearchingServiceException {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        List<Company> companies = searchingFacade.findComapniesByNameContaining("ma");

        //Then
        Assert.assertEquals(3, companies.size());

        //Clean-up
        companyDao.delete(softwareMachine);
        companyDao.delete(dataMaesters);
        companyDao.delete(greyMatter);
    }

    @Test(expected = SearchingServiceException.class)
    public void searchCompaniesByNameContainingWord_shouldThrowAnException() throws SearchingServiceException {
        //Given
        Company softwareMachine = new Company("Software Machine");
        companyDao.save(softwareMachine);

        //When
        List<Company> companies = searchingFacade.findComapniesByNameContaining("wow");

        //Clean-up
        companyDao.delete(softwareMachine);
    }
}

