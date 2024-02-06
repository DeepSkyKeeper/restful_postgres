package spring_homework.restful_postgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulPostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulPostgresApplication.class, args);
	}
//1.При помощи Docker создайте базу данных выполните подключение к ней
	/**
	 docker run --name pgdb-postgres -d -p 5432:5432 -e POSTGRES_DB=testdb -e POSTGRES_USER=dsk -e
	 POSTGRES_PASSWORD=deeppas postgres:alpine
	 */
// 2.Создайте класс и добавьте аннотацию к данному классу
// 3.Добавьте дополнительно аннотацию Entity для того, чтобы Spring нашел вашу модель
// 4.Пропишите все необходимые колонки. как показано в уроке при помощи аннтации Column
//5.Создайте контроллер в котором будет получение всех элементов: получение элементов
// по id и удаление

}
