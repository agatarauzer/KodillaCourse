package Food2DoorOrderingSystemTest;

import com.kodilla.good.patterns.challenges.Food2DoorOrderingSystem.*;
import com.kodilla.good.patterns.challenges.Food2DoorOrderingSystem.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OrderProcessorTest {
    private OrderProcessor orderProcessor;
    private Producer extraFoodShop;
    private Producer healthyShop;
    private Producer glutenFreeShop;
    private Producers producersList;

    @Before
    public void createData() {
        extraFoodShop = new SingleProducer("ExtraFoodShop");
        healthyShop = new SingleProducer("HealthyShop");
        glutenFreeShop = new SingleProducer("GlutenFreeShop");

        producersList = new Producers();
        producersList.addProducer(extraFoodShop);
        producersList.addProducer(healthyShop);
        producersList.addProducer(glutenFreeShop);

        Product butter = new Product("butter", 5, "pound", "1111");
        Product milk = new Product("milk", 30, "quart", "2222");
        Product pumpkin = new Product("pumpkin", 10, "unit", "3333");
        Product zucchini = new Product("zucchini", 40, "pound", "4444");
        Product aubergine = new Product("aubergine", 30, "pound", "5555");

        extraFoodShop.addProduct(butter);
        extraFoodShop.addProduct(milk);
        healthyShop.addProduct(pumpkin);
        healthyShop.addProduct(zucchini);
        glutenFreeShop.addProduct(aubergine);

        orderProcessor = new OrderProcessor();
    }

    @Test
    public void orderIsCompletedTest() {
        //Given
        Order correctOrder = new Order("3333", 3);

        //When
        boolean isOrderCompleted = orderProcessor.processOrder(healthyShop, correctOrder);

        //Then
        Assert.assertTrue(isOrderCompleted);
    }

    @Test
    public void orderForNotExistingProductTest() {
        //Given
        Order incorrectOrder = new Order("9999", 3);

        //When
        boolean isOrderCompleted = orderProcessor.processOrder(healthyShop, incorrectOrder);

        //Then
        Assert.assertFalse(isOrderCompleted);
    }

    @Test
    public void orderForNotAvailableQuantityOfProduct() {
        //Given
        Order incorrectOrder = new Order("1111", 6);

        //When
        boolean isOrderCompleted = orderProcessor.processOrder(healthyShop, incorrectOrder);

        //Then
        Assert.assertFalse(isOrderCompleted);
    }
}
