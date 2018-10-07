public class HomeWork_4_present {

    public static void main(String[] args) {
        HappyNewYearPresent array [] = new HappyNewYearPresent [2];
        array[0] = new HappyNewYearPresent("Sweet", 100, 50);
        array[1] = new HappyNewYearPresent("Cake", 500, 1000);
        int w = 0;
        int p = 0;
        String name = "";
        for (int i = 0; i < array.length; i++){
            w = w + array [i].getWeight();
            p = p + array [i].getPrice();
            name = name +  " " + array [i].getName();
        }
        System.out.println(" Общий вес подарка " + w);
        System.out.println(" Общая стоимость подарка " + p);
        System.out.println(" Состав подарка: " + name);
    }

    public static class HappyNewYearPresent {
        private String name;
        private int weight;
        private int price;

        public HappyNewYearPresent(String name, int weight, int price) {
            this.name = name;
            this.weight = weight;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

}