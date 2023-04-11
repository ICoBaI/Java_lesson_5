import java.util.*;


public class DuplicateNames {
    private static String[] names = new String[]{
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Иван Иванов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Иван Иванов",
                "Мария Рыкова",
                "Анна Крутова",
                "Марина Лугова",
                "Анна Владимирова",
                "Петр Лыков",
                "Иван Мечников",
                "Петр Петин",
                "Петр Лыков",
                "Иван Ежов"
            };
    
    public static void Run() {
        Map<String, Integer> nameTop = new HashMap<>();
        for (String nameFull : names) {
        String lastName = nameFull.split(" ")[0].toLowerCase();
        nameTop.put(lastName, nameTop.get(lastName) == null ? 1 : nameTop.get(lastName) + 1);
    }
    List<Integer> ratingOfNames = new ArrayList<>(nameTop.values());
    ratingOfNames.removeIf(x -> x <= 1);
    Collections.sort(ratingOfNames, Collections.reverseOrder());
    for (int rating : ratingOfNames) {
        for (var name : nameTop.entrySet()) {
            if (name.getValue() == rating)
            System.out.println(name.getKey().substring(0,1).toUpperCase() + name.getKey().substring(1) + " встречается " + name.getValue() + " раз(а)");
        }
        }
    }
    public static void main(String[] args) {
        DuplicateNames.Run();
        }
}
