package gmail.kymaxgen.task19;

enum Drinks implements Makeable{
    TEA(20) {
        @Override
        public void make() {
            System.out.println("Чайок готується... \nГотово!!");

        }
    },
    COFFEE(45) {
        @Override
        public void make() {
            System.out.println("Готую каву в додаванням любові... \nГотово!!");
        }
    },
    LEMONADE(25) {
        @Override
        public void make() {
            System.out.println("Готую лимонад... \nГотово!!");
        }
    },
    MOHITO(33) {
        @Override
        public void make() {
            System.out.println("Міксую мохіто... \nГотово!!");
        }
    },
    SPARKLING_WATER(10){
        @Override
        public void make() {
            System.out.println("Газую водичку, наливаю...");
        }
    },
    COLA(15){
        @Override
        public void make() {
            System.out.println("Наливаю колу... \nГотово!!");
        }
    };

    private final int price;

    Drinks(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

}







