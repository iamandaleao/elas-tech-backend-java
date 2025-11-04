public class ExemploTextBlock {
    public static void main(String[] args) {
        String sql = """
                Select id, namme, age FROM users
                WHERE age > 18
                ORDER  BY name
                """;
        System.out.println(sql);
    }
}
