package com.PraticePrograms;

class ProductException extends RuntimeException {

    ProductException(String message) {
        super(message);
    }


}

public class CustomExceptions {

    public void productDataCheck(int id) {
        if (id > 60) {
            throw new ProductException("Weight not matched....");
        } else {
            System.out.println("Weight matched....");
        }
    }

    public static void main(String[] args) {
        CustomExceptions cus = new CustomExceptions();
        cus.productDataCheck(10);
    }

}
