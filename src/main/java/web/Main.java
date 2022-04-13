//package web;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import web.config.AppConfig;
//import web.model.User;
//import web.service.UserService;
//
//public class Main {
//    private static AnnotationConfigApplicationContext context =
//            new AnnotationConfigApplicationContext(AppConfig.class);
//
//    private static UserService userService = context.getBean(UserService.class);
//
//    public static void main(String[] args) {
//
//
//        User andrew = new User("Andrew", "WoodPecker", "paravozik@mail.ru");
//        User alex = new User("Alex", "Bekker", "chuchu@mail.ru");
////        System.out.println(userService.show(1L));
////        userService.update(1L, andrew);
////        print(1L);
//        userService.save(alex);
//        System.out.println(userService.index());
//
//        userService.delete(1L);
//
//        userService.index();
//
//
//        context.close();
//    }
//
//    static void print(Long id) {
//        System.out.println(userService.show(id));
//    }
//}
