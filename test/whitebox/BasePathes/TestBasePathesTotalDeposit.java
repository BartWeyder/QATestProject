package whitebox.BasePathes;


/**
 * Created by Eugenij Kizim on 08-Dec-17.
 */

import static org.junit.Assert.*;

import java.util.Calendar;

import order.Order;
import order.OrderItem;
import order.ProductType;
import order.ShipmentType;

import org.junit.Test;

import deposit.TotalDeposit;

public class TestBasePathesTotalDeposit {

    private static final Calendar calendar = Calendar.getInstance();
    @Test
    public void test_1() {
        calendar.set(2018, 5, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 11, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 11) < 1e-2);
    }
    @Test
    public void test_2() {
        calendar.set(2018, 11, 10);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 11, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 11) < 1e-2);
    }
    @Test
    public void test_3() {
        calendar.set(2017, 11, 10);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 11, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 12.05) < 1e-2);
    }
    @Test
    public void test_4() {
        calendar.set(2019, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 11, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 12.05) < 1e-2);
    }
    @Test
    public void test_5() {
        calendar.set(2018, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 500, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 398.56) < 1e-2);
    }
    @Test
    public void test_6() {
        calendar.set(2018, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 2, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 3.05) < 1e-2);
    }
    @Test
    public void test_7() {
        calendar.set(2018, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 3, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 4.2) < 1e-2);
    }
    @Test
    public void test_8() {
        calendar.set(2008, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 501, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 465.16) < 1e-2);
    }
    @Test
    public void test_9() {
        calendar.set(2018, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 100, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 82.66) < 1e-2);
    }
    @Test
    public void test_10() {
        calendar.set(2018, 0, 2);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 100, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 90.56) < 1e-2);
    }
    @Test
    public void test_11() {
        calendar.set(2018, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 25, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 65.41) < 1e-2);
    }
    @Test
    public void test_12() {
        calendar.set(2008, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL);
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 100, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 108.01) < 1e-2);
    }
    @Test
    public void test_13() {
        calendar.set(2018, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 25, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 24.3) < 1e-2);
    }
    @Test
    public void test_14() {
        calendar.set(2018, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL);
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 49, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 64.66) < 1e-2);
    }
    @Test
    public void test_15() {
        calendar.set(2018, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 20, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 18.65) < 1e-2);
    }
    @Test
    public void test_16() {
        calendar.set(2018, 0, 2);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL);
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 112, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 109.81) < 1e-2);
    }
    @Test
    public void test_17() {
        calendar.set(2018, 0, 3);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 113, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 140.21) < 1e-2);
    }
    @Test
    public void test_18() {
        calendar.set(2018, 0, 5);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 111, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 158.71) < 1e-2);
    }
    @Test
    public void test_19() {
        calendar.set(2018, 0, 6);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 112, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 93.76) < 1e-2);
    }
    @Test
    public void test_20() {
        calendar.set(2018, 0, 7);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 113, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 94.41) < 1e-2);
    }
    @Test
    public void test_21() {
        calendar.set(2018, 0, 9);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 115, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 143.26) < 1e-2);
    }
    @Test
    public void test_22() {
        calendar.set(2018, 0, 10);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 116, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 97.61) < 1e-2);
    }
    @Test
    public void test_23() {
        calendar.set(2018, 0, 11);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 117, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 98.46) < 1e-2);
    }
    @Test
    public void test_24() {
        calendar.set(2018, 0, 12);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.MUSIC, 1, 118, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 145.81) < 1e-2);
    }
    @Test
    public void test_25() {
        calendar.set(2018, 0, 13);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 119, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 98.81) < 1e-2);
    }
    @Test
    public void test_26() {
        calendar.set(2018, 0, 14);
        Order order = new Order();
        order.setShipment(null);
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 120, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 99.66) < 1e-2);
    }
    @Test
    public void test_27() {
        calendar.set(2018, 0, 15);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 121, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 147.01) < 1e-2);
    }
    @Test
    public void test_28() {
        calendar.set(2018, 0, 18);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 24, true));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 87.51) < 1e-2);
    }
    @Test
    public void test_29() {
        calendar.set(2018, 0, 2);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 98, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 88.52) < 1e-2);
    }
    @Test
    public void test_30() {
        calendar.set(2018, 11, 18);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL);
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 100, true));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 111) < 1e-2);
    }
    @Test
    public void test_31() {
        calendar.set(2008, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 501, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 465.16) < 1e-2);
    }
    @Test
    public void test_32() {
        calendar.set(2008, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 501, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 399.16) < 1e-2);
    }
    @Test
    public void test_33() {
        calendar.set(2008, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 501, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 399.36) < 1e-2);
    }
    @Test
    public void test_34() {
        calendar.set(2018, 0, 2);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.ELECTRONICS, 1, 100, true));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 102.55) < 1e-2);
    }
    @Test
    public void test_35() {
        calendar.set(2018, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.FURNITUREDECOR, 1, 25, true));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 49.29) < 1e-2);
    }
    @Test
    public void test_36() {
        calendar.set(2018, 0, 14);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 12, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 11.85) < 1e-2);
    }
    @Test
    public void test_37() {
        calendar.set(2018, 0, 14);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.VIDEO, 1, 13, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 14.9) < 1e-2);
    }
    @Test
    public void test_38() {
        calendar.set(2018, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 40, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 36.85) < 1e-2);
    }
    @Test
    public void test_39() {
        calendar.set(2018, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 20, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 21.65) < 1e-2);
    }
    @Test
    public void test_40() {
        calendar.set(2018, 0, 18);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.5, true));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 66.84) < 1e-2);
    }
    @Test
    public void test_41() {
        calendar.set(2018, 0, 19);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 400, true));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 339.55) < 1e-2);
    }
    @Test
    public void test_42() {
        calendar.set(2018, 0, 20);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 801111, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 704950.24) < 1e-2);
    }
    @Test
    public void test_43() {
        calendar.set(2018, 0, 18);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 501, 1, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - (-1272.54)) < 1e-2);
    }
    @Test
    public void test_44() {
        calendar.set(2018, 0, 19);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 2.05) < 1e-2);
    }
    @Test
    public void test_45() {
        calendar.set(2018, 0, 18);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 501, 1, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - -1273.98) < 1e-2);
    }
    @Test
    public void test_46() {
        calendar.set(2018, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 501, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 465.16) < 1e-2);
    }
    @Test
    public void test_47() {
        calendar.set(2018, 0, 2);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 502, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 500, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 955.32) < 1e-2);
    }
    @Test
    public void test_48() {
        calendar.set(2018, 0, 18);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.5, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 63.85) < 1e-2);
    }
    @Test
    public void test_49() {
        calendar.set(2018, 0, 18);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 501, 1, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, true));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 631.8) < 1e-2);
    }
    @Test
    public void test_50() {
        calendar.set(2018, 0, 20);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 801111, true));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 704953.23) < 1e-2);
    }
    @Test
    public void test_51() {
        calendar.set(2018, 0, 18);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 501, 1, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - (-1273.98)) < 1e-2);
    }
    @Test
    public void test_52() {
        calendar.set(2018, 0, 18);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 501, 1, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.5, true));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 33730.24) < 1e-2);
    }
    @Test
    public void test_53() {
        calendar.set(2018, 0, 18);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 501, 1, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.5, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - (-1275.93)) < 1e-2);
    }
    @Test
    public void test_56() {
        calendar.set(2018, 0, 18);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 501, 1, true));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 626.25) < 1e-2);
    }
    @Test
    public void test_57() {
        calendar.set(2018, 0, 18);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.5, true));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 51.29) < 1e-2);
    }
    @Test
    public void test_58() {
        calendar.set(2018, 0, 18);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.5, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 4.59) < 1e-2);
    }
    @Test
    public void test_59() {
        calendar.set(2018, 0, 18);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 501, 1, true));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 400, true));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 971.35) < 1e-2);
    }
    @Test
    public void test_60() {
        calendar.set(2018, 0, 18);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.JEWELRY, 501, 1, false));
        order.addOrderItem(new OrderItem(ProductType.CLOTHING, 1, 1, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 400, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 32159.98) < 1e-2);
    }
    @Test
    public void test_61() {
        calendar.set(2018, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 3, false));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.5, false));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 110.56) < 1e-2);
    }
    @Test
    public void test_62() {
        calendar.set(2018, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.DOMESTIC);
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 3, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.5, true));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 9.73) < 1e-2);
    }
    @Test
    public void test_63() {
        calendar.set(2018, 0, 1);
        Order order = new Order();
        order.setShipment(ShipmentType.INTERNATIONAL_EXPEDITED);
        order.addOrderItem(new OrderItem(ProductType.BOOKS, 1, 50, true));
        order.addOrderItem(new OrderItem(ProductType.WATCHES, 1, 0.5, true));
        order.setDate(calendar.getTime());
        double totalDeposit = new TotalDeposit(order).getTotalDeposit();
        System.out.println(totalDeposit);
        assertTrue(Math.abs(totalDeposit - 153.5) < 1e-2);
    }

}
