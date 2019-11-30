/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery;

/**
 *
 * @author rjoli
 */
public class groceryclass extends calculateDiscount{
    
    /**
     *
     * @param price
     * @param discount
     * @return
     */
    @Override
    public Double getDiscountedPrice(String price, String discount) {
        double z;
        if(!"0".equals(discount)&&discount!=""&&discount!=null){
            z=Double.valueOf(price)-(Double.valueOf(price)*Double.valueOf(discount));
        }else{
            z=Double.valueOf(price);
        }
        return z;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double getTotalPrice(String discounted) {
         return Double.valueOf(discounted);
    }

    @Override
    public Double applySeniorDiscountPrice(String total) {
        return Double.valueOf(total)-(Double.valueOf(total)*.20);
    }

    @Override
    public Double getTotalCost(String price, String qty) {
        Double rprice =0d;
        if(!"0".equals(qty)&&!"".equals(qty)&&qty!=null){
            rprice=Double.valueOf(price)*Integer.valueOf(qty);
        }else{
            rprice=Double.valueOf(price);
        }
        return rprice;
    }
    
    
}
