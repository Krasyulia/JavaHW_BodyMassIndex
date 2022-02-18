public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 65;
        float height = 1.5F;
        float index = service.calculate(height, weight);
        System.out.println(index);
    }
}
