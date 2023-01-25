public abstract class GoodsAndServices {
        private String name;
        private int price;
        private int count;
        private String measureUnit;

        public String getName() {
            return name;
        }

        public GoodsAndServices setName(String name) {
            this.name = name;
            return this;
        }

        public int getCount() {
            return count;
        }

        public GoodsAndServices setCount(int count) {
            this.count += count;
            return this;
        }

        public String getMeasureUnit() {
            return measureUnit;
        }

        public void setMeasureUnit(String measureUnit) {
            this.measureUnit = measureUnit;
        }

        public int getPrice() {
            return price;
        }

        public GoodsAndServices setPrice(int price) {
            this.price = price;
            return this;
        }

        @Override
        public String toString() {
            return name;
        }

}
