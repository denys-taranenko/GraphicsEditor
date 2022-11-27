public class Main {

    public static void main(String[] args) {
        Shape shape = new Quad() {
            @Override
            public String sayYourName() {
                return super.sayYourName();
            }
        };
        System.out.println(shape.sayYourName());
    }
}
