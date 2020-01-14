public class ShowNotify {

    public static void readyRace () {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
    }

    public static void startRace () {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
    }

    public static void finishRace () {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }

    public static void getingPrepared (Car car) {
        System.out.println(car.getName() + " готовится");
    }

    public static void isReady (Car car) {
        System.out.println(car.getName() + " готов!");
    }

    public static void startedStage (Car car, Stage stage) {
        System.out.println(car.getName() + " начал этап: " + stage.getDescription());
    }

    public static void waitingStage (Car car, Stage stage) {
        System.out.println(car.getName() + " готовится к этапу(ждет): " + stage.getDescription());
    }

    public static void finishedStage (Car car, Stage stage) {
        System.out.println(car.getName() + " закончил этап: " + stage.getDescription());
    }

    public static void showExeption (String message) {
        System.err.print(message);
    }
}