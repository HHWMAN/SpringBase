package rabbitmq;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestMQ {
    public static void main(String[] args) {
        com.rabbitmq.client.ConnectionFactory rabbitmqConnectionFactory = new com.rabbitmq.client.ConnectionFactory();
        rabbitmqConnectionFactory.setHost("localhost");
        rabbitmqConnectionFactory.setVirtualHost("/");
        rabbitmqConnectionFactory.setUsername("guest");
        rabbitmqConnectionFactory.setPassword("guest");
        ConnectionFactory connectionFactory = new CachingConnectionFactory(rabbitmqConnectionFactory);
        //connectionFactory.createConnection().createChannel(true);

        System.out.println(connectionFactory.getVirtualHost());
        System.out.println(connectionFactory.getUsername());
        AmqpAdmin admin = new RabbitAdmin(connectionFactory);
        admin.declareQueue(new Queue("myqueue"));
        AmqpTemplate template = new RabbitTemplate(connectionFactory);
        template.convertAndSend("myqueue", "foo");
        String foo = (String) template.receiveAndConvert("myqueue");
    }
}
