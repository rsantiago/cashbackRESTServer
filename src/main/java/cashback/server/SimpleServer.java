package cashback.server;
import static spark.Spark.*;

public class SimpleServer {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}