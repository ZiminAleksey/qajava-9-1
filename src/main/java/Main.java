import ru.netology.domain.FormDate;
import ru.netology.domain.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Кондратий";
        post.passport = "1234 № 123456";
        post.patronymic = "Александрович";
        post.phone = "+7 (457)-123-456-78";
        post.surname = "Звезда";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 16;
        post.birthday.month = 11;
        post.birthday.year = 1999;
    }
}
