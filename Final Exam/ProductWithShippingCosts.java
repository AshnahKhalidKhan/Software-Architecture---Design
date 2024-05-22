// Please check the following scenario and make it LSP-compliant (5 Mark)

// Scenario:
// We have an online store system with classes representing different types of products: Product
// and DigitalProduct. Both classes have a method calculateShippingCost() that should
// determine the shipping cost for the product.

// Problem:
// This code violates the LSP because the calculateShippingCost() method in DigitalProduct
// simply returns 0, overriding the logic in the base class Product. This assumes all digital
// products have free shipping, but this might not be the case in all situations.

// Your Task:
// Modify the code to make the Product class LSP compliant.


public class Product {
    private double calculateWeightBasedCost() {
        // Implementation details for weight-based cost calculation
            return 0;
        }
}

public class ProductWithShippingCosts extends Product
{
    public double calculateShippingCost() {
        // Logic to calculate standard shipping cost based on weight and dimensions
            return super.calculateWeightBasedCost();
        }
}


public class DigitalProduct extends Product {}



   
// NOTE:
// So my understanding is:
// - We have products.
// - Product may have shipping costs, and some may have zero shipping costs. Everything
// in this will be same as product except shipping cost factor.
// - Zero shipping costs is the assumed general trait and having shipping costs is a special case.
// - We have a type of products called digital proucts.
// - Digital Products will always have free shipping cost so we do not need shipping cost
// calculation function in it.
// - So we can just make Products as parent class. Then make a child class ProductWithShippingCosts
// which has all attributes of Product but also additional attribute if product has shiiping costs.
// - Since Digital Products have free shiiping costs it extends only Product.
