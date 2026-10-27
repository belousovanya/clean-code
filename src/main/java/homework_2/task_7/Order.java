package homework_2.task_7;

public class Order {
    private String item;
    private int sale;
    private String paymentMethod;

    private Order(OrderBuilder orderBuilder) {
        this.item = orderBuilder.item;
        this.sale = orderBuilder.sale;
        this.paymentMethod = orderBuilder.paymentMethod;
    }

    @Override
    public String toString() {
        return "Order{" +
                "item='" + item + '\'' +
                ", sale=" + sale +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

    static class OrderBuilder {
        private String item;
        private int sale;
        private String paymentMethod;

        public OrderBuilder setItem(String item) {
            this.item = item;
            return this;
        }

        public OrderBuilder setSale(int sale) {
            this.sale = sale;
            return this;
        }

        public OrderBuilder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
