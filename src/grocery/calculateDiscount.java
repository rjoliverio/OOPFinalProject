package grocery;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rjoli
 */
abstract class calculateDiscount{
    abstract public Double getDiscountedPrice(String price,String discount);
    abstract public Double getTotalPrice(String discounted);
    abstract public Double applySeniorDiscountPrice(String total);
    abstract public Double getTotalCost(String price,String qty);
}
