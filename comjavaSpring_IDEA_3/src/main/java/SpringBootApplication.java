import org.springframework.boot.SpringApplication;

public class SpringBootApplication {
    @org.springframework.boot.autoconfigure.SpringBootApplication
    public class SpringDemoApplication {
        public void main(String[] args) {
            SpringApplication.run(SpringDemoApplication.class, args);
        }
    }
}
