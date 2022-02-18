public class BmiService {
    public static float calculate(float height, int weight) {
        return (weight / (height * height));// вывод ИМТ
    }
}
