package catalogue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BetterBasketTest {

	@Test
	void testAddProduct() {
        BetterBasket b = new BetterBasket();
        Product pr1 = new Product("0001", "Toaster", 10.00, 1);
        Product pr2 = new Product("0001", "Toaster", 10.00, 1);
        Product pr3 = new Product("0002", "Kettle", 15.00, 1);
        Product pr4 = new Product("0002", "Kettle", 15.00, 2);

        // Test pr1 and pr2 get condensed
        b.add(pr1);
        b.add(pr2);
        assertEquals(1, b.size(), "Size incorrect after merge");
        assertEquals(2, b.get(0).getQuantity(), "Quantity incorrect after merge");

        // Test that pr3 doesn't get condensed
        b.add(pr3);
        assertEquals(2, b.size(), "Size incorrect after non-merge");

        // Test that pr4 gets sorted
        b.add(pr4);
        assertEquals(3, b.get(1).getQuantity(), "Location incorrect after sort");
    }

	}


