public class HomeWork_4_present {

    public static void main(String[] args) {
        HappyNewYearPresent array [] = new HappyNewYearPresent [2];
        array [0] = new Sweet("Sweet", 100, 50, "тает во рту");
        array [1] = new Cake ("Cake", 500, 1000,"низкокалорийный");

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
        System.out.println(" Состав подарка: " + name +" " +w +"кг" +" " +p +"руб");
        System.out.println ("Уникальность сладостей:" );
        for (int i = 0; i < array.length; i++){
            System.out.println (array [i].ingredients());
        }

    }

    public static class HappyNewYearPresent {
        private String name;
        private int weight;
        private int price;

        String ingredients (){
            return name +" " + weight +" " +price;
        }

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

    public static class Sweet extends HappyNewYearPresent {
        String keySweet;
        public Sweet(String name, int weight, int price, String keySweet) {
            super(name, weight, price);
            this.keySweet = keySweet;
        }

        @Override
        String ingredients() {
            return super.ingredients()+" " + keySweet;
        }

        public String getKeySweet() {
            return keySweet;
        }

        public void setKeySweet(String keySweet) {
            this.keySweet = keySweet;
        }
    }
    public static class Cake extends HappyNewYearPresent {
        String keyCake;

        public Cake(String name, int weight, int price, String keyCake) {
            super(name, weight, price);
            this.keyCake = keyCake;
        }

        @Override
        String ingredients() {
            return super.ingredients()+" " +keyCake;
        }

        public String getKeyCake() {
            return keyCake;
        }

        public void setKeyCake(String keyCake) {
            this.keyCake = keyCake;
        }
    }

}