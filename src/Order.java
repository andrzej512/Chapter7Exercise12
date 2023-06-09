import java.util.Objects;

public class Order {
    private Integer orderId;
    private String name;
    private Double price;

    public Order(Integer orderId, String name, Double price) {
        this.name = name;
        this.price = price;
        this.orderId = orderId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderId, order.orderId) && Objects.equals(name, order.name) && Objects.equals(price, order.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, name, price);
    }
}
