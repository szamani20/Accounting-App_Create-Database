package database;

import gui.Products;
import java.io.Serializable;
import java.util.List;

public class Client implements Serializable {
    private static final long serialVersionUID = -418745565;

    private String name;
    private String lastName;
    private String phone;
    private String password;
    private List<Products> product;
    private List<Integer> price;
    private List<Integer> amount;
    private List<Integer> total;
    private List<Integer> payment;
    private List<Integer> debt;
    private List<Boolean> noDebt;
    private List<Integer> year;
    private List<Integer> month;
    private List<Integer> day;

    private Products productI;
    private Integer priceI;
    private Integer amountI;
    private Integer totalI;
    private Integer paymentI;
    private Integer debtI;
    private Boolean noDebtI;
    private Integer yearI;
    private Integer monthI;
    private Integer dayI;

    public Client(String name, String lastName, String phone, String password) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.password = password;
    }

}
