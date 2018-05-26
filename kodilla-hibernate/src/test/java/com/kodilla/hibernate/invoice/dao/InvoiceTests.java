package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceTests {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("mug");
        Product product2 = new Product("plate");

        Item item1 = new Item(product1, new BigDecimal("3.50"), 3);
        Item item2 = new Item(product2, new BigDecimal("5.50"), 10);
        Item item3 = new Item(product2, new BigDecimal("15.70"), 4);

        Invoice invoice1 = new Invoice("FV-16666666666");
        invoice1.setItems(Arrays.asList(item1, item2, item3));

        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        Assert.assertNotEquals(0, id);
        Assert.assertEquals(2, productDao.count());
        Assert.assertEquals(3, itemDao.count());
        Assert.assertEquals(1, invoiceDao.count());

        //Clean up
        invoiceDao.deleteAll();
        productDao.deleteAll();
        itemDao.deleteAll();
    }
}
