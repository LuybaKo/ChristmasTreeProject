
    public class ChristmasTreeToy implements Comparable {
        String shape;
        String colour;
        int counter;

        @Override
        public int compareTo(Object o) {
            return this.counter -((ChristmasTreeToy)o).counter;
        }

        public ChristmasTreeToy(String shape, String colour, int counter) {
            this.shape = shape;
            this.colour = colour;
            this.counter = counter;
        }

        @Override
        public String toString() {
            return "форма игрушки: " + shape +", цвет: " + colour + ", цена за единицу: "+ counter;
        }
    }